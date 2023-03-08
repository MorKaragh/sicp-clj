(ns sicp-clj.sqrt-iter)

(defn abs [x]
  (if (>= x 0)
    x
    (- x)))

(defn good-enough? [guess x] 
  (<= (abs (- (* guess guess) x)) 0.0001))

(defn- better-guess [guess x]
  (float (/ (+ (/ x guess) guess) 2)))

(defn sqrt-iter
  [x & [guess]]
  {:pre [(pos? x)]}
  (if (good-enough? (or guess 1) x)
    guess
    (sqrt-iter x (better-guess (or guess 1) x))))
