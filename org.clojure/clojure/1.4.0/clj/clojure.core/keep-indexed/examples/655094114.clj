(defn position [x coll & {:keys [from-end all] :or {from-end false all false}}]
  (cond
    (true? from-end) (last (keep-indexed #(if (= x %2) %1) coll))
    (true? all) (keep-indexed #(if (= x %2) %1) coll)
    :else (first (keep-indexed #(if (= x %2) %1) coll))))

(position [1 1] [[1 0] [1 1] [2 3] [1 1]])
;; => 1

(position [1 1] [[1 0] [1 1] [2 3] [1 1]] :from-end true)
;; => 3

(position [1 1] [[1 0] [1 1] [2 3] [1 1]] :all true)
;; => (1 3)

(def foo (shuffle (range 10)))
;; => #'user/foo

foo
;; => (5 8 9 1 2 7 0 6 3 4)

(position 5 foo)
;; => 0

(position 0 foo)
;; => 6
