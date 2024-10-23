;; 8. Verificação de crédito para financiamento de imóvel
;; João está pensando em financiar um imóvel e precisa saber se ele conseguirá arcar com as prestações mensais.
;;Ele pode pagar no máximo R$ 1000,00 por mês. Crie uma função que receba o valor do imóvel,
;;o número de meses para pagar e o valor máximo que João pode pagar por mês.
;;A função deve retornar "Sim" se João conseguir arcar com as prestações e "Não" caso contrário.

;; Exemplo:
;; Entrada:
;; (verificar-credito 200000 240 1000)
;; Saída esperada:
;; "Não"

(defn verify-credit
  [finance installments salary]
  (if (>= (* salary installments) finance)
    (println  "SIM")
    (println  "NÃO")))