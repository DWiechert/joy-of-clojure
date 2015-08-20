(ns chapter2.section9.listing5
  (:import [java.util HashMap]
           [java.util.concurrent.atomic AtomicLong]))

; We can import Java classes using the import directive
; Then we can call the classes without namespace prefixes
; Just like in Java, any classes in the java.lang package are automatically imported
(HashMap. {"happy?" true})
(AtomicLong. 42)