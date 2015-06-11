(flatten [1 [2 3]])
;; => (1 2 3)

(flatten '(1 2 3))
;; => (1 2 3)

(flatten '(1 2 [3 (4 5)])) 
;; => (1 2 3 4 5)

(flatten nil)
;; => ()

;; Attention with stuff which is not a sequence
(flatten 5)
;; => ()

(flatten {:name "Hubert" :age 23})
;; => ()

;; Workaround for maps
(flatten (seq {:name "Hubert" :age 23}))
;; => (:name "Hubert" :age 23)
