;; Create a string from the given items and store it in x.
(def x (print-str 1 "foo" \b \a \r {:a 2}))
;; => #'user/x

;; It's a string.
(string? x)
;; => true

;; Notice that each item is separated by a space.
x
;; => "1 foo b a r {:a 2}"

