(ns chapter3.section4.listing1)

; (xor 1 2) - xor is not a valid function
; Instead, we can find a function that does xor
; (find-doc "xor")
(defn xors [max-x max-y] (for [x (range max-x) y (range max-y)] [x y (bit-xor x y)]))
; (xors 2 2)