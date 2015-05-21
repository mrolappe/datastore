;; create a file using spit, then show its contents using slurp
;; delete it and verify that it has been deleted by trying to print its
;; contents again

(require '[clojure.java.io :as io])
;; => nil

(spit "stuff.txt" "blurp")
;; => nil

(println (slurp "stuff.txt"))
;; > blurp
;; => nil

(io/delete-file "stuff.txt")
;; => true

(println (slurp "stuff.txt"))
;; > java.io.FileNotFoundException: stuff.txt (The system cannot find the file specified) (NO_SOURCE_FILE:0)
