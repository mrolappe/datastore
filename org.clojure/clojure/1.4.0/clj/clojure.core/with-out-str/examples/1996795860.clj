;; Instead of printing the following will place the output normally
;; sent to standard out to a string.
(with-out-str (println "this should return as a string"))
;; => "this should return as a string\n"
