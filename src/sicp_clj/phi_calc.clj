(ns sicp-clj.phi-calc)


(defn abs [x]
  (if (neg? x)
   (- x)
   x))


(defn diff [n]
  (abs (- (* n n) (+ 1 n))))

(defn midpoint [x y]
  (/ (+ x y) 2))

(defn remove-largest-func-result [vec func]
  (let [max-result (apply max (map func vec))]
    (vec (remove #(= max-result (func %)) vec))))

(defn guess []
  (loop [start 1M
         end 3M]
    (println "s " start " e " end)
    (if (> 0.0000001 (diff start))
      start
      (let [search-in [start (midpoint start end)  end]
            mapped (remove-largest-func-result search-in diff)]
        (println search-in)
        (println mapped)
        (recur (first mapped)
               (last mapped))))))

(diff 1.5M)
(diff 1M)
(diff 2M)

(guess)


(defn my-func [x]
  (Math/abs (- x 5)))


;; Returns [1 2 3 4 6 7]


(map diff [3 4 5])


(defn new-boundaries [start end]
  (cond (< (diff start) 
           (diff (midpoint start end)) 
           (diff end))
        [(- start 1) start]
        (> (diff start)
           (diff (midpoint start end))
           (diff end))
        [end (+ end 1)]
        (= (diff start) (diff end))
        [(midpoint start end)]
        :else
        []))


(defn calc_phi []
  (loop [start 1
         end 2]
    (if ())))