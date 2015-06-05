;; create an array of 10 characters (initially set to blank by default)
;; and set one of the elements to the character "a"

(def cs (char-array 10))
;; => #'user/cs

(vec cs)
;; => [\  \  \  \  \  \  \  \  \  \ ]

(aset-char cs 3 \a)
;; => \a

(vec cs)
;; => [\  \  \  \a \  \  \  \  \  \ ]
