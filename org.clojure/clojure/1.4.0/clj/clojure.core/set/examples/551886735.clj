;; returns distinct elements
(set '(1 1 2 3 2 4 5 5))
;; => #{1 2 3 4 5}

;; returns distinct elements (different nomenclature)
(set [1 1 2 3 2 4 5 5])
;; => #{1 2 3 4 5}

(set [1 2 3 4 5])  
;; => #{1 2 3 4 5}

(set "abcd")
;; => #{\a \b \c \d}

(set '("a" "b" "c" "d"))
;; => #{"a" "b" "c" "d"}

(set {:one 1 :two 2 :three 3})
;; => #{[:two 2] [:three 3] [:one 1]}
