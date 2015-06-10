;; create a long array using long-array and show it can be used
;; with the standard Java Arrays functions binarySearch and fill
;; note the needed coercions

(def is (long-array (range 3 20)))
;; => #'user/is

(vec is)
;; => [3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19]

(java.util.Arrays/binarySearch is (long 10))
;; => 7

(java.util.Arrays/fill is 3 8 (long 99))
;; => nil

(vec is)
;; => [3 4 5 99 99 99 99 99 11 12 13 14 15 16 17 18 19]
