(require '[clojure.string :refer [escape]])
;; => nil

;; There should be no space between the \ and the &, but I don't know how
;; to create that in an example yet.
(escape "I want 1 < 2 as HTML, & other good things."
        {\< "&lt;", \> "&gt;", \ & "&amp;"})
;; => "I want 1 &lt; 2 as HTML, &amp; other good things."
