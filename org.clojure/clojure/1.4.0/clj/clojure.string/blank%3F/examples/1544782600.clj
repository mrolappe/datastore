(require '[clojure.string :refer [blank?]])
;; => nil

(blank? nil)
;; => true

(blank? false)
;; => true

(blank? "   ")
;; => true

(blank? " a ")
;; => false
