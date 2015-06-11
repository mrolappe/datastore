;; create the namespace and switch to it
(in-ns 'demo.ns)
;; => #<Namespace demo.ns>

;; Make sure all of the good stuff in clojure.core is usable here, too.
(clojure.core/use 'clojure.core)
;; => nil

;; define some public functions
(defn public-fn1 [x y] (+ x y))
;; => #'demo.ns/public-fn1

(defn public-fn2 [t] (* t t t))
;; => #'demo.ns/public-fn2

;; define a private function with defn-
(defn- private-fn [s] (/ s 5))
;; => #'demo.ns/private-fn

;; Switch back to the user namespace
(in-ns 'user)
;; => #<Namespace user>

;; Get a map of all intern mappings for namespace demo.ns
(ns-interns 'demo.ns)
;; => {public-fn1 #'demo.ns/public-fn1,
;;     private-fn #'demo.ns/private-fn,
;;     public-fn2 #'demo.ns/public-fn2}

;; Now get a map of only the public mappings.  No private-fn here.
(ns-publics 'demo.ns)
;; => {public-fn1 #'demo.ns/public-fn1,
;;     public-fn2 #'demo.ns/public-fn2}
