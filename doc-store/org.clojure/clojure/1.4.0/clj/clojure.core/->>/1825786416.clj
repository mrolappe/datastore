(->>
   (range 10)
   (map inc)     ; Macro outputs here: (map inc (range 10)
   (filter odd?) ; And here: (filter odd? (map inc (range 10))
   (into []))    ; And finally: (into [] (filter odd? (map inc (range 10)))
;=> [1 3 5 7 9]
