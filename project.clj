(defproject joy-of-clojure "0.1.0-SNAPSHOT"
  :description "Working through examples in 'The Joyy of Clojure'"
  :url "https://github.com/DWiechert/joy-of-clojure"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :main ^:skip-aot joy-of-clojure.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
