(require '[clojure.java.shell :refer [sh]])
;; => nil

;; note that the options, like :in, have to go at the end of arglist
;; advantage of piping-in thru stdin is less need for quoting/escaping
(println (:out (sh "cat" "-" :in "Printing input from stdin with funny chars like ' \" $@ & ")))
;; > Printing input from stdin with funny chars like ' " $@ & 
;; = nil
