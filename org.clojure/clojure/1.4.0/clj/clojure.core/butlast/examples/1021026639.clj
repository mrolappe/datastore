(butlast [1 2 3])
;; => (1 2)

(butlast (butlast [1 2 3]))
;; => (1)

(butlast (butlast (butlast [1 2 3])))
;; => nil
