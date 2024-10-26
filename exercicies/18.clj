;; 18. Cálculo do tempo de entrega de um pedido
;; Você trabalha em uma empresa de logística e precisa calcular o tempo estimado de entrega de um pedido. O tempo de entrega padrão é de 3 dias úteis, mas pode aumentar dependendo da localização do cliente.
;;Se a entrega for para uma área rural, adicione mais 2 dias.Crie uma função que receba a localização e retorne o tempo total de entrega.

;; Exemplo:
;; Entrada:
;; (tempo-entrega "rural")
;; Saída esperada:
;; "O tempo estimado de entrega é de 5 dias úteis."

(defn tempo-entrega
  [value]
  (if (= value "rural")
    (let [tempo (+ 3 2)] (println "O tempo estimado de entrega é de" tempo "dias uteis"))
    (println "O tempo estimado de entrega é de 3 dias uteis")))