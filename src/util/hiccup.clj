(ns util.hiccup
  (:require [hicada.compiler :refer [compile]]))

  
(defmacro compile-html [body]
  (hicada.compiler/compile 
    body
    {:create-element 'react/createElement}))
     ; :transform-fn (comp)
     ; :array-children? false}))
