(ns tutorial.variables
    (:gen-class))

(defn DataTypes []
      (def a 1)
      (def b 1.25)
      (def c 1.25e-12)
      (def d 0xfbfc)
      (def e nil)
      (def f true)
      (def g "Hello")

      (def status true)
      (def STATUS false)

      (println a)
      (println b)
      (println c)
      (println d)
      (println e)
      (println f)
      (println g)
      (println status)
      (println STATUS)
      )
(DataTypes)