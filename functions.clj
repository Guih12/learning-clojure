
;;1
(defn sum-numbers
  [x y]
  (+ x y))

;;;;2
;;(defn average-numbers
;;  [& values]
;;  (let ))

;; 3
(defn par?
  [value]
  (= (mod value 2) 0))

;;;4
(defn classification-number
  [value]
  (cond
    (> value 0) "postivo"
    (< value 0) "negativo"
    (= value 0) "zero"))

;;5 factorial

;;def fact(v)
;; v * fact(v-1)
;;end ruby

;;(defn factorial
;;  [value]
;;  (if (= value 1)
;;    1
;;    (* value (factorial (dec value)))))

;;segunda versão;; bem importante, pois consegui resolver usando recursão.
(defn factorial
  [value]
    (if (<= value 1) 
      1 
      (* value (factorial (dec value)))))

;;ruby version
;; def filtra-pares(values):
;; values.filter { |x| x % 2 == 0 }

;;6
(defn filtra-pares [values] (filter even? values))

;;7
;; a função double é para dobrar
(defn double [value] (* value 2))
(defn dobrar [values] (map double values))

;;8
(defn product [values] (reduce * values))

;;9
;;(defn increment-map
;;  [value]
;;    (hash-map :name(get value :name)
;;              :age (inc (get value :age))))

(defn increment-map ;;usando destructuring
  [{:keys [name age]}]
  {:name name :age (inc age)})

(defn incrementa-valores
  [values]
  (map increment-map values))

;; 10
(defn is-positive? [value] (> value 0))

(defn conta-positivos
  [& rest]
    (let [positivos (filter is-positive? rest)]
        (count positivos)))

(defn product-media [values] (reduce + values))

(defn media-valores
  [valores]
  (/ (product-media valores) (count valores)))