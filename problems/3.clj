;;The prime factors of 13195 are 5, 7, 13 and 29.

;;What is the largest prime factor of the number 600851475143 ?

(defn prime? [x]
  (let [divisors (range 2 (inc (int (Math/sqrt x))))
        remainders (map (fn [d]
                          (rem x d)) divisors)]
    (not (some zero? remainders))))

(defn factors [number]
  (filter pos? (map (fn [n]
                      (if (zero? (rem number n))
                        n 0))
                    (range 2 (inc (int (Math/sqrt number)))))))

(reduce max (filter prime? (factors 600851475143)))
