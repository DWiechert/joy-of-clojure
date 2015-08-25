(ns chapter3.section3.listing2)

; We can use & to denote any extra parameters into another sequence
(let [[a b c & more] (range 10)]
  (println "a b c are: " a b c)
  (println "more is: " more))

; We can also destructure into individual vars and keep the whole vector
; We use :as after the & var
(let [range-vec (vec (range 10))
      [a b c & more :as all] range-vec]
      (println "a b c are: " a b c)
      (println "more is: " more)
      (println "all is: " all))