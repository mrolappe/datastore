;; Base case for reduce, the set union monoid has the base case of the
;; empty set.
(union)
;; => #{}

;; The single arity case for reduce, the union of a set with the
;; 0-argument union is the union of the empty set with a set which is
;; the input set.
(union #{1 2})
;; => #{1 2}

(union #{1 2} #{2 3})
;; => #{1 2 3}

;; As is common in clojure multiple arguments are handled with an
;; implicit reduce over the args > 2.
(union #{1 2} #{2 3} #{3 4})
;; => #{1 2 3 4}
