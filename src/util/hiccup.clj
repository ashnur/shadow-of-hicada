(ns util.hiccup)

  
(defmacro compile-html [body]
  `(compile-html-helper ~body))
