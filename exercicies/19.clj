;; 19. Análise de despesas pessoais
;; Ana está organizando suas finanças e precisa analisar suas despesas mensais. Ela deseja saber qual foi a categoria que mais gastou no mês, considerando categorias como alimentação, transporte e lazer.
;;Crie uma função que receba um dicionário com as categorias e seus respectivos gastos e retorne a categoria com o maior gasto.

;; Exemplo:
;; Entrada:
;; (categoria-maior-gasto {"alimentacao" 400, "transporte" 200, "lazer" 300})
;; Saída esperada:
;; "alimentacao"

(defn categoria-maior-gasto
  [values]
  (key (apply max-key val values)))