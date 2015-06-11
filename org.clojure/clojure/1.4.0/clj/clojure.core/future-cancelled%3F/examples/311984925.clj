(def f (future (Thread/sleep 5000) (inc 0)))
;; => #'user/f

(future-cancel f)                           
;; => true

(future-cancelled? f)                       
;; => true

(future-done? f)                            
;; => true

@f                                          
;; => java.util.concurrent.CancellationException (NO_SOURCE_FILE:0)
