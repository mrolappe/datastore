(char? \a)
;; => true

(char? 22)
;; => false

(char? "a")
;; => false

(char? (first "abc"))
;; => true
