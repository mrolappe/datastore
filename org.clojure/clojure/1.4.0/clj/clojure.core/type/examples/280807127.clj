;; Checking numbers
(type 10)
;; => java.lang.Long

(type 10.0)
;; => java.lang.Double

;; Checking collections
(type [10 20])
;; => clojure.lang.PersistentVector

(type '(10 20))
;; => clojure.lang.PersistentList


;; Checking other, but somewhat intuitive, forms
(type :a)
;; => clojure.lang.Keyword

(type Thread)
;; => java.lang.Class

;; Checking a symbol
(type 'whatever)
;; => clojure.lang.Symbol

;; A surprise attack yields
(type clojure.lang.Symbol)
;; not such a surprising response
;; => java.lang.Class

;; Checking a function
(defn foo [] ("any string"))
;; => #'user/foo

(type foo)
;; => user$foo

;; Checking a macro
(type fn)
;; => user$fn

(type clojure.core/fn)
;; => java.lang.Exception: Can't take value of a macro: #'clojure.core/fn (NO_SOURCE_FILE:94)

