(ns sicp-clj.factorial)

(defn factorial [x]
  (loop [curr (bigdec x)
         total (bigdec x)]
    (if (== curr 1)
      total
      (recur (- curr 1) (* total (- curr 1)))))) 
