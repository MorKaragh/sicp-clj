(ns sicp-clj.pascal-triangle
  (:require [clojure.string :as s]))

(defn calc-row [input]
  (loop [a (first input)
         b 0
         coll input
         row []] 
    (if (nil? a)
      (conj row b) 
      (recur (second coll) 
             (first coll)
             (rest coll)
             (conj row (+ a b))))))

(defn get-triangle [rows]
  (loop [iter rows 
         total [[1]]]
    (if (= iter 0)
      total
      (recur (- iter 1) (conj total (calc-row (last total)))))))

(defn lpad [string pads]
  (str (s/join (repeat pads " ")) string))

(defn remove-brackets [s]
  (clojure.string/replace s #"\[|\]" ""))

(defn print-triangle [rows]
  (let [triangle (get-triangle rows) 
        longest-len (count (remove-brackets (s/join " " (last triangle))))] 
    (doseq [r triangle]
      (let [to-print (remove-brackets (s/join " " r))]
        (println 
         (lpad to-print
                    (/ (- longest-len (count to-print)) 2)))))))

(print-triangle 50)

