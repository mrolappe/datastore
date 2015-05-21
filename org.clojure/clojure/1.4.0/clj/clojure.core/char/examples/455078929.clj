;; can coerce an int (or similar)
(char 97)
;; => \a

;; a byte can be coerced to a char
(let [bytes-array (.getBytes "abc")]
  (char (first bytes-array)))
;; => \a

;; char is just a function
(map char [65 66 67 68])
;; => (\A \B \C \D)
