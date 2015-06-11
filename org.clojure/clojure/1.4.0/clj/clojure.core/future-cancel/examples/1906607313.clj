(def f (future (Thread/sleep 5000) (inc 0)))
;; => #'user/f

(future-cancel f)                           
;; => true

(future-cancelled? f)                       
;; => true
