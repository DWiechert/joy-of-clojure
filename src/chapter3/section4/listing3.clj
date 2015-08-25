(ns chapter3.section4.listing3
  (:use [chapter3.section4.listing1] [chapter3.section4.listing2]))

(doseq [[x y xor] (xors 200 200)]
  (.setColor gfx (java.awt.Color. xor xor xor))
  (.fillRect gfx x y 1 1))

; If we call the previous xors function with 500 500, we'll get an error because the numbers are too large for RGB
; To find out exactly what went wrong, we can inspect the stacktrace of the variable *e
; (.printStackTrace *e)