;; Get a sequence of words out of a string.
(re-seq #"\w+" "mary had a little lamb")
;; => ("mary" "had" "a" "little" "lamb")
