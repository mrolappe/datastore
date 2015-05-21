;; Warning.  If the arg is a Java array, then the returned vector will alias it,
;; and modifying the array will thus modify the vector.  To avoid this, do
;; not modify the array after the vec call.  One way to guarantee this is to
;; make a copy of the array, call vec on the new array, and then lose all
;; references to the copy so it cannot be accessed in any way.

(def a (to-array (repeat 4 0)))
;; => #'user/a

(seq a)
;; => (0 0 0 0)

(def v (vec a))
;; => #'user/v

v
;; => [0 0 0 0]

;; Now change a, and v changes, too, since they share state.
(aset a 2 -5)
;; => -5

v
[0 0 -5 0]

;; One way to avoid this
(def v (vec (aclone a)))
;; => #'user/v

v
;; => [0 0 -5 0]

(aset a 2 -20)
;; => -20

v
;; => [0 0 -5 0]
