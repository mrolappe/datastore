(require '[clojure.string :as cstr])
;; => nil

(def legal-ref "1321-61")
;; => #'user/legal-ref

(cstr/split legal-ref #"-")
;; => ["1321" "61"]
