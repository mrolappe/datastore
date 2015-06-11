(vector? [1 2 3])
;; => true

(vector? '(1 2 3))
;; => false

(vector? (vec '(1 2 3)))
;; => true
