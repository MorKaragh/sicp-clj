(ns sicp-clj.misc)

(defn remove-largest-func-result [vec func]
  (let [max-result (apply max (map func vec))]
    (vec (remove #(= max-result (func %)) vec))))