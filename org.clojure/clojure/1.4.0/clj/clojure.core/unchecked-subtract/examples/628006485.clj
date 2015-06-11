;; can't interchange INTs with LONGs, only F(int, int) or F(long, long)
;; F is a function, not an
;; overflow very easily as shown below.

(unchecked-subtract Long/MIN_VALUE 5555555554)
;; => 9223372031299220254

(unchecked-subtract Long/MIN_VALUE 1)
;; => java.lang.IllegalArgumentException: No matching method found: unchecked_subtract (NO_SOURCE_FILE:0)

(unchecked-subtract Long/MIN_VALUE Long/MIN_VALUE)
;; => 0

(unchecked-subtract Integer/MIN_VALUE Long/MIN_VALUE)
;; => java.lang.IllegalArgumentException: No matching method found: unchecked_subtract (NO_SOURCE_FILE:0)

(unchecked-subtract Integer/MIN_VALUE Integer/MIN_VALUE)
;; => 0

(unchecked-subtract Integer/MIN_VALUE 0)
;; => -2147483648

(unchecked-subtract Integer/MIN_VALUE 1)
;; => 2147483647

(unchecked-subtract Integer/MIN_VALUE 54444444)
;; => 2093039204

(unchecked-subtract 123456 654321)
;; => -530865
