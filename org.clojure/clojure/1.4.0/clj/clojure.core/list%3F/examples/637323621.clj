(list? '(1 2 3))
;; => true

(list? (list 1 2))
;; => true

(list? 0)
;; => false

(list? {})
;; => false

(list? [])
;; => false

(list? (range 10))
;; => false
