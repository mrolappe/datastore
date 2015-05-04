(use 'clojure.test)

(deftest addition
  (is (= 4 (+ 2 2)))
  (is (= 7 (+ 3 4))))

(deftest subtraction
  (is (= 1 (- 4 3)))
  (is (= 3 (- 7 4))))

;;composing tests
(deftest arithmetic
  (addition)
  (subtraction))

(run-tests 'testing)
;; Prints
;; > => Testing testing
;; >
;; > Ran 6 tests containing 10 assertions.
;; > 0 failures, 0 errors.
;;
;; => {:type :summary, :test 6, :pass 10, :fail 0, :error 0}
