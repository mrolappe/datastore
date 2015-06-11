(number? 1)
;; => true

(number? 1.0)
;; => true

(number? :a)
;; => false

(number? nil)
;; => false

(number? "23")
;; => false
