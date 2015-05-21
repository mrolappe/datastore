(use 'clojure.walk)
;; => nil

(macroexpand-all '(-> c (+ 3) (* 2)))
;; => (* (+ c 3) 2)
