;;Check if class c exists on the classpath
(use '[clojure.reflect :only [resolve-class]])

(defn class-exists? [c] 
  (resolve-class (.getContextClassLoader (Thread/currentThread)) c))

(class-exists? 'org.joda.time.DateTime) 
;; => nil
