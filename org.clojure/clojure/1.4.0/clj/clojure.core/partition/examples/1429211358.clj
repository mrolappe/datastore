;; When there are fewer than n items in the coll, partition's
;; behaviour depends on whether there is a pad coll or not

;; without pad
(partition 10 [1 2 3 4])
;; => ()

;; again, without pad
(partition 10 10 [1 2 3 4])
;; => ()

;; with a pad this time (note: the pad is an empty sequence)
(partition 10 10 nil [1 2 3 4])
;; => ((1 2 3 4))

;; or, explicit empty sequence instead of nil
(partition 10 10 [] [1 2 3 4])
;; => ((1 2 3 4))
