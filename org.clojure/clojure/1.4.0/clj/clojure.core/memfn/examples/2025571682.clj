(def *files* (file-seq (java.io.File. "/tmp/")))
;; => #'user/*files*

(count (filter (memfn isDirectory) *files*))
;; => 68

(count (filter #(.isDirectory %) *files*))
;; => 68
