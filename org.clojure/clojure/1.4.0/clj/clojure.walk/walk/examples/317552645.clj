(use 'clojure.walk)
;; => nil

(walk #(* 2 %) #(apply + %) [1 2 3 4 5])
;; => 30

(walk second #(apply max %) [ [1 2] [3 4] [5 6] ])
;; => 6

(walk first #(apply max %) [ [1 2] [3 4] [5 6] ])
;; => 5

(walk first reverse [ [1 2] [3 4] [5 6] ])
;; => (5 3 1)
