(require '[clojure.string :refer [upper-case]])
;; Non-character symbols will be returned back
(upper-case ",.!@#$%^&*()")
;; => ",.!@#$%^&*()"
