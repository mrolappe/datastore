(defn pos-neg-or-zero
  "Determines whether or not n is positive, negative, or zero"
  [n]
  (cond
    (< n 0) "negative"
    (> n 0) "positive"
    :else "zero"))

(pos-neg-or-zero 5)
;; => "positive"

(pos-neg-or-zero -1)
;; => "negative"

(pos-neg-or-zero 0)
;; => "zero"
