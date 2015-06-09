;; this is kind of weird IMO... but it works that way (the same for vectors)
(every? true? '())
;; => true

(every? false? '())
;; => true
