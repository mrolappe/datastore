(def atm (atom [2]))
;; => #'user/atm

(set-validator! atm #(every? even? %))
;; => nil

(swap! atm into [5])
;; => #<CompilerException java.lang.IllegalStateException: Invalid reference state (NO_SOURCE_FILE:0)>

set-validator! atm nil)
;; => nil

(swap! atm into [5]))
;; => [2 5]
