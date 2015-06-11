(read-string "1.1")          
;; => 1.1

(read-string "1.1.1 (+ 1 1)")
;; => java.lang.RuntimeException: java.lang.NumberFormatException: Invalid number: 1.1.1 (NO_SOURCE_FILE:0)

(read-string "(+ 1 1)")
;; => (+ 1 1)
