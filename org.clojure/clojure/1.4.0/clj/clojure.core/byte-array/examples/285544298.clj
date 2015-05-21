;; create an array of bytes
;; and demonstrate that you can use it in the standard Java fill function
;; note the needed byte coercion in the fill function call

(def bees (byte-array 10))
;; => #'user/bees

(for [i (range 10)](aset-byte bees i (* i i)))
;; => (0 1 4 9 16 25 36 49 64 81)

(vec bees)
;; => [0 1 4 9 16 25 36 49 64 81]

(java.util.Arrays/fill bees (byte 122))
;; => nil

(vec bees)
;; => [122 122 122 122 122 122 122 122 122 122]
