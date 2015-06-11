(and true true)
;; => true

(and true false)
;; => false

(and false false)
;; => false

(and '() '())
;; => ()

(and '[] '[])
;; => []

(and 0 1)  ; Note that this is *not* bitwise 'and'
;; => 1

(and 1 0)
;; => 0

(and (constantly true) (> 2 1))
;; => true
