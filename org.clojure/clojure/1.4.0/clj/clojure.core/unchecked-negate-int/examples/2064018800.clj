(unchecked-negate-int 4)
;; => -4

(unchecked-negate-int 0)
;; => 0

(unchecked-negate-int -7)
;; => 7

(unchecked-negate-int Integer/MAX_VALUE)
;; => -2147483647

(unchecked-negate-int Integer/MIN_VALUE) ;overflow
;; => -2147483648
