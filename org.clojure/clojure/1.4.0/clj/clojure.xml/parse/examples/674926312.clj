(require '[clojure.xml :as xml]
         '[clojure.zip :as zip])

;; convenience function, first seen at nakkaya.com later in clojure.zip src
(defn zip-str [s]
  (zip/xml-zip 
   (xml/parse
    (java.io.ByteArrayInputStream.
     (.getBytes s)))))
;; => #'user/zip-str

;; parse from xml-strings to internal xml representation
(zip-str "<a href='nakkaya.com'/>")
;; => [{:tag :a, :attrs {:href "nakkaya.com"}, :content nil} nil]

;; root can be rendered with xml/emit-element
(xml/emit-element (zip/root [{:tag :a, :attrs {:href "nakkaya.com"}, :content nil} nil]))
;; > <a href='nakkaya.com'/>
;; => nil
;; printed (to assure it's not lazy and for performance). The output can be captured via with-out-str
