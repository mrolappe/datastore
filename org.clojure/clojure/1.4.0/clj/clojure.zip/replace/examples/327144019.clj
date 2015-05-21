(use 'clojure.zip)
;; => nil

(def vz
  (vector-zip [1 2 [73 88] 4]))
;; => #'user/vz

(root (replace (-> vz down right right) 3))
;; => [1 2 3 4]
