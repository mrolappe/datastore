;; You can define namespaced keywords using '::'
(def a :foo)
;; => #'user/a

(def b ::foo)
;; => #'user/b

(ns foo)
;; => Namespace foo

user/a
;; => :foo

user/b
;; => :user/foo

::foo
;; => :foo/foo

(= user/a :foo)
;; => true

(= user/b ::foo)
;; => false

(= user/b :user/foo)
;; => true
