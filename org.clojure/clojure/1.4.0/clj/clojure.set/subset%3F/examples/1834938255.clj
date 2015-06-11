(require '[clojure.set :refer [subset?]])
;; => nil

(subset? #{2 3} #{1 2 3 4})
;; => true

(subset? #{2 4} #{1 2 3 4})
;; => true

(subset? #{2 5} #{1 2 3 4})
;; => false
