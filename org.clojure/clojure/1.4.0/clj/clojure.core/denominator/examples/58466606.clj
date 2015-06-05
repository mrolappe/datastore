;; denominator always returns the denominator of the reduced fraction
;;
(denominator (/ 2 3))
;; => 3

(denominator (/ 3 6))
;; => 2

(map denominator [(/ 3 2) (/ 2 3) (/ 4 5) (/ 4 6)])
;; => (2 3 5 3)
