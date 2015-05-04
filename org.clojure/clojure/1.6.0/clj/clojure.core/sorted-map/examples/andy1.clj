(def births
  (sorted-map -428 "Plato"
              -384 "Aristotle"
              -469 "Socrates"
              -320 "Euclid"
              -310 "Aristarchus"
              90   "Ptolemy"
              -570 "Pythagoras"
              -624 "Thales"
              -410 "Eudoxus"))
;; => #'user/births

;; Mapping types are sequences on their key/value pairs, so what's the first pair?
(first births)
;; => [-624 "Thales"]

;; We can take several pairs as well..
(take 4 births)
;; => ([-624 "Thales"]
;;     [-570 "Pythagoras"]
;;     [-469 "Socrates"]
;;     [-428 "Plato"])

;; Keys works the same as on any other map, giving the values mapped to in the
;; mapping.
(keys births)
;; => (-624 -570 -469 -428
;;     -410 -384 -320 -310
;;     90)

;; Also as in any other map type, vals works the same giving the (in this case
;; sorted) seq of mapped values.
(vals births)
;; => ("Thales"
;;     "Pythagoras"
;;     "Socrates"
;;     "Plato"
;;     "Eudoxus"
;;     "Aristotle"
;;     "Euclid"
;;     "Aristarchus"
;;     "Ptolemy")

;; subseq and rsubseq return a sequence of all key/value pairs with a specified
;; range of keys.  It takes O(log N) to find the first pair, where N is the size
;; of the whole map, and O(1) time for each additional pair, so it is more
;; efficient than the O(N) approach of taking the entire sequence and filtering
;; out the unwanted pairs.
(subseq births > -400)
;; => ([-384 "Aristotle"]
;;     [-320 "Euclid"]
;;     [-310 "Aristarchus"]
;;     [90 "Ptolemy"])

(subseq births > -400 < -100)
;; => ([-384 "Aristotle"]
;;     [-320 "Euclid"]
;;     [-310 "Aristarchus"])

;; Recall that rsubseq is the reversed subsequence.
(rsubseq births > -400 < -100)
;; => ([-310 "Aristarchus"]
;;     [-320 "Euclid"]
;;     [-384 "Aristotle"])
