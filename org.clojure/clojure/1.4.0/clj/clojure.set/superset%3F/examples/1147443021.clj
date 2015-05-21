(require '[clojure.set :refer [superset?]])
;; => nil

(superset? #{0} #{0})
;; => true

(superset? #{0 1} #{0})
;; => true

(superset? #{0} #{0 1}) 
;; => false
