;; create an array of shorts using short-array
;; and demonstrate how it can be used with the java Arrays functions
;; (note the needed coercions)

(def ss (short-array (map short (range 3 10))))
;; => #'user/ss

(type ss)
;; => [S

(vec ss)
;; => [3 4 5 6 7 8 9]

(java.util.Arrays/binarySearch ss (short 6))
;; => 3

(java.util.Arrays/fill ss (short 99))
;; => nil

(vec ss)
;; => [99 99 99 99 99 99 99]
