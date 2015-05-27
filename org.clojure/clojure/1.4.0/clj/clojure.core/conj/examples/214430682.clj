(conj [1 2 3] 4)
;; => [1 2 3 4]

(conj '(1 2 3) 4)
;; => (4 1 2 3)

(conj ["a" "b" "c"] "d")
;; => ["a" "b" "c" "d"]

(conj [1 2] 3 4)               
;; => [1 2 3 4]

(conj [[1 2] [3 4]] [5 6])       
;; => [[1 2] [3 4] [5 6]]

;; Maps only take vectors of length exactly 2
(conj {1 2, 3 4} [5 6])
;; => {5 6, 1 2, 3 4}

(conj {:firstname "John" :lastname "Doe"} {:age 25 :nationality "Chinese"})
;; => {:nationality "Chinese", :age 25, :firstname "John", :lastname "Doe"}

;; conj on a set
(conj #{1 3 4} 2)
;; => #{1 2 3 4}

