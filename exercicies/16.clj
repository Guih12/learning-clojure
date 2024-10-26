;; 16. Previsão de economia com energia solar
;; João está pensando em instalar painéis solares em sua casa para economizar na conta de luz. Ele deseja calcular quanto economizaria por mês,
;;sabendo seu consumo médio de energia e a produção estimada dos painéis. Crie uma função que receba o consumo mensal de energia (em kWh) e a produção estimada de energia solar, retornando o valor economizado.

;; Exemplo:
;; Entrada:
;; (economia-energia 500 300)
;; Saída esperada:
;; 300

(defn economia-energia
  [consume production]
  (min consume production))