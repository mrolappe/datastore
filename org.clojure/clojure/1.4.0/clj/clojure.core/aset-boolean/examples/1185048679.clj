;; create an array of 10 booleans and set one value to true
;; using aset-boolean

(def bs (boolean-array 10))
;; => #'user/bs

(vec bs)
;; => [false false false false false false false false false false]

(aset-boolean bs 2 true)
;; => true

(vec bs)
;; => [false false true false false false false false false false]
