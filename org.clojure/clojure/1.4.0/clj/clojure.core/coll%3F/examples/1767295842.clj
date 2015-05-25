(coll? {})
;; => true

(coll? #{})
;; => true

(coll? [])
;; => true

(coll? ())
;; => true

(coll? 4)
;; => false

(coll? "fred")
;; => false

(coll? true)
;; => false

(coll? nil)
;; => false
