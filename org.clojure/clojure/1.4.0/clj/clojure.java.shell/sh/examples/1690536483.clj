(require '[clojure.java.sh :refer [shell]])
;; => nil

(sh "pwd" :dir "/home/ics/icsdev")
;; => {:exit 0, :out "/home/ics/icsdev\n", :err ""}
