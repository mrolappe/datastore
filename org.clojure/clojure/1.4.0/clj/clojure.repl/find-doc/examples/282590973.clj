(require '[clojure.repl :refer [find-doc]])

(find-doc "data structure")
;; Prints
;; > -------------------------
;; > clojure.core/eval
;; > ([form])
;; >   Evaluates the form data structure (not text!) and returns the result.
;; > -------------------------
;; > clojure.core/ifn?
;; > ([x])
;; >   Returns true if x implements IFn. Note that many data structures
;; > (e.g. sets and maps) implement IFn
;;
;; => nil
