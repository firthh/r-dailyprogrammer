(defproject problem-154 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :profiles {:dev {
                   :plugins [[lein-midje "3.1.1"]
                             [lein-ancient "0.4.0"]]
                   :dependencies [[midje "1.6.3"]
                                  ]}
             })
