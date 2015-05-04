;; Be cautious when using float or double values, due to round-off errors.  This
;; is especially true for range, because these round-off errors can accumulate
;; and increase over a large number of values.
(count (range 0 100 1))
;; => 100

(last (range 0 100 1))
;; => 99

(count (range 0.0 10.0 0.1))
;; => 101

(last (range 0.0 10.0 0.1))
;; => 9.99999999999998
