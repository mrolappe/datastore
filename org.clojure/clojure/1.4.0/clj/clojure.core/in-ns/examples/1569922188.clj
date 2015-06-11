;; Let's create new namespace, create new variable in it, then access it from another namespace

;; create the namespace and switch to it
(in-ns 'first-namespace)
;; => #<Namespace first-namespace>

;; create a variable and check it
(def my-var "some value")
;; => #'first-namespace/my-var
my-var
;; => "some value"

;; create another namespace and switch to this one
(in-ns 'second-namespace)
;; => #<Namespace second-namespace>

;; use variable from the other namespace here
first-namespace/my-var
;; => "some value"
