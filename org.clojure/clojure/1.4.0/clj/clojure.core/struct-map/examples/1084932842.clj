;; create a new struct type
(defstruct s :1 :2)
;; => #'user/s

(type s)
;; => clojure.lang.PersistentStructMap$Def

;; create an instance of this new struct type
(def s1 (struct s "one" "two"))
;; => #'user/s1

(println s1)
;; => {:1 "one", :2 "two"}

(type s1)
;; => clojure.lang.PersistentStructMap

;; create a new struct instance that is based on the previous struct type
;; with the option of supplying a new key/value pairs
(def s2 (struct-map s :3 "three"))
;; => #'user/s2

(println s2)
;; => {:1 nil, :2 nil, :3 "three"}

(type s2)
;; => clojure.lang.PersistentStructMap
