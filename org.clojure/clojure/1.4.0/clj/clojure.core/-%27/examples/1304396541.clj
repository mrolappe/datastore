(def c 5)
;; => #'user/c

(-> c (+ 3) (/ 2) (- 1))                          
;; => 3

;; and if you are curious why
(use 'clojure.walk)
;; => nil

(macroexpand-all '(-> c (+ 3) (/ 2) (- 1)))
;; => (- (/ (+ c 3) 2) 1)
