(ns chapter3.section4.listing2)

; We can also lookup which methods an object has on it by looping over the methods
; (for [method (seq (.getMethods java.awt.Frame))
;      :let [method-name (.getName method)]
;      :when (re-find #"Vis" method-name)]
;  method-name)

; To find javadoc on a class, we can use the javadoc function
; (javadoc frame)
(def frame (java.awt.Frame.))
(.setVisible frame true)
(.setSize frame (java.awt.Dimension. 200 200))

; This gives us a context for graphics
(def gfx (.getGraphics frame))

; Fill in the graphics with the specified dimensions
(.fillRect gfx 100 100 50 75)

; And we can add some color and re-draw a rectangle
(.setColor gfx (java.awt.Color. 255 128 0))
(.fillRect gfx 100 150 75 50)

