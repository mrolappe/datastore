;; create an array of 10 ints and set one of the values to 31415

(def is (int-array 10))
;; => #'user/is

(vec is)
;; => [0 0 0 0 0 0 0 0 0 0]

(aset-int is 3 31415)
;; => 31415

(vec is)
;; => [0 0 0 31415 0 0 0 0 0 0]
