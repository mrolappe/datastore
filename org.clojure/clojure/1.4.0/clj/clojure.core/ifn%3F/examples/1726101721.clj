;; An anonymous function is a function as you'd expect
(ifn? #("my anonymous function"))
;; => true

;; Is a vector a function?
(ifn? [1 2 3])
;; => true

;; Sure is, lets call it.
([1 2 3] 0)
;; => 1

;; Maps and sets are functions, too.

;; a number is definitely not a function
(ifn? 1)
;; => false

;; but a symbol is
(ifn? 'foo)
;; => true

;; and so is a keyword
(ifn? :foo)
;; => true
