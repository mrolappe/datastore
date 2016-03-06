(require '[clojure.zip :as zip])
;; => nil

(def zz (zip/seq-zip '(a b (c d e) (f (g h) i) j)))
;; => #'user/zz

zz
;; => [(a b (c d e) (f (g h) i) j) nil]
