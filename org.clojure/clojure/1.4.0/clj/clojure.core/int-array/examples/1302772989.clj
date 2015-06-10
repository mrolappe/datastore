;; if you have a sequence, perhaps lazy, int-array will figure out the size
(aget (int-array [1 2 3]) 0)
;; => 1

(int-array [1 2 3])
;; => #<int[] [i@263c8db9]>

;; if you need a certain size, with a constant initial value
(aget (int-array 5 1) 4)
;; => 1

(alength (int-array 5))
;; => 5

;; finally, you can specify a size + a sequence, which will initialize the array
;; by taking size from the sequence
(alength (int-array 5 (range 10)))
;; => 5

;; which is equivalent to
(alength (int-array (take 5 (range 10))))
;; => 5
