;; Use of `->` (the "thread-first" macro) can help make code
;; more readable by removing nesting. It can be especially
;; useful when using host methods:

;; Arguably a bit cumbersome to read:
(first (.split (.replace (.toUpperCase "a b c d")
                         "A"
                         "X")
               " "))
;; => "X"

;; Perhaps easier to read:
(-> "a b c d" 
    .toUpperCase 
    (.replace "A" "X") 
    (.split " ") 
    first)
;; => "X"

;; It can also be useful for pulling values out of deeply-nested
;; data structures:
(def person 
  {:name "Mark Volkmann"
   :address {:street "644 Glen Summit"
             :city "St. Charles"
             :state "Missouri"
             :zip 63304}
   :employer {:name "Object Computing, Inc."
              :address {:street "12140 Woodcrest Dr."
                        :city "Creve Coeur"
                        :state "Missouri"
                        :zip 63141}}})
;; => #'user/person

(-> person :employer :address :city)
;; => "Creve Coeur"

;; same as above, but with more nesting
(((person :employer) :address) :city)
;; => "Creve Coeur"

;; Note that this operator (along with ->>) has at times been
;; referred to as a 'thrush' operator.

;; From http://clojure-examples.appspot.com/clojure.core/-%3E
