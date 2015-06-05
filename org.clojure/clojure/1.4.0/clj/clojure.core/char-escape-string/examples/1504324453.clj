;; simple examples

(char-escape-string \newline)
;; => "\\n"

(char-escape-string \c) ; no escape sequence for 'c'
;; => nil

(char-escape-string \tab)
;; => "\\t"

(char-escape-string \backspace)
;; => "\\b"
