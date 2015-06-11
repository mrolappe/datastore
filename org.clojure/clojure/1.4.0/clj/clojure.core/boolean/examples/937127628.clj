;; Everything except `false' and `nil' is true in boolean context.
(into {} (map #(vector % (boolean %)) [true false nil [] {} '() #{} ""]))
;; => {true true, false false, nil false, [] true, {} true, #{} true, "" true}

(clojure.pprint/pp)
;; > {true true,
;; >  false false,
;; >  nil false,
;; >  [] true,
;; >  {} true,
;; >  #{} true,
;; >  "" true}
;; => nil
