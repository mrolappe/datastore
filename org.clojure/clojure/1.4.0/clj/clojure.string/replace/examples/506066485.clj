(require '[clojure.string :as s])
;; => nil

(s/replace "The color is red." #"[aeiou]"  #(str %1 %1))
;; => "Thee cooloor iis reed."
