
;; exercicio 1
(defn upper-case
  [string]
  (clojure.string/upper-case string))

;; exercicio 2

(defn sum-numbers
  [values]
  (reduce + values))

;; exercicio 3
(defn reverse-string
  [string]
  (str (reverse string)))

;; exercício 4
(defn concat-lists
  [list-1 list-2]
  (concat list-1 list-2))

;; exercicio 5
(defn number-is-odd?
  [number]
  (if (= (mod number 2) 0)
    true
    false))

;;exercicio 6
(defn create-person
  [name age]
  (hash-map :nome name :age age))

;;exercicio 7
(defn multiple-numbers
  [values]
  (map #(* % 2) values))

;; exercicio 8
(defn max-number
  [values]
  (reduce max values))

;;(defn filter-numbers-impares
;;  [values]
;;  (map #(2)))

(defn average-values
  [values]
  (/ (apply + values) (count values)))