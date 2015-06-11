(def my-agent (agent 100))
;; => #'user/my-agent

@my-agent
;; => 100

;; Note the following happens asynchronously in a thread pool
(send my-agent + 100)
;; => #<Agent@5afc0f5: 200>

;; Assuming the addition has completed the value will now be updated when we
;; look at it.
@my-agent
;; => 200
