(use 'clojure.test)

;; The testing form creates a bread crumb trail which is printed if a problem
;; occurs while testing. This helps contextualize encountered errors.

(testing "Arithmetic"
  (testing "with positive integers"
    (is (= 4 (+ 2 2)))
    (is (= 7 (+ 3 4))))
  (testing "with negative integers"
    (is (= -4 (+ -2 -2)))
    (is (= -1 (+ 3 -4)))))
;; Prints
;; > Arithmetic with negative integers
;; > expected: (= -5 (+ -2 -2))
;; > actual: (not (= -5 -4))
