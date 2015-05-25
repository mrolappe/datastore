(def foo (transient [1 2 3]))
;; => #'user/foo

foo
;; => #<TransientVector clojure.lang.PersistentVector$TransientVector@12c9b4d1>

(persistent! foo)
;; => [1 2 3]

foo
;; => #<TransientVector clojure.lang.PersistentVector$TransientVector@12c9b4d1>

(conj! foo 4)
;; => ERROR:Transient used after persistent! call

(persistent! foo)
;; => ERROR: Transient used after persistent! call
