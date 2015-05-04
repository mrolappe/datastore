;; with comparator case-insensitive-cmp below, "lion" is equal to "lion"
;; and not added as a separate key in the map.  the value associated with
;; the second equal key "lion" does replace the first value.

(require '[clojure.string :as str])

(defn case-insensitive-cmp [s1 s2]
  (compare (str/lower-case s1) (str/lower-case s2)))
;; => #'user/case-insensitive-cmp

(sorted-map-by case-insensitive-cmp "lion" "normal lion"
               "Lion" "Orycteropus afer")
;; => {"lion" "Orycteropus afer"}
