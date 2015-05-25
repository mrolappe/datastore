(char-array "asdf")
;; => #<char[] [C@167fc18>

(seq (char-array "asdf"))
;; => (\a \s \d \f)

(seq (char-array 10))
;; => (\^@ \^@ \^@ \^@ \^@ \^@ \^@ \^@ \^@ \^@)
