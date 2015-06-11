;; same as (+ 1 2)
(apply + [1 2])
;; => 3

;; same as (+ 1 2 3 4 5 6)

(apply + 1 2 [3 4 5 6])   
;; => 21

;; same as (+)

(apply + [])
;; => 0
