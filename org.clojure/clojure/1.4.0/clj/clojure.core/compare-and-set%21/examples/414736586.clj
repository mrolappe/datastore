(def a (atom 0))
;; => #'user/a

(compare-and-set! a 10 20)
;; => false

@a
;; => 0

(compare-and-set! a 0 10)
;; => true

@a
;; => 10
