(last [1 2 3 4 5])
;; => 5

(last ["a" "b" "c" "d" "e"])
;; => "e"

(last {:one 1 :two 2 :three 3})
;; => [:three 3]

(last [])
;; => nil
