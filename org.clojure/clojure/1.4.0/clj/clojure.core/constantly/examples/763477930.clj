(def boring (constantly 10))
;; => #'user/boring

(boring 1 2 3)
;; => 10

(boring)
;; => 10

(boring "Is anybody home?")
;; => 10
