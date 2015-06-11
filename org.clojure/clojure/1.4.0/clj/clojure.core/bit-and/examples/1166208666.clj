(Integer/toBinaryString 235)
;; => "11101011"

(Integer/toBinaryString 199)
;; => "11000111"

(bit-and 235 199)
;; => 195

(Integer/toBinaryString 195)
;; => "11000011"

;;11101011
;;&
;;11000111
;;=
;;11000011
