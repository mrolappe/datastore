(def a (ref 0))
;; => #'user/a

(dosync
 (io! (println "hello"))
 (alter a inc))
;; => IllegalStateException I/O in transaction

(dosync
 (println "hello")
 (alter a inc))
;; > "hello"
;; => 1

(defn fn-with-io []
  (io! (println "hello")))
;; => #'user/fn-with-io

(dosync
 (fn-with-io)
 (alter a inc))
;; => IllegalStateException I/O in transaction
