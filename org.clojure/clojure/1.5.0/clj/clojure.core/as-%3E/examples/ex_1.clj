(as-> [1 2 3] v
  (cons 0 v)     ;; v is (0 1 2 3)
  (concat v [4]) ;; v is (0 1 2 3 4)
  (second v))    ;; => 1
;; => 1
