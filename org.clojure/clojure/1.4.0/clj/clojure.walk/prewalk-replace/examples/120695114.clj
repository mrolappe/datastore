(require '[clojure.walk :refer [prewalk-replace]])
;; => nil

(prewalk-replace '{a b} '(c (d a)))
;; => (c (d b))
