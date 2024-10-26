;; 9. Avaliação de desempenho dos funcionários
;;Um gerente de uma empresa deseja avaliar o desempenho de seus funcionários com base no percentual de metas atingidas durante o ano.
;;Se o funcionário atingir mais de 90% da meta, ele recebe uma avaliação "Excelente". Se atingir entre 80% e 90%, a avaliação será "Bom". Abaixo disso, a avaliação será "Precisa Melhorar".
;;Crie uma função que receba o percentual de metas atingido e retorne a avaliação correspondente.

;; Exemplo:
;; Entrada:
;; (avaliar-desempenho 88)
;; Saída esperada:
;; "Bom"

;;(defn avaliar-desempenho
;;  [value]
;;  (cond
;;    (and (>= (/ value 100) 0.8) (<= (/ value 100) 0.9)) (println "Bom")
;;    :else (println "Precisa melhorar")))

(defn avaliar-desempenho
  [value]
  (let [nota (/ value 100)]
    (if (<= 0.8 nota 0.9)
      (println "Bom")
      (println "Precisa melhorar"))))
;;usando o bind let para criar uma variavel