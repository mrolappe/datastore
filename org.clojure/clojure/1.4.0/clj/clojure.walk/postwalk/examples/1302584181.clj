(require '[clojure.walk :refer [postwalk]])
;; => nil

;; example of removing namespaces from all keys in a nested data structure
(def thing {:page/tags [{:tag/category "lslsls"}]})
;; => #'user/things

(postwalk #(if (keyword? %) (keyword (name %)) %) thing)
;; => {:tags [{:category "lslsls"}]}
