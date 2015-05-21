(require '[clojure.string :refer [triml]])
;; => nil

(triml "        my string         ")
;; => "my string         "
