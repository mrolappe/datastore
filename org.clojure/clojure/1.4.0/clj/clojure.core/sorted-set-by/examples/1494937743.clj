;; Be cautious about comparison functions that only compare part of
;; the objects:
(defn second-< [x y]
  (< (second x) (second y)))
;; => #'user/second-<

(sorted-set-by second-< [:a 1] [:b 1] [:c 1])
;; => #{[:a 1]}

;; Where did the other elements go?

;; Replacing < with <= might look like a fix, but doesn't work,
;; either:
(defn second-<= [x y]
  (<= (second x) (second y)))
;; => #'user/second-<=

(def s2 (sorted-set-by second-<= [:a 1] [:b 1] [:c 1]))
;; => #'user/s2

s2
;; => #{[:c 1] [:b 1] [:a 1]}

;; So far, so good, but set membership tests can't find the elements.
(contains? s2 [:b 1])
;; => false

(s2 [:c 1])
;; => nil

;; Here is one way to write a good comparison function.  When the two
;; objects are equal in the parts we care about, use the tie-breaker
;; 'compare' on the whole values to give them a consistent order that
;; is only equal if the entire values are equal.
(defn second-<-with-tie-break [x y]
  (let [c (compare (second x) (second y))]
    (if (not= c 0)
      c
      ;; Otherwise we don't care as long as ties are broken
      ;; consistently.
      (compare x y))))
;; => #'user/second-<-with-tie-break

(def s3 (sorted-set-by second-<-with-tie-break [:a 1] [:b 1] [:c 1]))
;; => #'user/s3

s3
;; => #{[:a 1] [:b 1] [:c 1]}

(contains? s3 [:b 1])
;; => true

(s3 [:c 1])
;; => [:c 1]

;; All good now!
