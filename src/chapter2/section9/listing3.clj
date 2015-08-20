(ns chapter2.section9.listing3
  (:use [clojure.string :only [capitalize]]))

; By using use, we can omit the namespace when calling the function
; We are also limiting which functions we importing using the only directive
; We can also rename functions using :rename {<function> <new name>}
(map capitalize ["kilgore" "trout"])