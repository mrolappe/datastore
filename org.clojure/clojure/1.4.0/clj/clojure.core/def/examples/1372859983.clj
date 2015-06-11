;; give function another name
(def sys-map map)
;; => #'user/sys-map

;; give macro another name
(def #^{:macro true} sys-loop #'loop)
;; => #'user/sys-loop

;; Note that if the ^{:macro true} metadata were not preserved, sys-loop would
;; not be treated as a macro.
