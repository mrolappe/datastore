(def x (promise))
;; => #'user/x

;; Dereferencing a promise blocks on a value being delivered to that promise. So
;; trying to deref x at this point will make your repl wait forever since
;; nothing has been delivered to x yet.

(deliver x 100)
;; => #<core$promise$reify__5534@4369a50b: 100>

;; x has now had a value delivered, so we can dereference it and we expect to
;; get back the 100 we delivered..

@x
;; => 100

