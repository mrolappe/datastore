(> 1 2)
;; => false

(> 2 1)
;; => true

(> 2 2)
;; => false

(> 6 5 4 3 2)
;; => true

(sort > (vals {:foo 5, :bar 2, :baz 10}))
;; => (10 5 2)
