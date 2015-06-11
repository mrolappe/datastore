(require '[clojure.java.io :refer [output-stream]])

(defn use-output-stream []
  (with-open [o (output-stream "test.txt")]
    (.write o 65)
    nil))
;; => #'user/use-output-stream

(use-output-stream)
;; => nil

(println
 (slurp "test.txt"))
;; > A
;; => nil
