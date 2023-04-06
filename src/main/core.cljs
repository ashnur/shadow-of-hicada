(ns main.core
  (:require [util.hiccup :refer (compile-html)]
            ["react" :as react]
            ["react-dom/client" :as react-dom :refer [createRoot]]))

(def root (createRoot (.-root js/window)))

(.render root (clj->js (compile-html '[:div "whel"])))
