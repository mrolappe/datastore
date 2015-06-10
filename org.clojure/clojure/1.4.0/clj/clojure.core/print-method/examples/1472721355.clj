(deftype XYZ [])

;; without custom print-method defined:
(prn (XYZ.))
;; > #<XYZ user.XYZ@2670d85b> 
;; => nil

(defmethod print-method XYZ [v ^java.io.Writer w]
  (.write w "<<-XYZ->>"))

;; with print-method
(prn (XYZ.))
;; > <<-XYZ->>
;; => nil
