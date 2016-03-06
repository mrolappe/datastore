(require '[clojure.zip :as z]
         '[clojure.xml :as xml])
;; => nil

(def xmlzipper
  (z/xml-zip
   (xml/parse "resources/somedata.xml")))
;; => #'user/xmlzipper

;; make a zippper pointing at the children to the topnode in somedata.xml
(z/children xmlzipper)

