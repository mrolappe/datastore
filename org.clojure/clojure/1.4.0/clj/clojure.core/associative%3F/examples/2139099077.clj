(associative? [1 2 3]) ; vector
;; => true

(associative? '(1 2 3)) ; list
;; => false

(associative? {:a 1 :b 2}) ; map
;; => true

(associative? #{:a :b :c}) ; set
;; => false

(associative? "fred") ; string
;; => false
