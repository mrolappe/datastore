;; constantly returns a function which always returns the same value
(map (constantly 9) [1 2 3])
;; => (9 9 9)

(map (constantly (rand-int 100)) [:a :b :c])
;; => (43 43 43)
