(pprint (make-array Double/TYPE 3))
;; => [0.0, 0.0, 0.0]

(pprint (make-array Integer/TYPE 2 3))
;; => [[0, 0, 0], [0, 0, 0]]


;; Create an array of Threads, then show content and type
(def ar (make-array Thread 3))
;; => #'user/ar

(pprint ar)
;; => [nil, nil, nil]

(type ar)
;; => [Ljava.lang.Thread;
