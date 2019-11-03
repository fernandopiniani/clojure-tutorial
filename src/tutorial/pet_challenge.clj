(ns tutorial.pet-challenge
    (:gen-class))

(defn getAnimalAgeMultiplier
      "Get multiplier according to animal species"
      [species]
      (def animalMultiplier {'DOG 7, 'CAT 5, 'FISH 10})
      (get animalMultiplier species))

(defn getPetAgeInHumanYears
      "Convert pet age in human years"
      [age, species]
      (* age (getAnimalAgeMultiplier species)))

(defn printPetAgeInHumanYears
      "Show conversion result",
      [age, species]
      (def humanAge  (getPetAgeInHumanYears age species))
      (println "The human age for a" species "of" age "is" humanAge "in human years."))

(printPetAgeInHumanYears 10 'DOG)
(printPetAgeInHumanYears 10 'CAT)
(printPetAgeInHumanYears 10 'FISH)
