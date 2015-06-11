;; This is an example of setting a docstring during a def.
;; (Note that the clojure.repl namespace which contains the
;;  doc function is not loaded by default in Emacs' SLIME mode.)

(def ted-nugent "the nuge rocks" 123)
;; => #'user/ted-nugent
(doc ted-nugent)
;; > -------------------------
;; > user/ted-nugent
;; > The nuge rocks
;; => nil
ted-nugent
;; => 123
