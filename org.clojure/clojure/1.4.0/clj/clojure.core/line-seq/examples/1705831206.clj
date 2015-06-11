(import '(java.io BufferedReader StringReader))

;; line terminators are stripped
(line-seq (BufferedReader. (StringReader. "1\n2\n\n3")))
;; => ("1" "2" "" "3")

;; empty string gives nil
(line-seq (BufferedReader. (StringReader. "")))
;; => nil
