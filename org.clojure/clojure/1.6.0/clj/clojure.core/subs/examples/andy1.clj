(subs "abcdef" 1 3)
;; => "bc"

(subs "abcdef" 1)
;; => "bcdef"

(subs "abcdef" 4 6)
;; => "ef"

(subs "abcdef" 4 7)
;; => StringIndexOutOfBoundsException String index out of range: 7  java.lang.String.substring (String.java:1907)

;; Fractional indexes aren't meaningful. As a result, args converted to ints by
;; rounding down, giving the indexes 1 and 6.
(subs "abcdef" 5/3 6.28)
;; => "bcdef"
