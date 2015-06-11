;; Convert number into bits:
(defn bits [n s]
  (->> n
       (iterate (fn [i] (bit-shift-right i 1)))
       (map     (fn [i] (bit-and 0x01 i)))
       (take s)))
;; => #'user/bits

(map (fn [n] (bits n 3)) (range 8))
;; => ((0 0 0)
;;     (1 0 0)
;;     (0 1 0)
;;     (1 1 0)
;;     (0 0 1)
;;     (1 0 1)
;;     (0 1 1)
;;     (1 1 1))
