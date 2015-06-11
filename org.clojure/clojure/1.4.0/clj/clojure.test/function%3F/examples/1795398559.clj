(require '[clojure.test :refer [function?]])

(defn foo []
  (println "foo"))

(def bar "bar")

(function? foo)
;; => true

(function? bar)
;; => false
