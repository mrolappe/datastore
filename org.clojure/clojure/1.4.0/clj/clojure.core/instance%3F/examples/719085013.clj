(instance? Long 1)
;; => true

(instance? Integer 1)
;; => false

(instance? Number 1)
;; => true

(instance? String 1)
;; => false

(instance? String "1")
;; => true
