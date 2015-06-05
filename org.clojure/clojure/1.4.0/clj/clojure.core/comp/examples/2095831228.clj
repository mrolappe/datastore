(def countif (comp count filter))
;; => #'user/countif

(countif even? [2 3 1 5 4])
;; => 2
