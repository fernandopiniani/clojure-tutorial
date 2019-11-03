(ns tutorial.pet-challenge
    (:gen-class))

(def animalMultiplier {:DOG 7, :CAT 5, :FISH 10})

(defn petAgeInHumanYears
      [age, animal]
      (* age (get animalMultiplier animal)))