;; Items are conj'ed one at a time, which puts them at the head of 
                                        ; the destination list
(into () '(1 2 3))
;; => (3 2 1)
