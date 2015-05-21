(def x (atom 10))
;; => #'user/x

@x
;; => 10

(reset! x 20)
;; => 20

@x
;; => 20
