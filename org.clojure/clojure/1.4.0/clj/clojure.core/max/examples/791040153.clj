;; If elements are already in a sequence, use apply
(apply max [1 2 3 4 3])
;; => 4

(apply max '(4 3 5 6 2))
;; => 6
