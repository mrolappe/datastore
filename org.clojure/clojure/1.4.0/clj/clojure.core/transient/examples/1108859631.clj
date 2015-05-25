(def foo (transient [1 2 3]))
;; => #'user/foo

(get foo 0)
;; => 1

(count foo)
;; => 3

(nth foo 0)
;; => 1

(def bar (transient {:honda 7 :kagawa 23 :ienaga 14}))
;; => #'user/bar

(get bar :kagawa)
;; => 23

(count bar)
;; => 3

;; There is a known bug in Clojure 1.3 where contains? always returns false for
;; transients.  http://dev.clojure.org/jira/browse/CLJ-700
;; contains? works fine for persistent data structures.
(contains? bar :kagawa)  ; Caution! 
;; => false

(def bar2 (persistent! bar))
;; => #'user/bar2

(contains? bar2 :kagawa) ; Caution!
;; => true
