;; 11. Conversão de moeda para viagem internacional
;; João está planejando uma viagem aos EUA e precisa converter seus reais para dólares. A taxa de câmbio atual é de R$ 4,50 por dólar.
;;Crie uma função que receba o valor em reais e a taxa de câmbio, retornando o valor convertido em dólares.

;; Exemplo:
;; Entrada:
;; (converter-moeda 5000 4.5)
;; Saída esperada:
;; 1111.11

(defn convert-coin [value tax] (/ value tax))