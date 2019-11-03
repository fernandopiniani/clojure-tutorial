(ns tutorial.functions
    (:gen-class))

(def -main
  "First function"
  []
  (println "My name is Fernando")
  (println "loving Clojure so far")
  (+ 2 5))

(#(println "Hello " %1 " where is " %2"?") "Bruce" "Michael Caine" )

(def increment (fn [x] (+ x 1)))

(defn increment_set
      [x]
      (map increment x))