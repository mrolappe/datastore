(find-var 'map)
;; => IllegalArgumentException Symbol must be namespace-qualified  clojure.lang.Var.find (Var.java:150)

(find-var 'clojure.core/map)
;; => #'clojure.core/map

(find-var 'clojure.core/qwerty)
;; => nil
