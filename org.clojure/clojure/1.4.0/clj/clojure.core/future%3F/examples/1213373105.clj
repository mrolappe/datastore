(def f (future (inc 0)))
;; => #'user/f

(future? f)
;; => true

(future? 1)
;; => false

;; deref gets the value (result) of a future
(deref f)
;; => 1

;; the @ reader macro expands to deref
@f
;; => 1
