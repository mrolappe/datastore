(defn foo [a b c]
  (* a b c))
;; => #'user/foo

(foo 1 2 3)
;; => 6

(defn bar [a b & [c]]
  (if c
    (* a b c)
    (* a b 100)))
;; => #'user/bar

(bar 5 6)
;; => 3000

(bar 5 6 2)
;; => 60

(defn baz [a b & {:keys [c d] :or {c 10 d 20}}]
  (* a b c d))
;; => #'user/baz

(baz 2 3)
;; => 1200

(baz 2 3 :c 5)
;; => 600

(baz 2 3 :c 5 :d 6)
;; => 180

(defn boo [a b & {:keys [c d] :or {c 10 d 20} :as all-specified}]
  (println all-specified)
  (* a b c d))
;; => #'user/boo

(boo 2 3)
;; > nil
;; => 1200

(boo 2 3 :c 5)
;; > {:c 5}
;; => 600

(boo 1 2 :d 3 :c 4)
;; > {:c 4, :d 3}
;; => 24
