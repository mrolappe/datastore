(if-let [x false y true]
  "then"
  "else")
;; => java.lang.IllegalArgumentException: if-let requires exactly 2 forms in binding vector (NO_SOURCE_FILE:1)

(defn if-let-demo [arg]
  (if-let [x arg]
    "then"
    "else"))

(if-let-demo 1) ; anything except nil/false
;; => "then"

(if-let-demo nil)
;; => "else"

(if-let-demo false)
;; => "else"
