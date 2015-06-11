;; As of Clojure 1.3, vars need to be explicitly marked as ^:dynamic in order for
;; them to be dynamically rebindable:

(def ^:dynamic x 1)
;; => #'user/x

(def ^:dynamic y 1)
;; => #'user/y

(+ x y)
;; => 2

;; Within the scope of the binding, x = 2 and y = 3

(binding [x 2 y 3]
  (+ x y))
;; => 5

;; But once you leave the binding's scope, x and y maintain their original
;; bindings:

(+ x y)
;; => 2
