(require '[clojure.zip :as z])
;; => nil

(z/right
 (z/down
  (z/xml-zip 
   {:tag :root :content [{:tag :any :content ["foo" "bar"]} "bar"]})))
;; => ["bar" {:l [{:content ["foo" "bar"], :tag :any}],
;;            :pnodes [{:content [{:content ["foo" "bar"], :tag :any} "bar"], :tag :root}],
;;            :ppath nil, :r nil}]

;; The above can also be written like this:
(-> {:tag :root :content [{:tag :any :content ["foo" "bar"]} "bar"]}
    z/xml-zip z/down z/right)
;; => ["bar" {:l [{:content ["foo" "bar"], :tag :any}],
;;            :pnodes [{:content [{:content ["foo" "bar"], :tag :any} "bar"], :tag :root}],
;;            :ppath nil, :r nil}]
