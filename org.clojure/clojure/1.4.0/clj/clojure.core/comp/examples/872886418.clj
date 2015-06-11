(def negative-quotient (comp - /))
;; => #'user/negative-quotient

(negative-quotient 8 3)           
;; => -8/3

(def concat-and-reverse (comp (partial apply str) reverse str)) 
;; => #'user/concat-and-reverse

(concat-and-reverse "hello" "clojuredocs")
;; => "scoderujolcolleh"
