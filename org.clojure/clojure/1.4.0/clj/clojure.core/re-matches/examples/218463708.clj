;; Regex match flags can be embedded in the regex string.  So, we can convert
;; the normal case-sensitive matching into case-insensitive matching.

(re-matches #"hello" "HELLO")       ; case-sensitive
;; => nil

(re-matches #"(?i)hello" "hello")   ; case-insensitive
;; => "hello"

(re-matches #"(?i)hello" "HELLO")   ; case-insensitive
;; => "HELLO"

(re-matches #"(?i)HELLO" "heLLo")   ; case-insensitive
;; => "heLLo"
