(ns com.bespokebinary.site
  (:require [hiccup.page :as page]))

(defn render [data]
  (page/html5
   [:head
    (page/include-css "/css/normalize.css"
                      "/css/app.css")]
   [:body
    [:div.container
     [:div.main
      (-> data :entry :content)]]]))
