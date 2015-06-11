;; Count lines of a file (loses head):
(with-open [rdr (clojure.java.io/reader "/etc/passwd")]
  (count (line-seq rdr)))
;; => 16
