(ns chapter2.section9.listing2
  (:require [clojure.set :as s]))

; We are requiring the use of the clojure.set namespace
; We are also renaming the namespace from clojure.set to s
; So instead of clojure.set/intersection we can write it as s/intersection
(s/intersection #{1 2 3} #{3 4 5})