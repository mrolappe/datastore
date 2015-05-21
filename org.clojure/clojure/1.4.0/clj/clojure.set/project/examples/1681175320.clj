(require '[clojure.set :refer [project]])
;; => nil

;; `project` strips out unwanted key/value pairs from a set of maps. 
;; Suppose you have these descriptions of cows:

(def cows
  #{{:name "betsy" :id 33}
    {:name "panda" :id 34}})
;; => #'user/cows

;; You care only about the names. So you can get them like this:
(project cows [:name])
;; => #{{:name "panda"}
;;      {:name "betsy"}}
