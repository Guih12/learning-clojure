;; 7. Cálculo de pagamento com descontos progressivos
;; Uma loja está promovendo uma campanha de descontos progressivos para compras maiores.
;;Se um cliente gastar acima de R$ 500,00, ele recebe um desconto de 5%. Para compras acima de R$ 1000,00, o desconto aumenta para 10%.
;;Crie uma função que receba o valor da compra e retorne o valor final a ser pago com o desconto aplicado.

;; Exemplo:
;; Entrada:
;; (calcular-desconto 1200)
;; Saída esperada:
;; 120

(defn discount
  [value]
    (cond
      (and (>= value 500) (< value 1000)) (* value 0.05)
      (>= value 1000) (* value 0.10)
      :else 0))
