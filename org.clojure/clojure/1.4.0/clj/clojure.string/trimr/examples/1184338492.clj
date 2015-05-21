(require '[clojure.string :refer [trimr]])
;; => nil

(trimr "        my string         ")
;; => "        my string"
