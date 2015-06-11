(seq? 1)
;; => false

(seq? [1])
;; => false

(seq? (seq [1]))
;; => true
