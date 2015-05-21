(require '[clojure.string :refer [split-lines]])
;; => nil

(split-lines "test \n string")
;; => ["test " " string"]
