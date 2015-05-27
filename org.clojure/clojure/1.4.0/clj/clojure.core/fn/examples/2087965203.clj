;; the shortcut form for (fn ) is #( )
;; where parameters are referred by their index with the prefix %

;; the equivalent of 
((fn [a b c] (+ a b c)) 2 4 6)
;; => 12

;; is
(#(+ %1 %2 %3) 2 4 6)
;; => 12
