;; 12. Controle de validade de produtos perecíveis
;; Um supermercado precisa garantir que nenhum produto perecível seja vendido após a sua data de validade. Crie uma função que receba uma lista de produtos com a quantidade de dias restantes para o vencimento e
;;retorne apenas os produtos que estão vencendo em menos de 5 dias.

;; Exemplo:
;; Entrada:
;; (vencimento-proximo {"leite" 3, "pão" 7, "queijo" 2})
;; Saída esperada:
;; {"leite" 3, "queijo" 2}

(defn vencimento-proximo
  [products]
  (into {}
        (filter
          (fn [[key value]] (< value 5))
          products)))

;;cria um novo hash vazio e fazer um insert com os valores retornados