
;; 1)
(defn sum-numbers
  [n1 n2]
  (+ n1 n2))

;; 2)
(defn sub-numbers
  [x y]
  (let [result (- x y)]
    (if (<= result 0)
      "negativo"
      result)))

;; a variavel é criada a nível de escopo apenas

;; 3)
(defn product_numbers
  [x y z]
  (* x y z))

;; 4)
(defn is-odd
  [x]
  (let [result (mod x 2)]
    (if (= result 0)
      (println "par")
      (println "impar"))))

;; 5)
(defn divide-numbers
  [x y]
  (if (= y 0)
    "divisão por zero"
    (/ x y)))

;; 6)
(defn absolute-value
  [value]
  (abs value))

;; 7)
(defn compare-numbers
  [x y]
  (cond
    (> x y) "maior"
    (< x y) "menor"
    (= x y) "igual"))
;; usar cond para quando precisa ter várias comparações

;; 8)
(defn max-numbers
  [x y z]
  (cond
    (and (>= x y) (>= x z)) x
    (and (>= y x) (>= y z)) y
    :else z))
;;usar cond para quando tiver mais comparacões

;; 9
(defn number-pow
  [x y]
  (int(Math/pow x y)))

;; 10
(defn number-is-negative?
  [x]
  (if (>= x 0)
    "não negativo"
    "negativo"))