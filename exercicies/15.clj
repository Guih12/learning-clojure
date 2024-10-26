;; 15. Controle de temperatura de um freezer industrial
;; Um freezer industrial precisa manter sua temperatura entre -10°C e -5°C para garantir a conservação adequada dos alimentos.
;;Crie uma função que receba a temperatura atual do freezer e retorne true se a temperatura estiver dentro do intervalo seguro e false caso contrário.

;; Exemplo:
;; Entrada:
;; (temperatura-segura? -7)
;; Saída esperada:
;; true

(defn temperatura-segura?
  [temp]
    (<= -10 temp -5))