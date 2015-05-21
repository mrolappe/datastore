(take 5 (cycle ["a" "b"]))
;; => ("a" "b" "a" "b" "a")

(take 10 (cycle (range 0 3)))
;; => (0 1 2 0 1 2 0 1 2 0)

