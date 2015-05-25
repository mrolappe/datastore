(def *agnt* (agent {}))
;; => #'user/*agnt*

(send-off *agnt* (fn [state] 
                   (Thread/sleep 10000)
                   (assoc state :done true)))
;; => #<Agent@5db18235: {}>

(await *agnt*) ; blocks till the agent action is finished
;; => nil
