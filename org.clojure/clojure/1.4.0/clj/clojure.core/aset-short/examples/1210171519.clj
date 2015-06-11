;; create an array of 10 shorts and set one of the values to 31415

(def ss (short-array 10))
;; => #'user/ss

(vec ss)
;; => [0 0 0 0 0 0 0 0 0 0]

(aset-short ss 3 31415)
;; => 31415

(vec ss)
;; => [0 0 0 31415 0 0 0 0 0 0]
