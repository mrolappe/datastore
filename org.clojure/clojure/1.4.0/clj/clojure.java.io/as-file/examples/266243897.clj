(require '[clojure.java.io :refer [as-file]])

(.exists (as-file "myfile.txt"))
;; => false
