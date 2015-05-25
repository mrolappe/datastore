(or true false false)
;; => true

(or true true true)
;; => true

(or false false false)
;; => false

(or nil nil)
;; => nil

(or false nil)
;; => nil

(or true nil)
;; => true

;; or doesn't evaluate if the first value is true
(or true (println "foo"))
;; => true

;; order matters
(or (println "foo") true)
;; > foo
;; => true
