(ns chapter3.section3.listing1)

(def guys-whole-name ["Guy" "Lewis" "Steele"])

; This is more confusing that just manipulating the vector itself
(str (nth guys-whole-name 2) ", "
     (nth guys-whole-name 0) " "
     (nth guys-whole-name 1))

; Here we are destructuring the vector of the whole name into local vars
; This type of positional destructuring only works on sorted items (not Sets or Maps)
(let [[f-name m-name l-name] guys-whole-name]
  (str l-name ", " f-name " " m-name))