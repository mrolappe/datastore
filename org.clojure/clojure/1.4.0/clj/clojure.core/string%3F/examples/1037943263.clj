(string? \a)
;; => false

(string? "abc")
;; => true

(string? 1)
;; => false

(string? ["a" "b" "c"])
;; => false
