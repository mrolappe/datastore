(refer 'clojure.string
       :rename '{capitalize cap, trim trm})
;; > WARNING: replace already refers to: #'clojure.core/replace in namespace: user, being replaced by: #'clojure.string/replace
;; > WARNING: reverse already refers to: #'clojure.core/reverse in namespace: user, being replaced by: #'clojure.string/reverse
;; => nil

(cap (trm " hOnduRAS  "))
;; => "Honduras"

(join \, [1 2 3])
;; => "1,2,3"
