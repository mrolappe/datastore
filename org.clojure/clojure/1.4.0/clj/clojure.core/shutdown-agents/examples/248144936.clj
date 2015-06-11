;; Create the agent that we will be using
(def a (agent 0))
;; => #'user/a

;; Dereference the agent to show the value is 0
@a
;; => 0

;; Create a function that can increment the agent
;; This will continually update the value of the agent
(defn agent-inc [a]
  (send-off *agent* agent-inc)
  (inc a))
;; => #'user/agent-inc

;; Send the agent to the agent-inc function
;; The value is 188 because by the time the repl has sent off the
;; agent to the function, the function has already been called recursively
(send a agent-inc)
;; => #<Agent@6b850d: 188>

;; Dereference of the value a second or so later
@a
;; => 716889

;; Another dereference in another couple of seconds
@a
;; => 1455264

;; Shutdown the threads for the agents
(shutdown-agents)
;; => nil

;; Dereference the agent to see what value it is
@a
;; => 3522353

;; Dereference the agent again in a few seconds
;; It's the same value, because the agent pool of threads are no longer
;; active
@a
;; => 3522353
