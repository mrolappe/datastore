;; Some equality exceptions noted by AndyF
(= 2 2.0)   ; = has different categories integer and floating point
;; => false
(== 2 2.0)  ; but == sees same numeric value
;; => true
(== 5 5N (float 5.0) (double 5.0) (biginteger 5))
;; => true
(== 5 5.0M) ; this is likely a bug
;; => false
(== Double/NaN Double/NaN)  ; this is normal
;; => false
(== 2 "a")
;; => ClassCastException java.lang.String cannot be cast to java.lang.Number  clojure.lang.Numbers.equiv (Numbers.java:206)
