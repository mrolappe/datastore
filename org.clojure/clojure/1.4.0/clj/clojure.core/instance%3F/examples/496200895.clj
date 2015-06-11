;; Some things are more than what they seem to be at first glance
(instance? clojure.lang.IFn +)
;; => true

(instance? clojure.lang.Keyword :a)
;; => true

(instance? clojure.lang.IFn :a)
;; => true

(instance? clojure.lang.IFn {:a 1})
;; => true
