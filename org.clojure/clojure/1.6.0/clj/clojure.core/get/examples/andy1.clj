;; The symbol b is in the set, and a set is an identity mapping.
(get #{"a" 'b 5 nil} 'b)
;; => b

;; 2 is not

(get #{"a" 'b 5 nil} 2)
;; => nil

;; nil is in this set, but one cannot distinguish this result from not
;; being in the set.

(get #{"a" 'b 5 nil} nil)
;; => nil

;; The same is true here.

(get #{"a" 'b 5} nil)
;; => nil

;; You may specify a not-found value to help distinguish these cases.
;; This works well as long as there is some value you know is not in the
;; set.

(get #{"a" 'b 5} nil :not-found)
;; => :not-found

(get #{"a" 'b 5 nil} nil :not-found)
;; => nil

;; Similarly for maps:
(get {"a" 1, "b" nil} "b")
;; => nil
;; found key "b", but value is nil

(get {"a" 1, "b" nil} "b" :not-found)
;; => nil
;; here we can tell it was found and value is nil

(get {"a" 1, "b" nil} "c" :not-found)
;; => :not-found
;; but here no key "c" was found
