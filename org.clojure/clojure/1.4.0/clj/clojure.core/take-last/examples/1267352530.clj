(take-last 2 [1 2 3 4])
;; => (3 4)

(take-last 2 [4])
;; => (4)

(take-last 2 [])
;; => nil

(take-last 2 nil)
;; => nil
