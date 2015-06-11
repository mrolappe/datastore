;; Some equality gotchas related to NaN values and consequents in the
;; behavior of sets as collections of nominally equal objects.
;;
;; See http://en.wikipedia.org/wiki/IEEE_floating_point,
;;     http://en.wikipedia.org/wiki/NaN
;;
;; Note that two NaN values are _never_ considered to be equal. This
;; is because while two equivalent floating point expressions may
;; produce equal results, huge classes of floating point expressions
;; can produce NaN as a result. Thus while equality on "normal"
;; floating point values is meaningful equality on NaNs is
;; meaningless.

(= Double/NaN Double/NaN)
;; = false
;; This is normal as per the notes above.

(def s1 #{1.0 2.0 Double/NaN})
;; => #'user/s1

s1
;; => #{2.0 1.0 NaN}

(contains? s1 1.0)
;; => true
;; This is expected since equality works on non-NaN values.

(contains? s1 Double/NaN)
;; => false
;; This might surprise you but is totally in keeping with all the
;; above.
