(def ^:dynamic *some-var* nil)

(defn f []
  (println *some-var*))

;; run f without a new binding
(f)
;; > nil
;; => nil

;; run f with a new binding
(binding [*some-var* "hello"]
  (f))
;; > hello
;; => nil

;; run f in a thread with a new binding
(binding [*some-var* "goodbye"]
  (.start (Thread. f)))
;; > nil
;; => nil

;; run a bound f in a thread with a new binding
(binding [*some-var* "goodbye"]
  (.start (Thread. (bound-fn* f))))
;; > goodbye
;; => nil
