(defmacro plus [n1 n2]
  `(+ ~n1 ~n2))
;; => #'user/plus

(macroexpand-1 '(plus 3 4))
;; => (clojure.core/+ 3 4)

(require '[clojure.pprint :as pp])
;; => nil

(alter-var-root #'pp/*print-suppress-namespaces* (constantly true))
;; => true

(macroexpand-1 '(plus 3 4))
;; => (clojure.core/+ 3 4)

;; comes into effect only in pprint.
(pp/pprint (macroexpand-1 '(plus 3 4)))
;; => (+ 3 4)
