;; Create a promise
(def p (promise))
;; => #'user/p ; p is our promise

;; Check if was delivered/realized
(realized? p)
;; => false ; No yet

;; Delivering the promise
(deliver p 42)
;; => #<core$promise$reify__5727@47122d: 42>

;; Check again if it was delivered
(realized? p)
;; => true ; Yes!

;; Deref to see what has been delivered
@p
;; => 42

;; Note that @ is shorthand for deref
(deref p)
;; => 42
