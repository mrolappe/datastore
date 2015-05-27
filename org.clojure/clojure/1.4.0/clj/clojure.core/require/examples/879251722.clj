;; alias clojure.java.io as io
(require '[clojure.java.io :as io])
;; => nil

(io/file "Filename")
;; => #<File Filename>

;; alias clojure.java.io as io using prefixes
(require '(clojure.java [io :as io2]))
;; => nil

(io2/file "Filename")
;; => #<File Filename>
