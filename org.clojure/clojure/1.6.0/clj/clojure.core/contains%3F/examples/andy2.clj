;; key :a is in the map
(contains? {:a "a" nil "nil"} :a)   
;; => true

;; :b is not

(contains? {:a "a" nil "nil"} :b)  
;; => false

;; nil is a key here

(contains? {:a "a" nil "nil"} nil)  
;; => true

;; but not here

(contains? {:a "a"} nil)
;; => false
