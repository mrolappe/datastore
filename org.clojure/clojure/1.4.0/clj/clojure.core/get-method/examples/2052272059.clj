;; define a multi-method, then demonstrate that you may use 
;; get-method in the same way you can call the method directly

(defmulti tos :Ob)
;; => #'user/tos

(defn line [p1 p2] {:Ob :line :p1 p1 :p2 p2})
;; => #'user/line

(defn circle [cent rad] {:Ob :circle :cent cent :rad rad})
;; => #'user/circle

(defmethod tos :line [l] (str "Line:" (l :p1) (l :p2)))
;; => #<MultiFn clojure.lang.MultiFn@a0b1cd0>

(defmethod tos :circle [c] (str "Circle:" (c :cent) (c :rad)))
;; => #<MultiFn clojure.lang.MultiFn@a0b1cd0>

(println (tos (circle [2 3] 3.3)))
;; > Circle:[2 3]3.3
;; => nil

(println (tos (line [1 1] [0 0])))
;; > Line:[1 1][0 0]
;; => nil

(println ((get-method tos :line) (line [1 2] [3 4])))
;; > Line:[1 2][3 4]
;; => nil
