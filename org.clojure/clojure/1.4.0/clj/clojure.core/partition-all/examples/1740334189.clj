(def l [1 2 3 4 5])
;; => #'user/l

;; create a simple lazy sequence function testing only (rdr l) returns a lazy
;; sequence from l
;;
;; Eventually, (rest x) will be nil, so this fn represents the lazy sequence
;; [1 2 3 4 5 nil nil...]
(def rdr
  (fn reader [x]
    (cons (first x)
          (lazy-seq (reader (rest x))))))

;; the line below will freeze because `(rdr l)` is infinite, doall traverses the
;; entire sequence and thus will never terminate.
(doall (partition-all 2 (rdr l)))

;; add-in a take-while statement do exit the lazy sequence on nil will take
;; elements from the seq until one is nil, and stop there.
(doall (partition-all 2 (take-while (complement nil?) (rdr l))))
