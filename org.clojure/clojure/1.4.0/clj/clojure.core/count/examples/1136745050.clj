(count nil)
;; => 0

(count [])
;; => 0

(count [1 2 3])
;; => 3

(count {:one 1 :two 2})
;; => 2

(count [1 \a "string" [1 2] {:foo :bar}])
;; => 5

(count "string")
;; => 6
