(ns chapter2.section2)

; Define lists with parenthesis
; Lists are evaulated (<function name> <parameter> <parameter>...)
; This list will look for a function named 'yankee'
(yankee hotel foxtrot)

; Define vectors with brackets
; Vectors evaluate each item to itself
[1 2 :a :b :c]

; Define maps with curly braces
; Each key/value pair evaluates to itself
{1 "one", 2 "two", 3 "three"}

; Define sets with hash curly braces
; Each value evaluates to itself
; You cannot have duplicate items
#{1 2 "three" :four 0x5}