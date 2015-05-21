(require '[clojure.main :refer [demunge]])
;; => nil

(demunge "clojure.core$println")
;; => "clojure.core/println"
