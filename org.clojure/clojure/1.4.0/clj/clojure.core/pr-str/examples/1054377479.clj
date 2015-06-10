(def x [1 2 3 4 5])
;; => #'user/x

x
;; => [1 2 3 4 5]

;; Turn that data into a string...
(pr-str x)
;; => "[1 2 3 4 5]"

;; ...and turn that string back into data!
(read-string (pr-str x))
;; => [1 2 3 4 5]
