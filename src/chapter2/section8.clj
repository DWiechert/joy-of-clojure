(ns chapter2.section8)

; We can throw an exceptin similar to how it's done in Java
(throw (Exception. "I done throwed."))

; And we can catch exceptions too
(defn throw-catch [f]
  [(try
     (f)
     (catch ArithemeticException e "No dividing by zero!")
     (catch Exception e (str "you are so bac " (.getMessage e)))
     (finally (println "Returning...")))])