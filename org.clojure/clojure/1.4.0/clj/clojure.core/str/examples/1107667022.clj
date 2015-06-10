"some string"
;; => "some string"

(str)
;; => ""

(str nil)
;; => ""

(str 1)
;; => "1"

(str 1 2 3)
;; => "123"

(str 1 'symbol :keyword)
;; => "1symbol:keyword"

;; A very common usage of str is to apply it to an existing collection:
(apply str [1 2 3])
;; => "123"

;; compare it with:
(str [1 2 3])
;; => "[1 2 3]"

