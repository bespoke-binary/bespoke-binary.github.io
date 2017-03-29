(set-env! :source-paths #{"src" "content"}
          :dependencies '[[perun "0.4.2-SNAPSHOT"     :scope "test"]
                          [hiccup "1.0.5"             :scope "test"]])

(task-options!
 pom {:project     'com.bespokebinary/bespokebinary.com
      :version     "0.1.0-SNAPSHOT"
      :description "Static site for bespokebinary.com"
      :url         "http://www.bespokebinary.com"
      :scm         {:url "https://github.com/bespoke-binary/bespokebinary.com"}})

(require '[io.perun :refer :all])

(deftask build []
  (comp
   (markdown)
   (render :renderer 'com.bespokebinary.site/render)
   (target)))
