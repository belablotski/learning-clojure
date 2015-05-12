; http://clojure.github.io/clojure/clojure.java.browse-api.html

(require '[clojure.java.browse])
(clojure.java.browse/browse-url "http://google.com")

(use '[clojure.java.browse])
(browse-url "http://google.com")

