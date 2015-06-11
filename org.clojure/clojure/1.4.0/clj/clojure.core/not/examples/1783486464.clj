(not true)
;; => false

(not false)
;; => true
;; acts as complement of `boolean`

(boolean "a string")
;; => true

(not "a string")
;; => false

(boolean 1)
;; => true

(not 1)
;; => false
