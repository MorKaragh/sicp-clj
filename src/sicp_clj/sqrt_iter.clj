(ns sicp-clj.sqrt-iter)

;; (set! *warn-on-reflection* true)

(defn abs [x]
  (if (>= x 0)
    x
    (- x)))

(defn good-enough? [g n] 
  (let [guess (bigdec g)
        x (bigdec n)]
   (<= (abs (- (* guess guess) x)) 0.0001)))

(defn- better-guess [g n]
  (let [guess (bigdec g)
        x (bigdec n)] 
    (with-precision 50 (/ (+ (/ x guess) guess) 2))))

(defn sqrt-iter
  [x]
  {:pre [(pos? x)]} 
  (loop [guess 1M]
    (if (good-enough? guess x)
     (bigdec (format "%.4f" guess))
     (recur (better-guess guess x)))))



