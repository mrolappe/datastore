;; some gotchas to be aware of:

(symbol "user" 'abc)
;; => ClassCastException clojure.lang.Symbol cannot be cast to java.lang.String  clojure.core/symbol (core.clj:523)

(symbol *ns* "abc")
;; => ClassCastException clojure.lang.Namespace cannot be cast to java.lang.String  clojure.core/symbol (core.clj:523)

(symbol 'user "abc")
;; => ClassCastException clojure.lang.Symbol cannot be cast to java.lang.String  clojure.core/symbol (core.clj:523)


;; Warning - the following generated symbols are non-conformant and may wreak
;; serious havoc in the near/far future when least expected...

(symbol "abc def")
;; => abc def

(symbol "123def")
;; => 123def

(symbol "/123/def/ghi")
;; => /123/def/ghi

(symbol "/abc/def/ghi")
;; => /abc/def/ghi
