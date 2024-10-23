;; 4. Lucro anual de uma loja
;; Uma loja de roupas deseja calcular o seu lucro anual com base nas vendas e despesas de cada mês.
;;Você deve criar uma função que receba uma lista com as vendas mensais e outra com as despesas mensais,
;;retornando o lucro total ao final do ano. Lembre-se que o lucro é a diferença entre as vendas e as despesas.

;; Exemplo:
;; Entrada:
;; (calcular-lucro-anual [10000 12000 15000] [8000 9000 10000])
;; Saída esperada:
;; 9000

;;37000 - 27000
;;
;;(defn calculate-lucro-anual
;;  [vendas despesas]
;;  (- (reduce + vendas) (reduce + despesas)))

(defn calculate-lucro-anual
  [vendas despesas]
  (reduce + (map - vendas despesas))) ;;jeito mais clojure