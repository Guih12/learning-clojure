;; 3. Comparação de planos de telefonia
;; Maria está decidindo qual plano de telefonia escolher entre duas opções. O Plano A custa R$ 30,00 por mês e oferece 100 minutos de ligações,
;;com cada minuto extra custando R$ 0,50.
;;O Plano B custa R$ 50,00 por mês e oferece 200 minutos, com cada minuto extra custando R$ 0,20.
;;Ajude Maria a decidir qual plano é mais econômico, dado o número de minutos que ela usa mensalmente.

;; Exemplo:
;; Entrada:
;; (comparar-planos 250)
;; Saída esperada:
;; "Plano B"
;;250 - 100 = 150 * 0.5 = 105 plano A
;;250 - 200 = 50 * 0.5 = 75 Plano B

(defn calculate-plan-a
  [minutes]
  (* 0.50 (- minutes 100)))

(defn calculate-plan-b
  [minutes]
  (* 0.20 (- minutes 200)))

(defn calculate-plan
  [minutes]
  (if (> (calculate-plan-a minutes) (calculate-plan-b minutes))
    (println "PLANO B")
    (println "PLANO A")))