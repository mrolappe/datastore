;; 'get' is not the only option
(def my-map {:a 1 :b 2 :c 3})
;; => #'user/my-map

;; maps act like functions
(my-map :a)
;; => 1

;; even keys act like functions
(:b my-map)
;; => 2
