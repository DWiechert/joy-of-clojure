(ns chapter1.section4.listing6
  (:use chapter1.section4.listing3))

(defn lookup [board pos]
  (let [[file rank] (map int pos)
        [fc rc] (map int [\a \0])
        f (- file fc)
        r (* 8 (- 8 (- rank rc)))
        index (+ f r )]
    (board index)))

(lookup (initial-board) "a1")