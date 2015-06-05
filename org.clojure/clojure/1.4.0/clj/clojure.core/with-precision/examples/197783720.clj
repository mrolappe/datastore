;; The "M" suffix denotes a BigDecimal instance
;; http://download.oracle.com/javase/6/docs/api/java/math/BigDecimal.html

(with-precision 10 (/ 1M 6))
;; => 0.1666666667M

(.floatValue 0.1666666667M)
;; => 0.16666667
