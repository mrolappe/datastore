(def v (delay (do (println "start sleeping") 
                  (Thread/sleep 1000) 
                  10)))
;; => #'user/v

(delay? v)
;; => true

(force v)
;; > start sleeping
;; => 10

(delay? v)
;; => true

(force v)
;; => 10
 
