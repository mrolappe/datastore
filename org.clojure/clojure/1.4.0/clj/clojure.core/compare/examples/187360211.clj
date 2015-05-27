;; various examples
;; comparing vectors of different sizes does not work as you may expect
;; the longer vector is always "greater" regardless of contents 

(compare [0 1 2] [0 1 2])
;; => 0

(compare [1 2 3] [0 1 2 3])
;; => -1

(compare [0 1 2] [3 4])
;; => 1

(compare nil [1 2 3])
;; => -1

(compare [1 2 3] nil)
;; => 1

(compare "abc" "def")
;; => -3

(compare "abc" "abd")
;; => -1
