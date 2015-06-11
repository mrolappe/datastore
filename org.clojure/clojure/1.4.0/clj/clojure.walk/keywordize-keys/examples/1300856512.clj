(require '[clojure.walk :refer [keywordize-keys]])
;; => nil

(keywordize-keys {"a" 1 "b" 2})
;; => {:a 1 :b 2}
