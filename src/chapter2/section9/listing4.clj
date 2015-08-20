(ns chapter2.section9.listing4
  (:refer chapter1.section4.listing4))

; The refer directive works similar to the use directive, except it only maps libraries which are already loaded
; We can also rename functions using :rename {<function> <new name>}
; If a namespace isn't loaded yet, an exception will be thrown
(lookup (initial-board) "a1")