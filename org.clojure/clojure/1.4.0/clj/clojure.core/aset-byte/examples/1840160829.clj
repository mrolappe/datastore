;; create an array of 10 bytes and set one of the values to 127

(def bs (byte-array 10))
;; => #'user/bs

(vec bs)
;; => [0 0 0 0 0 0 0 0 0 0]

(aset-byte bs 2 127)
;; => 127

(vec bs)
;; => [0 0 127 0 0 0 0 0 0 0]
