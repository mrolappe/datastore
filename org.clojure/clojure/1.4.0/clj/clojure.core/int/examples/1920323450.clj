(int 1)
;; => 1

(int 1M)
;; => 1

(int 1.2)
;; => 1

(int \1)
;; => 49

(int \a)
;; => 97

(int "1")
;; => java.lang.ClassCastException: ...
