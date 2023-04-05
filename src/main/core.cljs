(ns main.core
  (:require [util.hiccup :refer (compile-html)]))

(prn (compile-html '[:div "ok"]))
