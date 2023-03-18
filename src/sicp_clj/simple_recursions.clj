(ns sicp-clj.simple-recursions)

;; this is recursive procedure
(defn plus [a b]
  (println "plus " a " " b)
  (if (= a 0)
    b
    (inc (plus (dec a) b))))

;; this is recursive process
(defn other-plus [a b]
  (println "other-plus " a " " b)
  (if (= a 0)
    b
    (other-plus (dec a) (inc b))))

(plus 5 6)
(other-plus 5 6)

;; очень быстро растёт, сволоч
(defn ackerman [x y]
  (cond (= y 0) 0
        (= x 0) (* y 2)
        (= y 1) 2
        :else (ackerman (- x 1) (ackerman x (- y 1)))))

(ackerman 3 2)

