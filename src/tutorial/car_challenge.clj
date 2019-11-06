(ns tutorial.car-challenge)

(defn isValidCoupon
      [coupon]
      (def validCoupons ["cp1" "cp2" "cp3"])
      (println "Checking if coupon is valid...")
      (if (some #(= coupon %) validCoupons)
        (do
          (println "The coupon is valid.")
          true)
        (do
          (println "The coupon is invalid.")
          false)
        )
      )

(defn getDiscount
      [coupon]
      (if (isValidCoupon coupon) 0.2 0)
      )

(defn applyDiscount
      [car, discount]
      (let [{originalPrice :CarPrice} car]
           (assoc car :CarPrice (- originalPrice (* originalPrice discount)))
           )
      )

(defn isCarAvailable
      [car budget]
      (let [{price :CarPrice} car] (>= budget price))
      )


(defn getCars
      [discount]
      (defstruct car :CarModel :CarPrice)
      (def cars [(struct car "BMW" 60000)
                 (struct car "FERRARI" 100000)
                 (struct car "FIAT" 20000)
                 ])
      (map (fn([c] (applyDiscount c discount))) cars)
      )

(defn getAvailableCars
      [budget discount]
      (def cars (getCars discount))
      (filter (fn [c] (isCarAvailable c budget)) cars)
      )

(defn getCarOffers
      [budget coupon]
      (def discount (getDiscount coupon))
      (def availableCars (getAvailableCars budget discount))
      (println "You have" (count availableCars) "offers:" )
      (map (fn [car] (let [{m :CarModel p :CarPrice} car] (println m "\t" p))) availableCars)
      )

(getCarOffers 50000 "cp4")
(getCarOffers 50000 "cp1")