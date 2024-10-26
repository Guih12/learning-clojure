;; 14. Previsão de faturamento anual com base em dados mensais
;; Um restaurante deseja prever seu faturamento anual com base nos faturamentos mensais do ano anterior. Crie uma função que receba uma lista com os faturamentos mensais e
;;retorne a previsão de faturamento total para o próximo ano, assumindo que o faturamento mensal permanecerá constante.

;; Exemplo:
;; Entrada:
;; (prever-faturamento [10000 12000 13000])
;; Saída esperada:
;; 126000

(defn prever-faturamento [faturamentos-mensais]
  (* 12 (reduce + faturamentos-mensais)))