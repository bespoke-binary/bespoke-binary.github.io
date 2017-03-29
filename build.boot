(def project 'bespokebinary/com.bespokebinary)
(def version "0.1.0-SNAPSHOT")

(set-env! :source-paths #{"src" "content"}
          :dependencies   '[[org.clojure/clojure "1.8.0" :scope "test"]
                            [perun "0.4.2-SNAPSHOT" :scope "test"]])

(task-options!
 pom {:project     project
      :version     version
      :description "Static site for bespokebinary.com"
      :url         "http://www.bespokebinary.com"
      :scm         {:url "https://github.com/bespoke-binary/bespokebinary.com"}})
