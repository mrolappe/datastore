;; create an array of 10 longs and set one of the values to 31415
(def ls (long-array 10))
;; => #'user/ls

(vec ls)
;; => [0 0 0 0 0 0 0 0 0 0]

(aset-long ls 3 31415)
;; => 31415

(vec ls)
;; => [0 0 0 31415 0 0 0 0 0 0]
