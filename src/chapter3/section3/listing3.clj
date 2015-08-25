(ns chapter3.section3.listing3)

(def guys-name-map
  {:f-name "Guy" :m-name "Lewis" :l-name "Steele"})

; Here we can destructure a map using another name
; We are defining new local vars based on the vars in the map itself, hence why we have same names as both keys and values
(let [{f-name :f-name, m-name :m-name, l-name :l-name} guys-name-map]
  (str l-name ", " f-name " " m-name))

; A shortcut to re-defining the whole map is to use the :keys form
(let [{:keys [f-name m-name l-name]} guys-name-map]
  (str l-name ", " f-name " " m-name))

; Just like vectors, we can assign the raw input to a whole map by using :as
(let [{f-name :f-name, :as whole-name} guys-name-map]
  whole-name)

; By default, keys which are not found in the input are nil
; Instead, we can provide a default with the :or form
(let [{:keys [title f-name m-name l-name], :or {title "Mr."}} guys-name-map]
  (println title f-name m-name l-name))

; We can also destructure by providing indicies to the local vars
(let [{first-thing 0, last-thing 3} [1 2 3 4]]
  [first-thing last-thing])