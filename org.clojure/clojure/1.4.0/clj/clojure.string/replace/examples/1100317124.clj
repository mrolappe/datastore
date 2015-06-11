(require '[clojure.string :as s])
;; => nil

(s/replace "The color is red" #"red" "blue")
;; => "The color is blue"
