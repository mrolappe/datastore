(def hundred-times (partial * 100))
;; => #'user/hundred-times

(hundred-times 5)
;; => 500

(hundred-times 4 5 6)
;; => 12000

(def add-hundred (partial + 100))
;; => #'user/add-hundred

(add-hundred 5)
;; => 105
