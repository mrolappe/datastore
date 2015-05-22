(empty [1 2 3])
;; => []

(empty (list 1 2 3))
;; => ()

(map empty [[\a \b] {1 2} (range 4)])
;; => ([] {} ())

(swap! (atom (range 10)) empty)      
;; => ()
