(require '[clojure.walk :refer :all])

;; tryclj.com and lazybot on #clojure get the following wrong
(let [-> inc] ;; rebind the -> symbol locally to the inc function
  (-> 5)) ;; this is now the same as (inc 5)
;; => 6

;; Below macroexpansion is supposed to result in equivalent code to the above
(macroexpand-all '(let [-> inc] (-> 5)))
;; => (let* [-> inc] 5)

;; And now to run the macroexpansion as above...
(let* [-> inc] 5)
;; => 5
;; which clearly is not the same result as above
