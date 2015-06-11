;; Because it is expanded at compile time, you can also use special 
;; forms as in full blown macros:

(require '[clojure.template :refer :all])
;; => nil

(do-template [a b] (def a b) d 1 e 2 f 3)
;; => #'user/f

d
;; => 1

e
;; => 2

f
;; => 3

;; and if you are curious why
(require '[clojure.walk :refer :all])
;; => nil

(macroexpand-all
 '(do-template [a b] (def a b)
               d 1 e 2 f 3))
;; => (do (def d 1) (def e 2) (def f 3))

