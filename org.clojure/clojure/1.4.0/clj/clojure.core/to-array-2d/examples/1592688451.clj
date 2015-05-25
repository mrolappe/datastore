(def a (to-array-2d [[1 2 3][4 5 6]]))
;; => #'user/a

(alength a)
;; => 2

(alength (aget a 0))
;; => 3

(aget a 0 0)
;; => 1

(aget a 0 1)
;; => 2

(aget a 0 2)
;; => 3

(aget a 1 0)
;; => 4

(aget a 2 0)
;; => ERROR
