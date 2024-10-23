;; 6. Estoque baixo em uma loja
;; Você trabalha no controle de estoque de uma loja e precisa identificar quais produtos estão com o estoque abaixo de 10 unidades, para que sejam reabastecidos.
;;Crie uma função que receba um dicionário com os produtos e seus estoques e retorne apenas os produtos com menos de 10 unidades no estoque.

;; Exemplo:
;; Entrada:
;; (estoque-baixo {"camisas" 8, "sapatos" 15, "calças" 3})
;; Saída esperada:
;; {"camisas" 8, "calças" 3}

(defn estoque-baixo
  [values]
  (into {} (filter (fn [[key value]] (< value 10)) values)))

;;aqui encima eu usei destruturing
;;usando a função into, criamos um novo hash contendo os valores