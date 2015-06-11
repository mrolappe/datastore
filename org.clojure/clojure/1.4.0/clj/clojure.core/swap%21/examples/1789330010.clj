(def players (atom ()))
;; => #'user/players

(swap! players conj :player1)
;; => (:player1)

(swap! players conj :player2)
;; => (:player2 :player1)

(deref players)
;; => (:player2 :player1)
