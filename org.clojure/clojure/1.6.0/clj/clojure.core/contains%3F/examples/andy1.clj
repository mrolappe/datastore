;; :b is in the set
(contains? #{:a :b 5 nil} :b)
;; => true

;; 2 is not
(contains? #{:a :b 5 nil} 2)
;; => false

;; nil is in this set
(contains? #{:a :b 5 nil} nil)
;; => true

;; but not in this one
(contains? #{:a :b 5} nil)
;; => false
