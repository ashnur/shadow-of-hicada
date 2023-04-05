(ns util.hiccup
  (:require ["react" :as react])
  (:require-macros [util.hiccup] [hicada.compiler :refer [compile]]))


(defn compile-html-helper
  [body]
  (prn body)
  (hicada.compiler/compile body {:create-element react/createElement
                                 :transform-fn (comp)
                                 :array-children? false}))
