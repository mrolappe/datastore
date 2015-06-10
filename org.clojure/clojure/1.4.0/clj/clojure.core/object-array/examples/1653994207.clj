;; create an array of Java Objects using object-array
;; and demonstrate that it can be used with the Java fill function

(def os (object-array [nil 23.2 "abc" 33]))
;; => #'user/os

(vec os)
;; => [nil 23.2 "abc" 33]

(java.util.Arrays/fill os 31415)
;; => nil

(vec os)
;; => [31415 31415 31415 31415]
