;; The values 1, 1.0 and 1.0M are all numerically equal and thus in a sorted
;; mapping occupy the same entry. The last one will win. The same is true of
;; 1.5M and 3/2. The expected result is then a map with the keys 1.0 and 1.5M.
(def m2
  (sorted-map 1.0 "floatone"
              1 "intone"
              1.0M "bigdecone"
              1.5M "bigdec1.5"
              3/2 "ratio1.5"))
;; => #'user/m2

m2
;; => {1.0 "bigdecone", 1.5M "ratio1.5"}

;; Removing a key only needs equality according to compare. Remember that dissoc
;; is (dissoc mapping & keys), so here we will remove all entries with values
;; equal to 1.0 and 1.5. Thus we expect to produce the empty mapping.
(dissoc m2 1 3/2)
;; => {}

;; Searching sorted maps calls the comparator with the searched-for value
;; and some of the keys in the map, which throws an exception if the
;; comparator does.
;; So if we try to get a vale for 1 out of the map, since 1 gives the equality
;; comparison to 1.0 which we know is in the map, we expect to get "bigdecone"
;; back out.
(m2 1)
;; => "bigdecone"

;; Trying to look up a string from our mapping however gives exception in
;; compare since compare is not defined between Double and String.
(m2 "a")
;; => ClassCastException java.lang.Double cannot be cast to java.lang.String  
