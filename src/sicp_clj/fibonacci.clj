(ns sicp-clj.fibonacci)

;; tree recursion
(defn fib [n]
  {:pre [(>= n 0)]}
  (cond (= n 0) 0
        (= n 1) 1
        :else (+ (fib (- n 1)) (fib (- n 2)))))


;; linear recursion
(defn- fib-iter-inner [a b count]
  (println a b count)
  (if (= count 0)
    b
    (fib-iter-inner (+ a b) a (- count 1))))
(defn fib-iter [n]
  (fib-iter-inner 1 0 n))

(fib-iter 10)


