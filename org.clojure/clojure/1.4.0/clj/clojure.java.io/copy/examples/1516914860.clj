(require '[clojure.java.io :as io])

(defn copy-file [source-path dest-path]
  (io/copy
   (io/file source-path)
   (io/file dest-path)))

(let [sq "suirrel.txt"
      br "burt-reynolds.txt"]
  (spit sq "I'm a squirrel!")
  (copy-file sq br)
  (println
   (format "omgwtfbbq Burt Reynolds said '%s'!"
           (slurp br))))
;; Prints
;; > omgwtfbbq Burt Reynolds said 'I'm a squirrel!'
