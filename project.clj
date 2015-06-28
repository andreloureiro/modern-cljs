(defproject modern_cljs "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :source-paths ["src/clj" "src/cljs"]
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2069"]
                 [compojure "1.1.6"]
                 [domina "1.0.3"]]

  :plugins [[lein-cljsbuild "1.0.0"]
            [lein-ring "0.8.8"]]

  :ring {
         :handler modern-cljs.core/handler
         }

  :cljsbuild {:builds
              [{
                :source-paths ["src/cljs"]
                :compiler {
                           :output-to "resources/public/js/modern.js"
                           :optimizations :whitespace
                           :pretty-print true
                           }
                }]})
