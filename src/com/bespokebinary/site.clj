(ns com.bespokebinary.site
  (:require [hiccup.page :as page]))

(defn render [data]
  (page/html5
   [:head]
   [:body
    [:div
     (-> data :entry :content)]]))
