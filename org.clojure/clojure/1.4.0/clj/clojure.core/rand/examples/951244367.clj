;; Test `rand` never returns `n`:
(some (partial <= 10) (take 100000 (repeatedly (fn [] (int (rand 10))))))
;; => nil
