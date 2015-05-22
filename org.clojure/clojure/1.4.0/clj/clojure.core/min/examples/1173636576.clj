;; If elements are already in a sequence, use apply
(apply min [1 2 3 4 3])
;; => 1

(apply min '(4 3 5 6 2))
;; => 2
