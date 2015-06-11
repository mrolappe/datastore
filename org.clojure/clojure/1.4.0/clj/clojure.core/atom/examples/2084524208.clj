(def my-atom (atom 0))
;; => #'user/my-atom

@my-atom
;; => 0

(swap! my-atom inc)
;; => 1

@my-atom
;; => 1

(swap! my-atom (fn [n] (* (+ n n) 2)))
;; => 4
