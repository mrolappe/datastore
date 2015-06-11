(def *matcher* (re-matcher #"\d+" "abc12345def"))
;; => #'user/*matcher*

(re-find *matcher*)
;; => "12345"
