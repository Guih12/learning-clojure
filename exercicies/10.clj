;; 10. Parcelamento de compras em uma loja
;; Um cliente está interessado em parcelar sua compra em até 12 vezes sem juros. Crie uma função que receba o valor total da compra e o número de parcelas desejado, retornando o valor de cada parcela.
;; Exemplo:
;; Entrada:
;; (parcelar-compra 1200 6)
;; Saída esperada:
;; 200

(defn parcelar-compra [value quantidade] (/ value quantidade))