(ns sicp-clj.plus)

(defn plus [a b]
  (println "plus " a " " b)
  (if (= a 0)
    b
    (inc (plus (dec a) b))))

(defn other-plus [a b]
  (println "other-plus " a " " b)
  (if (= a 0)
    b
    (other-plus (dec a) (inc b))))

(plus 5 6)
(other-plus 5 6)

