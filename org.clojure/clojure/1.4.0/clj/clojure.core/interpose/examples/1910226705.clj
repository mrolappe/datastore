;; The quintessential interpose example:
(def my-strings ["one" "two" "three"])
;; => #'user/my-strings

(interpose ", " my-strings)
;; => ("one" ", " "two" ", " "three")

(apply str (interpose ", " my-strings))
;; => "one, two, three"

;; Might use clojure.string/join if the plan is to join
(use '[clojure.string :only (join)])
;; => nil

(join ", " my-strings)
;; => "one, two, three"
