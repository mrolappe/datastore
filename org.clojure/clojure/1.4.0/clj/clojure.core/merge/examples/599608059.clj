(merge {:a 1} nil)
;; => {:a 1}

(merge nil {:a 1})
;; => {:a 1}

(merge nil nil)
;; => nil
