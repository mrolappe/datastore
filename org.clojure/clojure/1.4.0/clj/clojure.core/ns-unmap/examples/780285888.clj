(def foo 1)
;; => #'user/foo

foo
;; => 1

(ns-unmap 'user 'foo) ; explicit
;; => nil

(ns-unmap *ns* 'foo) ; convenient
;; => nil

foo
;; => "Unable to resolve symbol: foo in this context"
