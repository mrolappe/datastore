;; It is not as useful, but contains? can also determine whether a number
;; lies within the range of defined indices of a vector, string, or Java
;; array.  For strings and Java arrays, it is identical in these cases to
;; (and (0 <= i) (< i (count coll))) where i is equal to (. key intValue).
;; The behavior is the same for vectors, except only integer values
;; can return true.

;; max index for this string is 5
(contains? "abcdef" 5)
;; => true

;; max index for this vector is 2
(contains? [:a :b :c] 1)
;; => true

;; max index for this array is 3
(contains? (int-array [28 35 42 49]) 10)
;; => false
