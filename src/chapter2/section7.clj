(ns chapter2.section7)

; The trivial way to access static methods in Java classes
java.util.Locale/JAPAN

; But it's preferred to use the Clojure way to access Java static methods
; We can also call it via java.lang.Math/sqrt but it's a shortcut to just do Math/sqrt
(Math/sqrt 9)

; The trivial way to create a Java class
(new java.util.HashMap {"foo" 42, "bar" 9, "baz" "quux"})

; But it's preferred to use the Clojure way again
; The dot after the classname indicates we want the constructor method
(java.util.HashMap. {"foo" 42, "bar" 9, "baz" "quux"})

; To access properties on an instance, precede the property or method with a dot
; This returns the value of x from the Point class
(.x (java.awt.Point. 10 20))

; We can also pass in parameters to a method call
; In this instance, 2M is the parameter to the divide method
(.divide (java.math.BigDecimal. "42") 2M)

; To set a property, we use the set! function
; The first argument is the instance member form and then the parameter
(let [origin (java.awt.Point. 0 0)]
  (set! (.x origin) 15)
  (str origin))

; Java allows chaining of multiple method together:
; new java.util.Date().toString().endsWith("2010")
; We can do this in Clojure too, we just go inside-out
(.endsWith (.toString (java.util.Date.)) "2010")

; However, we can use the .. macro to consise method chaining
(.. (java.util.Date.) toString (endsWith "2010"))

; Java also might set a lot of properties when initializing a variable:
; java.util.HashMap props = new java.util.HashMap(); 
; props.put("HOME", "/home/me");
; props.put("SRC", "src");
; props.put("BIN", "classes");
; We can do the same in Clojure using the doto macro
(doto (java.util.HashMap.)
  (.put "HOME" "/home/me")
  (.put "SRC"  "src")
  (.put "BIN"  "classes"))