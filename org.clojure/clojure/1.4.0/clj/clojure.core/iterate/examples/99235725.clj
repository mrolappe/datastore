;; iterate Ad Infinitum starting at 5 using the inc (increment) function
(iterate inc 5)
;; => (5 6 7 8 9 10 11 12 13 14 15 ... n

;; limit results
(take 5 (iterate inc 5))
;; => (5 6 7 8 9)

(take 10 (iterate (partial + 2) 0))
;; => (0 2 4 6 8 10 12 14 16 18)

(take 20 (iterate (partial + 2) 0))
;; => (0 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38)

