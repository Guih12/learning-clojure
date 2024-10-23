;;# 1. Cálculo de bonificação anual
;;### Você é o responsável pela folha de pagamento de uma empresa que oferece uma bonificação anual aos funcionários que atingirem uma determinada meta de performance.
;;A empresa paga um bônus de 10% do salário para aqueles que atingirem 80% ou mais da meta estabelecida.
;;Sua tarefa é criar uma função que receba o salário de um funcionário e o percentual de metas atingidas,
;;retornando o valor da bonificação a ser pago. Se o funcionário não atingir o percentual mínimo de 80%, o bônus deve ser 0.

;; Exemplo:
;; Entrada:
;; (calcular-bonificacao 5000 85)
;; Saída esperada:
;; 500

(defn calculate-goal
  [salary percent]
    (if (>= salary 80)
      (* salary 0.10)
      0))