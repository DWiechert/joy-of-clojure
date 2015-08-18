(ns chapter2.section3)

; Functions are anonymous and are given a special name at comppile time
(fn mk-set [x y] #{x y})

; So, to call a function you need to pass its parameters at the same time
((fn mk-set2 [x y] #{x y}) 1 2)

; We can also take a variable number of arguments by defining the function with multiple bind variables
; This case will map to only 'x' because only 1 variable is provided as input
((fn
   ([x] #{x})
   ([x y] #{x y})) 42)

; Instead of having to have all use cases, we can take variable arguments arbitrarily
; Note: the last 2 arguments will be grouped together because we only explicitly bind 2 variables
((fn arity2+ [x y & z] [x y z]) 1 2 3 4)

; If we want named functions, we use a def statement
; Then we can call it with our arguments
(def make-a-set
  (fn
    ([x] #{x})
    ([x y] #{x y})))
(make-a-set 1)
(make-a-set 1 2)

; Or we can use a defn statement which removes the fn part and allows documentation
(defn make-a-set2
  "Takes either one or two values and makes a set from them."
  ([x] #{x})
  ([x y] #{x y}))
(make-a-set2 1)
(make-a-set2 1 2)