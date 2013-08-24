(defproject clj-tuple "0.1.0-SNAPSHOT"
  :description "Highly efficient containers for small numbers of elements."
  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies []
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.5.1"]
                                  [criterium "0.4.1"]
                                  [reiddraper/simple-check "0.2.1"]]}}
  :global-vars {*warn-on-reflection* true}
  :test-selectors {:benchmark :benchmark
                   :default (complement :benchmark)}
  :jvm-opts ^:replace ["-server" "-Xmx500m" "-XX:NewSize=200m"])