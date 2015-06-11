(def al (new java.util.ArrayList))
;; => #'user/al

(instance? java.util.Collection al)
;; => true

(instance? java.util.RandomAccess al)
;; => true

(instance? java.lang.String al)
;; => false
