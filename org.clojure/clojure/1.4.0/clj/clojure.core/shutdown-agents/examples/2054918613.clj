;; Creating an agent
(def a (agent 1))
;; => #'user/a

;; Create a function that can handle an agent

(defn agent-action [a]
  33)
;; => #'user/agent-action

;; The agent will become 33
(send-off a agent-action)
;; => #<Agent@dde4f2: 33>

@a
;; => 33
;; Create another agent before shutdown
(def c (agent 3))
;; => #'user/c

;; Shutdown agents is called
(shutdown-agents)
;; => nil

;; Attempt to turn c into 33
(send c agent-action)
;; => #<Agent@b162fa: 3>

;; The result is that it is still the same value it was initialized with
@c
;; => 3

;; Agent created after shutdown
(def d (agent 4))
;; => #'user/d

;; Try sending it
(send d agent-action)
;; => #<Agent@356519: 4>

;; Same thing, there are no threads to process the agents
@d
;; => 4
