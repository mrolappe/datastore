(defn is-small? [number]
  (if (< number 100) "yes" "no"))

(is-small? 50)
;; => "yes"

(is-small? 500)
;; => "no"
