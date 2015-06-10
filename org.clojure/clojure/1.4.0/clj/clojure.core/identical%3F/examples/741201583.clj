(def x {:foo 1, :bar -3})
;; => #'user/x

(def y {:foo 1, :bar -3})
;; => #'user/y

;; Values are equal, but different objects were constructed
(= x y)
;; => true

(identical? x y)
;; => false
