;; Testing for thrown exceptions. Verifies that the specified exception is
;; thrown
(is (thrown? ArithmeticException (/ 1 0)))

;; Verified that the exception is thrown, and that the error message matches the
;; specified regular expression.
(is (thrown-with-msg? ArithmeticException #"Divide by zero" (/ 1 0)))

