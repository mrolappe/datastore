(def has-value (when true
                 (println "Hello World")
                 "Returned Value"))
;; > Hello World
;; => #'user/has-value

has-value
;; => "Returned Value"

