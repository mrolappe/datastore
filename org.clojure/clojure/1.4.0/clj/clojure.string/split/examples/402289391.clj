;; Splits a string on space character and joins 
;; the resulting collection with a line feed character

(require '[clojure.string :only [join split]])
;; => nil

(println
 (join "\n"
       (split "The Quick Brown Fox" #"\s")))
;; > The
;; > Quick
;; > Brown
;; > Fox
;; => nil
