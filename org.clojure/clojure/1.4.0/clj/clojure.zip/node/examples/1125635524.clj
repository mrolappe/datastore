(require '[clojure.zip :as zip])
;; => nil

(def original [1 '(a b c) 2])
;; => #'user/original

(def root-loc (zip/seq-zip (seq original)))
;; => #'user/root-loc

(zip/node (zip/down root-loc))
;; => 1
