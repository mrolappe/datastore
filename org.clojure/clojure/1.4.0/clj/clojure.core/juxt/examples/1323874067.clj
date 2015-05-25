;; "Explode" a value.

((juxt identity name) :keyword)
;; => [:keyword "keyword"]


;; eg. to create a map:

(into {} (map (juxt identity name) [:a :b :c :d]))
;; => {:a "a" :b "b" :c "c" :d "d"}
