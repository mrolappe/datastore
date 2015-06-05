;; `contains?` is straightforward for maps:
(contains? {:a 1} :a)
;; => true

(contains? {:a nil} :a)
;; => true

(contains? {:a 1} :b)
;; => false

;; It's likely to surprise you for other sequences because it's 
;; about *indices*, not *contents*:
(contains? [:a :b :c] :b)
;; => false

(contains? [:a :b :c] 2)
;; => true

(contains? "f" 0)
;; => true

(contains? "f" 1)
;; => false

;; It can be applied to non-sequences:
(contains? 5 3)
;; => false

;; Although lists are sequences, `contains?` seems to always return
;; `false` for them. (Clojure 1.1)
;;
;; Note, this no longer works in Clojure 1.5, throwing an 
;; IllegalArgumentException.
(contains? '(1 2 3) 1)
;; => false

