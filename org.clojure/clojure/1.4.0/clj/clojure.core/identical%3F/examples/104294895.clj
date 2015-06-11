(def x 1)
;; => #'user/x

(identical? x x)
;; => true

(identical? x 1)
;; => true

(identical? x 2)
;; => false

(identical? x ((constantly 1) 8))
;; => true

(identical? 'a 'a)
;; => false
