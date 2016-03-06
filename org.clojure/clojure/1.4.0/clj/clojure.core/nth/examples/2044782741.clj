(nth ["a" "b" "c" "d"] 0)             
;; => "a"

(nth ["a" "b" "c" "d"] 1)             
;; => "b"

(nth [] 0 "nothing found")
;; => "nothing found"

(nth [0 1 2] 77 1337)
;; => 1337
