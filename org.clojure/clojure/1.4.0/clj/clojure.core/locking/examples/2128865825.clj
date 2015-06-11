(def o (Object.))

(future (locking o 
          (Thread/sleep 10000) 
          (println "done")))

(future (locking o 
          (Thread/sleep 10000) 
          (println "done")))

;; Operates like the synchronized keyword in Java. Because only one of the two
;; threads can have the lock on o at once, and each takes 10s to sleep and print
;; while holding the lock, this program will evaluate in 20s, printing "done" at
;; two 10s intervals.
