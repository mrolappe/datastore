(require '[clojure.string :refer [trim-newline]])
;; => nil

(clojure.string/trim-newline "test\n\r")
;; => "test"
