(ns chapter3.section1)

; Every value is true to the if form except for false and nil:
; - Zero-length strings
; - Empty lists
; - The number zero
(if true :truthy :falsey) ; truthy
(if [] :truthy :falsey) ; truthy
(if nil :truthy :falsey) ; falsey
(if false :truthy :falsey) ; falsey

; Do not use Boolean.true/false provided from Java
; Instead, use Boolean.valueOf to get the proper boolean object
(if (Boolean/valueOf "false") :truthy :falsey) ; falsey

; Since nil is false by default, you can check nil by using nil?
; You can also check false by using false?
(when (nil? nil) "Actually nil, not false.")