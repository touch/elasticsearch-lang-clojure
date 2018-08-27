(defproject org.clojars.touch/elasticsearch-lang-clojure "0.3.0-SNAPSHOT"
  :description "Clojure script engine for ElasticSearch."
  :url "https://github.com/touch/elastic-lang-clojure"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.logging "0.2.6"]]
  :profiles {:dev {:dependencies [[com.spatial4j/spatial4j "0.3"]
                                  [log4j/log4j "1.2.16"]]}
             :provided {:dependencies [[org.elasticsearch/elasticsearch "1.7.3"]]}}
  :aot #{com.thelastcitadel.es.engine
         com.thelastcitadel.es.plugin}
  :pom-plugins [[org.apache.maven.plugins/maven-toolchains-plugin "1.1"
                {:executions ([:execution
                  [:goals 
                    [:goal toolchain]]])
                :configuration ([:toolchains
                  [:jdk
                    [:version 1.7]
                    [:vendor "oracle"]]])}]])
