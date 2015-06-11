;; Calculate the sum of all numbers under 1000:
(reduce + (take-while (partial > 1000) (iterate inc 0)))
;; => 499500
