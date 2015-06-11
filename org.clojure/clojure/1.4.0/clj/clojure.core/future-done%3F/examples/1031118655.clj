(def f (future (Thread/sleep 5000) (inc 0)))
;; => #'user/f

(future-done? f)                            
;; => false

(Thread/sleep 5000)
;; => nil

(future-done? f)
;; => true

