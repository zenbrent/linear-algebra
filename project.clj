(defproject linear "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha14"]
                 [incanter "1.5.7"]
                 [org.clojure/math.combinatorics "0.1.4"]
                 [quil "2.5.0"]
                 [org.clojure/tools.namespace "0.2.11"]]
  :main ^:skip-aot linear.core
  :target-path "target/%s"
  :repl-options {:init-ns user}
  :profiles {:uberjar {:aot :all}
             :dev {:source-paths ["dev"]}})
