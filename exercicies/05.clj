;; 5. Divisão de gorjetas entre garçons
;; No final de cada turno, os garçons de um restaurante dividem igualmente as gorjetas arrecadadas.
;;Sua tarefa é criar uma função que receba o valor total das gorjetas e o número de garçons no turno,
;;retornando quanto cada garçom deve receber.

;; Exemplo:
;; Entrada:
;; (dividir-gorjeta 300 4)
;; Saída esperada:
;; 75

(defn divide-tip [value waiters] (/ value waiters))