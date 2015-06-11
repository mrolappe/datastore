(def foo (ref {}))
;; => #'user/foo

(dosync
 (ref-set foo {:foo "bar"}))
;; => {:foo "bar"}

@foo
;; => {:foo "bar"}
