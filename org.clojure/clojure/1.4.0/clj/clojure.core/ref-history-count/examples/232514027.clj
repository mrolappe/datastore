(def store (ref {}))
;; => #'user/store

(ref-history-count store)
;; => 0

(ref-max-history store)
;; => 10

(ref-min-history store)
;; => 0
