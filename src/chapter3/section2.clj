(ns chapter3.section2)

; Clojure returns nil if we try to create an empty sequence
(seq [1 2 3]) ; (1 2 3)
(seq []) ; nil

; We can use the nil to help us loop through sequences
(defn print-seq [s]
  (when (seq s)
    (prn (first s))
    (recur (rest s))))
(print-seq [1 2])
(print-seq [])