;; When the producer function produces a collection, not an element,
;; lazy-cat is usable.
(defn n-repeat [n] (lazy-cat (repeat n n) (n-repeat (inc n))))
;; => #'user/n-repeat

(take 6 (n-repeat 1))
;; => (1 2 2 3 3 3)

(take 12 (n-repeat 1))
;; => (1 2 2 3 3 3 4 4 4 4 5 5)
