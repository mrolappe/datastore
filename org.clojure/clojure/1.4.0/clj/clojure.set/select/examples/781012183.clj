(require '[clojure.core :refer [select]])
;; => nil

(select odd? #{1 2 3})
;; => #{1 3}
