(require '[clojure.zip :as z])
;; => nil

;; For the purposes of keeping the examples that follow clean,
;; assume we have taken the former route: (use 'clojure.zip)

(require '[clojure.pprint :refer [pprint]])
;; => nil

(def p pprint)
;; => #'user/p

(def z [[1 2 3] [4 [5 6] 7] [8 9]])
;; => #'user/z

(def zp (zipper vector? seq (fn [_ c] c) z))
;; => #'user/zp

zp
;; => [[[1 2 3] [4 [5 6] 7] [8 9]] nil]

(p (-> zp down))
;; > [[1 2 3]
;; >  {:l [],
;; >   :pnodes [[[1 2 3] [4 [5 6] 7] [8 9]]],
;; >   :ppath nil,
;; >   :r ([4 [5 6] 7] [8 9])}]

(first (-> zp down))
;; => [1 2 3]

(p (-> zp down right))
;; > [[4 [5 6] 7]
;; >  {:l [[1 2 3]],
;; >   :pnodes [[[1 2 3] [4 [5 6] 7] [8 9]]],
;; >   :ppath nil,
;; >   :r ([8 9])}]

(first (-> zp down right))
;; => [4 [5 6] 7]

(p (-> zp down right down right))
;; > [[5 6]
;; >  {:l [4],
;; >   :pnodes [[[1 2 3] [4 [5 6] 7] [8 9]] [4 [5 6] 7]],
;; >   :ppath
;; >   {:l [[1 2 3]],
;; >    :pnodes [[[1 2 3] [4 [5 6] 7] [8 9]]],
;; >    :ppath nil,
;; >    :r ([8 9])},
;; >   :r (7)}]

(p (-> zp down right down right down))
;; > [5
;; >  {:l [],
;; >   :pnodes [[[1 2 3] [4 [5 6] 7] [8 9]] [4 [5 6] 7] [5 6]],
;; >   :ppath
;; >   {:l [4],
;; >    :pnodes [[[1 2 3] [4 [5 6] 7] [8 9]] [4 [5 6] 7]],
;; >    :ppath
;; >    {:l [[1 2 3]],
;; >     :pnodes [[[1 2 3] [4 [5 6] 7] [8 9]]],
;; >     :ppath nil,
;; >     :r ([8 9])},
;; >    :r (7)},
;; >   :r (6)}]

(p (-> zp down right down right (replace "hello")))
;; > ["hello"
;; >  {:changed? true,
;; >   :l [4],
;; >   :pnodes [[[1 2 3] [4 [5 6] 7] [8 9]] [4 [5 6] 7]],
;; >   :ppath
;; >   {:l [[1 2 3]],
;; >    :pnodes [[[1 2 3] [4 [5 6] 7] [8 9]]],
;; >    :ppath nil,
;; >    :r ([8 9])},
;; >   :r (7)}]

(p (-> zp down right down right (replace "hello") up))
;; > [(4 "hello" 7)
;; >  {:changed? true,
;; >   :l [[1 2 3]],
;; >   :pnodes [[[1 2 3] [4 [5 6] 7] [8 9]]],
;; >   :ppath nil,
;; >   :r ([8 9])}]

(p (-> zp down right down right (replace "hello") up root))
;; > ([1 2 3] (4 "hello" 7) [8 9])
