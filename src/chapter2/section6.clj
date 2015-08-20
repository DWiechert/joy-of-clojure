(ns chapter2.section6)

; When a list is evaluated, the first argument is the function name and the rest are the parameters
(cons 1 [2 3])

; But we can quote the expression to print itself and not evaluate anything
(quote (cons 1 [2 3]))

; If we want 2, 3 to be in a list instead of vector, we need to quote the list
; That way it won't try to map 2 to a function but instead treat it as a list
(cons 1 (quote (2 3)))

; We can also use apostrophe (') as a shortcut for the quote form
(cons 1 '(2 3))

; Though quoting works for all expressions inside of the quote form, not just the top level where it's defined
[1 (+ 2 3)]
'(1 (+ 2 3))

; Syntax quoting is used to construct collections to be used as code themselves
; Syntax quoting is done with a back-tick
`(1 2 3)

; We can even syntax quote namespaces to make qualified symbols
`map
`Integer
`(map even? [1 2 3])
`is-always-right

; If we want to quote some outer expression but not the inner expression, we can unquote the inner one
; We use the tilde to unquote an expression
`(+ 10 (* 3 2))
`(+ 10 ~(* 3 2))