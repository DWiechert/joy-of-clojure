(ns joy-of-clojure.chapter1.section1)

(def floop (fn [] (for [x [:a :b], y (range 5) :when (odd? y)] [x y])))

(def dsloop (fn [] (doseq [x [:a :b], y (range 5) :when (odd? y)] (prn x y))))

(do (println (floop)) (println(dsloop)))