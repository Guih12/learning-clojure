;;;; 2. Consumo de combustível em uma viagem
;;;; Você está planejando uma viagem de carro e deseja calcular o consumo de combustível necessário.
;;;Seu carro consome, em média, uma quantidade específica de litros por quilômetro rodado.
;;Crie uma função que receba a distância total da viagem em quilômetros e o consumo médio do carro (km por litro),
;;;retornando o número de litros de combustível necessários para completar a viagem.

;; Exemplo:
;; Entrada:
;; (calcular-combustivel 300 15)
;; Saída esperada:
;; 20

(defn calculate-fuel
  [quilometers average]
  (/ quilometers average))