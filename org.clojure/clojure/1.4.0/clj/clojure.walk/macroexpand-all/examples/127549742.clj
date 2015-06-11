;; differences between macroexpand-1, macroexpand and macroexpand-all

(require '[clojure.pprint :as pp]
         '[clojure.walk :as walk])
;; => nil

(alter-var-root
 #'pp/*print-suppress-namespaces*
 (constantly true))
;; => true

(defmacro plus [n1 n2]
  `(+ ~n1 ~n2))
;; => #'user/plus

(macroexpand-1 '(plus 3 4))
;; => (+ 3 4)

(macroexpand '(plus 3 4))
;; => (+ 3 4)

(defmacro pl [p1 p2]
  `(plus ~p1 ~p2))

;; macroexpand-1 will only expand the first macro, giving the
;; result (plus ...) instead of the fully expanded form of
;; (+ ...). Note that this is different from above as here we have a
;; 2-deep macro and above we had a 1-deep macro.
(macroexpand-1 '(pl 3 4))
;; => (plus 3 4)

;; In comparison macroexpand will do the whole job, and give (+ ...)
(macroexpand '(pl 3 4))
;; => (+ 3 4)

(defmacro minus [m1 m2]
  `(- ~m1 ~m2))

(defmacro calc [c1 c2]
  `(pl ~c1 (minus ~c1 ~c2)))

(macroexpand-1 '(calc 20 30))
;; => (pl 20 (minus 20 30))

(macroexpand '(calc 20 30))
;; => (+ 20 (minus 20 30))

(walk/macroexpand-all '(calc 20 30))
;; => (+ 20 (- 20 30))
