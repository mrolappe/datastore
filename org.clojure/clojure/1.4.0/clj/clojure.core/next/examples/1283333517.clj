(next '(:alpha :bravo :charlie))
;; => (:bravo :charlie)

(next (next '(:one :two :three)))
;; => (:three)

(next (next (next '(:one :two :three))))
;; => nil
