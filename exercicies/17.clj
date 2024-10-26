;; 17. Quilometragem para manutenção de veículos
;; Um aplicativo de transporte deseja lembrar seus motoristas quando seus veículos precisarem de manutenção. A manutenção deve ser realizada a cada 10.000 km. Crie uma função que receba a quilometragem atual do
;;veículo e a quilometragem de manutenção anterior e retorne um aviso se a manutenção estiver próxima (menos de 1.000 km até a próxima manutenção).

;; Exemplo:
;; Entrada:
;; (manutencao-proxima 9800 8500)
;; Saída esperada:
;; "A manutenção está próxima! Faltam 200 km."

(defn manutencao-proxima
  [current-km previous-km]
  (if (< current-km 10000)
    (let [calc (- 10000 current-km)] (println "A manutenção está próxima! Faltam" calc "Km."))
    (println "Você precisa fazer manutenção urgente")))