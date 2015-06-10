;; some gotchas to be aware of:

(keyword "user" 'abc)
;; => ClassCastException clojure.lang.Symbol cannot be cast to java.lang.String  clojure.core/keyword (core.clj:558)

(keyword *ns* "abc")
;; => ClassCastException clojure.lang.Namespace cannot be cast to java.lang.String  clojure.core/keyword (core.clj:558)

(keyword 'user "abc")
;; => ClassCastException clojure.lang.Symbol cannot be cast to java.lang.String  clojure.core/keyword (core.clj:558)


;; Warning - the following generated keywords are non-conformant and may wreak
;; serious havoc in the near/far future when least expected...

(keyword "abc def")
;; => :abc def

(keyword "123def")
;; => :123def

(keyword "/abc/def/ghi")
;; => :/abc/def/ghi
