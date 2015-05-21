;; Agents provide shared access to mutable state. They allow
;; non-blocking (asynchronous as opposed to synchronous atoms) and
;; independent change of individual locations (unlike coordinated
;; change of multiple locations through refs).

;; agent creates one:

(def counter (agent 0))
;; => #'user/counter

;; send changes its value:
(send counter inc)
;; => nil

;; @ or deref provides a snapshot of the current state:
@counter
;; => 1

;; agents can reference any data structure:

(def pulp-fiction (agent {}))
;; => #'user/pulp-fiction
(send pulp-fiction assoc :act-one "PROLOGUE")
;; => nil

@pulp-fiction
;; => {:act-one "PROLOGUE"}

(send pulp-fiction assoc :act-two "VINCENT VEGA & MARSELLUS WALLACE'S WIFE")
;; => nil

@pulp-fiction
;; => {:act-two "VINCENT VEGA & MARSELLUS WALLACE'S WIFE", :act-one "PROLOGUE"}

;; From http://clojure-examples.appspot.com/clojure.core/agent with permission.
