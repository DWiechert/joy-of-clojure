(ns chapter1.section4.listing2)

(defprotocol Concatenable
  (cat [this other]))

(extend-type String
  Concatenable
  (cat [this other]
    (.concat this other)))

(extend-type java.util.List
  Concatenable
  (cat [this other]
    (concat this other)))

(do (println (cat "House" " of Leaves")) (println (cat [1 2 3] [4 5 6])))