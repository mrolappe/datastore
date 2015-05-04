;; The intValue conversion can lead to unexpected behavior, demonstrated
;; below.  This happens because intValue converts the long and double
;; values shown to 0, which is in the range [0,2] of indices.

(def long-truncates-to-int-0 (bit-shift-left 1 33))

(contains? "abc" long-truncates-to-int-0)
;; => true

(contains? "abc" -0.99)
;; => true

(contains? [:a :b :c] long-truncates-to-int-0)
;; => true

;; only integer values can return true for vectors
(contains? [:a :b :c] 0.5)
;; => false
