;; Note how we always use the return value of disj! and conj! in these examples
;; for all future modifications, rather than (incorrectly) ignoring the return
;; value and continuing to modify the original transient set.  See examples for
;; assoc! and dissoc! for more discussion and examples of this.

(def foo (transient #{'pore-pore 'slow 'yukkuri}))
;; => #'user/foo

(count foo)
;; => 3

(def foo (disj! foo 'yukkuri))
;; => #'user/foo

foo
;; => #<TransientHashSet clojure.lang.PersistentHashSet$TransientHashSet@3bd840d9>

(count foo)
;; => 2

(def foo (conj! foo 'yukkuri))
;; => #'user/foo

foo
;; => #<TransientHashSet clojure.lang.PersistentHashSet$TransientHashSet@3bd840d9>

(count foo)
;; => 3

(def foo (persistent! foo))
;; => #'user/foo

foo
;;=> #{yukkuri slow pore-pore}
