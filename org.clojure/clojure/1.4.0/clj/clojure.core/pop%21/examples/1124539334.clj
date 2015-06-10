;; Note how we always use the return value of pop! in these examples
;; for all future modifications, rather than (incorrectly) ignoring the return
;; value and continuing to modify the original transient set.  See examples for
;; assoc! and dissoc! for more discussion and examples of this.

(def foo (transient [1 2 3]))
;; => #'user/foo

(count foo)
;; => 3

(def foo (pop! foo))
;; => #'user/foo

foo
;; => #<TransientVector clojure.lang.PersistentVector$TransientVector@1638fff7>

(count foo)
;; => 2

(def foo (pop! foo))
;; => #'user/foo

(count foo)
;; => 1

(def foo (persistent! foo))
;; => #'user/foo

(count foo)
;; => 1

foo
;; => [1]
