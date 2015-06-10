;; these two functions are equivalent 

(take 5 (repeatedly #(rand-int 11)))
;; => (6 6 3 9 8)

(repeatedly 5 #(rand-int 11))
;; => (1 8 6 9 6)

;; compare with repeat
(repeat 5 (rand-int 100))
;; => (94 94 94 94 94)
