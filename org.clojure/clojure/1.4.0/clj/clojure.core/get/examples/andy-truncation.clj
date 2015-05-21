;; Also similar to contains?, 'get' indices are truncated to 32-bit ints,
;; so some large integers that are out of index bounds for a vector,
;; string, or array can be truncated to 32-bit ints that are in range
;; after removing their most significant bits.

(def long-truncates-to-int-0 (bit-shift-left 1 33))
;; => #'user/long-truncates-to-int-0

(get "abc" long-truncates-to-int-0)
;; => \a

(get [:a :b :c] long-truncates-to-int-0)
;; => :a
