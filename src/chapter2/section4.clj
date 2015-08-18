(ns chapter2.section4)

; Define variables using the def function
; Then you can call them using their name
(def x 42)
x

; Variables are shared across threads with their root value
(.start (Thread. #(println "Answer: " x)))

; Variables can be defined with no value too
; However, if you try to call this variable you get an exception because it's unbound
(def y)