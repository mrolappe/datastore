;; ' is the shortcut for quote
(= 'a (quote a))
;; => true

;; quoting keeps something from being evaluated
(quote (println "foo"))
;; => (println "foo")

*clojure-version*
;; => {:major 1, :minor 5, :incremental 0, :qualifier "RC17"}

(quote)
;; => nil

(quote 1)
;; => 1

(quote 1 2 3 4 5)
;; => 1
