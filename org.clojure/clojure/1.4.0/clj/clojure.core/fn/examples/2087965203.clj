;; the shortcut form for (fn [arg1 arg2 ...] (...)) is #(...)
;; where parameters are referred by their index with the prefix %
;; and the number of argN depends on how many %N you have in the body

;; the equivalent of 
((fn [a b c] (+ a b c)) 2 4 6)
;; => 12

;; is
(#(+ %1 %2 %3) 2 4 6)
;; => 12
