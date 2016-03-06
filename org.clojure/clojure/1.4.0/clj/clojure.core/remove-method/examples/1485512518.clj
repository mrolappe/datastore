;; long example showing setting up a multi-method, then removing one of the 
;; methods, showing the multi-method has been removed

(defmulti tos :Ob)
;; => nil

(defn line [p1 p2] {:Ob :line :p1 p1 :p2 p2})
;; => #'user/line

(defn circle [cent rad] {:Ob :circle :cent cent :rad rad})
;; => #'user/circle

(defmethod tos :line [l] (str "Line:" (l :p1) (l :p2)))
;; = #<MultiFn clojure.lang.MultiFn@73aecc3a>

(defmethod tos :circle [c] (str "Circle:" (c :cent) (c :rad)))
;; => #<MultiFn clojure.lang.MultiFn@73aecc3a>

(def cc (circle [2 3] 3.3))
;; => #'user/cc

(def ll (line [1 1] [0 0]))
;; => #'user/ll

(tos cc)
;; => "Circle:[2 3]3.3"

(tos ll)
;; => "Line:[1 1][0 0]"

(remove-method tos :line)
;; => #<MultiFn clojure.lang.MultiFn@73aecc3a>

(tos ll)
;; > java.lang.IllegalArgumentException: No method in multimethod 'tos' for dispatch value: :line (NO_SOURCE_FILE:0)

