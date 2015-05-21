;; Even though maps, sets, vectors and keywords behave as functions:
({:a 1} :a)
;; => 1

;; fn? still returns false for them because they are not created using fn:
(fn? {:a 1})
;; => false
