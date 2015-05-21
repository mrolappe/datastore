(require '[clojure.java.shell :as shell])
;; => nil

(shell/sh "sh" "-c" "cd /etc; pwd")
;; => {:exit 0, :out "/etc\n", :err ""}
