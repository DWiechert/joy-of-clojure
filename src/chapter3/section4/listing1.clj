(ns chapter3.section4.listing1)

; (xor 1 2) - xor is not a valid function
; Instead, we can find a function that does xor
; (find-doc "xor")
; We are getting the remainder of mod 256 so we can keep valid RGB values
(defn xors [max-x max-y] 
  (for [x (range max-x) y (range max-y)] [x y (bit-xor x y)]
    [x y (rem (bit-xor x y) 256)]))
; (xors 2 2)