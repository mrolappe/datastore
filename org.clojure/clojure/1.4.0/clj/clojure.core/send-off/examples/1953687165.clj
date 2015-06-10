(def my-agent (agent ""))
;; => #'user/my-agent

@my-agent
;; => ""

;; Note the following happens asynchronously in a thread
;; pool
(send my-agent #(slurp %2) "file.txt")
;; => #<Agent@13c6641: "">

;; Assuming the action has been invoked the value will
;; now be updated when we look at it.
@my-agent
;; => "file contents"

