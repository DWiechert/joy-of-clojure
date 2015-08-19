(ns chapter2.section5)

; All expressions in a do form are executed, but only the last one is retured
; This do form is commented out so this file can be run and see the results of the other functions
;(do
;  6
;  (+5 4)
;  3)

; A let block allows creating of local variables, however locals are immutable (can only be defined, not changed)
; The body of a let is treated as an implicit do - all expressions are evaluated but only last is returned
(let [r         5
      pi        3.1415
      r-squared (* r r)]
  (println "radius is " r)
  (* pi r-squared))

; Recursively count down from x to 1 and print x at each step
; Generally use when form when:
; - No else-part is associated with the result of a conditional
; - You require an impicity do in order to perform side-effects
; The reasons to use an if form are the inverse of the when form
(defn print-down-from [x]
  (when (pos? x)
    (println x)
    (recur (dec x))))
(print-down-from 5)

; Recursively accumulate a sum from x to 1
; This function returns the generated sum as a result
(defn sum-down-from [sum x]
  (if (pos? x)
    (recur (+ sum x) (dec x))
    sum))
(println (sum-down-from 0 10))

; The loop form acts like a let and recur form in one:
; - It allows you to specify locals like a let
; - It allows you to specify a loop-back like a recur
(defn sum-down-from2 [initial-x]
  (loop [sum 0, x initial-x]
    (if (pos? x)
      (recur (+ sum x) (dec x))
      sum)))
(sum-down-from2 10)