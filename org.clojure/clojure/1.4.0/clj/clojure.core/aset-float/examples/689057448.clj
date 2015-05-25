;; create an array of 10 floats and set one of the values to 3.1415

(def fs (float-array 10))
;; => #'user/fs

(vec fs)
;; => [0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0]

(aset-float fs 3 3.1415)
;; => 3.1415

(vec fs)
;; => [0.0 0.0 0.0 3.1415 0.0 0.0 0.0 0.0 0.0 0.0]
