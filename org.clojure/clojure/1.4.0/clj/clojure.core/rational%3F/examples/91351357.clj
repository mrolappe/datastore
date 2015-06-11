(rational? 1)
;; => true

(rational? 1.0)
;; => false

(class 1.0)
;; => java.lang.Double

;; Note that decimal? only returns true if n is a BigDecimal.
