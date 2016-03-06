(def tdate (agent (java.util.Date.)))

@tdate
;; => #<Date Wed Feb 15 23:25:26 CET 2012>

;; this has no meaning, rendering a (silent) error
(send tdate inc)

(agent-error tdate)
;; => #<ClassCastException java.lang.ClassCastException: java.util.Date cannot be cast to java.lang.Number>
