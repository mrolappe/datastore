;; ported from a draft from Rich Hickey (https://gist.github.com/richhickey/3885
(some-> {:a {:b {:c 42}}} :a :b :c)
;; => 42

(some-> {:a {:b {:c 42}}} :a :d .blowup)
;; => nil
;;
;; This expression returns nil because the "no such method" error produced by
;; the .blowup term is suppressed and the result nil is yielded instead.
