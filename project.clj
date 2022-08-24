(defproject clj-tuple "0.2.3-griffin"
  :description "Efficient small collections."
  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies []
  :profiles {:dev {:dependencies [[criterium "0.4.1"]
                                  [collection-check "0.1.5"]]}
             :provided {:dependencies [[org.clojure/clojure "1.7.0-alpha5"]]}}
  :global-vars {*warn-on-reflection* true}
  :jvm-opts ^:replace ["-server" "-Xmx500m" "-XX:NewSize=200m"]
  :repositories [["griffin" "s3://griffin-maven-shared-eu-west-2/release"]]
  :plugins [[s3-wagon-private "1.3.5"]])
