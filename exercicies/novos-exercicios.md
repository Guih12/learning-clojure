### Exercícios de Clojure - Mundo Real

```clojure
# 1. Cálculo de bonificação anual
### Você é o responsável pela folha de pagamento de uma empresa que oferece uma bonificação anual aos funcionários que atingirem uma determinada meta de performance. 
A empresa paga um bônus de 10% do salário para aqueles que atingirem 80% ou mais da meta estabelecida. 
Sua tarefa é criar uma função que receba o salário de um funcionário e o percentual de metas atingidas, 
retornando o valor da bonificação a ser pago. Se o funcionário não atingir o percentual mínimo de 80%, o bônus deve ser 0.

;; Exemplo:
;; Entrada:
;; (calcular-bonificacao 5000 85)
;; Saída esperada:
;; 500

;; 2. Consumo de combustível em uma viagem
;; Você está planejando uma viagem de carro e deseja calcular o consumo de combustível necessário. Seu carro consome, em média, uma quantidade específica de litros por quilômetro rodado. 
Crie uma função que receba a distância total da viagem em quilômetros e o consumo médio do carro (km por litro), retornando o número de litros de combustível necessários para completar a viagem.

;; Exemplo:
;; Entrada:
;; (calcular-combustivel 300 15)
;; Saída esperada:
;; 20

;; 3. Comparação de planos de telefonia
;; Maria está decidindo qual plano de telefonia escolher entre duas opções. O Plano A custa R$ 30,00 por mês e oferece 100 minutos de ligações, com cada minuto extra custando R$ 0,50. 
O Plano B custa R$ 50,00 por mês e oferece 200 minutos, com cada minuto extra custando R$ 0,20. Ajude Maria a decidir qual plano é mais econômico, dado o número de minutos que ela usa mensalmente.
;; Exemplo:
;; Entrada:
;; (comparar-planos 250)
;; Saída esperada:
;; "Plano B"

;; 4. Lucro anual de uma loja
;; Uma loja de roupas deseja calcular o seu lucro anual com base nas vendas e despesas de cada mês. Você deve criar uma função que receba uma lista com as vendas mensais e outra com as despesas mensais,
 retornando o lucro total ao final do ano. Lembre-se que o lucro é a diferença entre as vendas e as despesas.
 
;; Exemplo:
;; Entrada:
;; (calcular-lucro-anual [10000 12000 15000] [8000 9000 10000])
;; Saída esperada:
;; 9000

;; 5. Divisão de gorjetas entre garçons
;; No final de cada turno, os garçons de um restaurante dividem igualmente as gorjetas arrecadadas. Sua tarefa é criar uma função que receba o valor total das gorjetas e o número de garçons no turno, 
retornando quanto cada garçom deve receber.

;; Exemplo:
;; Entrada:
;; (dividir-gorjeta 300 4)
;; Saída esperada:
;; 75

;; 6. Estoque baixo em uma loja
;; Você trabalha no controle de estoque de uma loja e precisa identificar quais produtos estão com o estoque abaixo de 10 unidades, para que sejam reabastecidos. 
Crie uma função que receba um dicionário com os produtos e seus estoques e retorne apenas os produtos com menos de 10 unidades no estoque.

;; Exemplo:
;; Entrada:
;; (estoque-baixo {"camisas" 8, "sapatos" 15, "calças" 3})
;; Saída esperada:
;; {"camisas" 8, "calças" 3}

;; 7. Cálculo de pagamento com descontos progressivos
;; Uma loja está promovendo uma campanha de descontos progressivos para compras maiores. Se um cliente gastar acima de R$ 500,00, ele recebe um desconto de 5%. Para compras acima de R$ 1000,00, o desconto aumenta para 10%. 
Crie uma função que receba o valor da compra e retorne o valor final a ser pago com o desconto aplicado.

;; Exemplo:
;; Entrada:
;; (calcular-desconto 1200)
;; Saída esperada:
;; 1080

;; 8. Verificação de crédito para financiamento de imóvel
;; João está pensando em financiar um imóvel e precisa saber se ele conseguirá arcar com as prestações mensais. Ele pode pagar no máximo R$ 1000,00 por mês. Crie uma função que receba o valor do imóvel, 
o número de meses para pagar e o valor máximo que João pode pagar por mês. A função deve retornar "Sim" se João conseguir arcar com as prestações e "Não" caso contrário.

;; Exemplo:
;; Entrada:
;; (verificar-credito 200000 240 1000)
;; Saída esperada:
;; "Não"

;; 9. Avaliação de desempenho dos funcionários
Um gerente de uma empresa deseja avaliar o desempenho de seus funcionários com base no percentual de metas atingidas durante o ano. 
Se o funcionário atingir mais de 90% da meta, ele recebe uma avaliação "Excelente". Se atingir entre 80% e 90%, a avaliação será "Bom". Abaixo disso, a avaliação será "Precisa Melhorar". 
Crie uma função que receba o percentual de metas atingido e retorne a avaliação correspondente.

;; Exemplo:
;; Entrada:
;; (avaliar-desempenho 88)
;; Saída esperada:
;; "Bom"

;; 10. Parcelamento de compras em uma loja
;; Um cliente está interessado em parcelar sua compra em até 12 vezes sem juros. Crie uma função que receba o valor total da compra e o número de parcelas desejado, retornando o valor de cada parcela.
;; Exemplo:
;; Entrada:
;; (parcelar-compra 1200 6)
;; Saída esperada:
;; 200

;; 11. Conversão de moeda para viagem internacional
;; João está planejando uma viagem aos EUA e precisa converter seus reais para dólares. A taxa de câmbio atual é de R$ 4,50 por dólar. 
Crie uma função que receba o valor em reais e a taxa de câmbio, retornando o valor convertido em dólares.

;; Exemplo:
;; Entrada:
;; (converter-moeda 5000 4.5)
;; Saída esperada:
;; 1111.11

;; 12. Controle de validade de produtos perecíveis
;; Um supermercado precisa garantir que nenhum produto perecível seja vendido após a sua data de validade. Crie uma função que receba uma lista de produtos com a quantidade de dias restantes para o vencimento e 
retorne apenas os produtos que estão vencendo em menos de 5 dias.

;; Exemplo:
;; Entrada:
;; (vencimento-proximo {"leite" 3, "pão" 7, "queijo" 2})
;; Saída esperada:
;; {"leite" 3, "queijo" 2}

;; 13. Verificação de senha segura em um sistema
;; Um sistema de cadastro de usuários precisa garantir que as senhas fornecidas sejam seguras. A senha deve ter no mínimo 8 caracteres, conter pelo menos uma letra maiúscula, uma letra minúscula, um número e um caractere especial. 
Crie uma função que receba uma senha e retorne true se ela for válida e false caso contrário.

;; Exemplo:
;; Entrada:
;; (senha-valida? "Clojure@2024")
;; Saída esperada:
;; true

;; 14. Previsão de faturamento anual com base em dados mensais
;; Um restaurante deseja prever seu faturamento anual com base nos faturamentos mensais do ano anterior. Crie uma função que receba uma lista com os faturamentos mensais e 
retorne a previsão de faturamento total para o próximo ano, assumindo que o faturamento mensal permanecerá constante.

;; Exemplo:
;; Entrada:
;; (prever-faturamento [10000 12000 13000])
;; Saída esperada:
;; 126000

;; 15. Controle de temperatura de um freezer industrial
;; Um freezer industrial precisa manter sua temperatura entre -10°C e -5°C para garantir a conservação adequada dos alimentos. 
Crie uma função que receba a temperatura atual do freezer e retorne true se a temperatura estiver dentro do intervalo seguro e false caso contrário.

;; Exemplo:
;; Entrada:
;; (temperatura-segura? -7)
;; Saída esperada:
;; true

;; 16. Previsão de economia com energia solar
;; João está pensando em instalar painéis solares em sua casa para economizar na conta de luz. Ele deseja calcular quanto economizaria por mês, 
sabendo seu consumo médio de energia e a produção estimada dos painéis. Crie uma função que receba o consumo mensal de energia (em kWh) e a produção estimada de energia solar, retornando o valor economizado.

;; Exemplo:
;; Entrada:
;; (economia-energia 500 300)
;; Saída esperada:
;; 300

;; 17. Quilometragem para manutenção de veículos
;; Um aplicativo de transporte deseja lembrar seus motoristas quando seus veículos precisarem de manutenção. A manutenção deve ser realizada a cada 10.000 km. Crie uma função que receba a quilometragem atual do
veículo e a quilometragem de manutenção anterior e retorne um aviso se a manutenção estiver próxima (menos de 1.000 km até a próxima manutenção).

;; Exemplo:
;; Entrada:
;; (manutencao-proxima 9800 8500)
;; Saída esperada:
;; "A manutenção está próxima! Faltam 200 km."

;; 18. Cálculo do tempo de entrega de um pedido
;; Você trabalha em uma empresa de logística e precisa calcular o tempo estimado de entrega de um pedido. O tempo de entrega padrão é de 3 dias úteis, mas pode aumentar dependendo da localização do cliente.
Se a entrega for para uma área rural, adicione mais 2 dias.Crie uma função que receba a localização e retorne o tempo total de entrega.

;; Exemplo:
;; Entrada:
;; (tempo-entrega "rural")
;; Saída esperada:
;; "O tempo estimado de entrega é de 5 dias úteis."

;; 19. Análise de despesas pessoais
;; Ana está organizando suas finanças e precisa analisar suas despesas mensais. Ela deseja saber qual foi a categoria que mais gastou no mês, considerando categorias como alimentação, transporte e lazer. 
Crie uma função que receba um dicionário com as categorias e seus respectivos gastos e retorne a categoria com o maior gasto.

;; Exemplo:
;; Entrada:
;; (categoria-maior-gasto {"alimentacao" 400, "transporte" 200, "lazer" 300})
;; Saída esperada:
;; "alimentacao"

;; 20. Planejamento de férias
;; Carlos deseja planejar suas férias e precisa calcular o custo total de sua viagem, incluindo passagens, hospedagem e alimentação. Crie uma função que receba os valores dessas despesas e retorne o custo total da viagem.
;; Exemplo:
;; Entrada:
;; (custo-viagem 1500 2000 800)
;; Saída esperada:
;; 4300

;; 21. Verificação de estoque de produtos eletrônicos
;; Uma loja de eletrônicos deseja verificar quais produtos estão com estoque crítico (menos de 5 unidades). Crie uma função que receba um dicionário de produtos e suas quantidades, 
e retorne uma lista com os produtos que precisam ser reabastecidos.

;; Exemplo:
;; Entrada:
;; (estoque-critico {"smartphone" 4, "tablet" 10, "notebook" 2})
;; Saída esperada:
;; ("smartphone" "notebook")

;; 22. Cálculo do índice de massa corporal (IMC)
;; João quer acompanhar sua saúde e decidiu calcular seu IMC. O IMC é calculado dividindo o peso da pessoa pela altura ao quadrado. Crie uma função que receba o peso (em kg) e a altura (em metros) e retorne o valor do IMC.
;; Exemplo:
;; Entrada:
;; (calcular-imc 70 1.75)
;; Saída esperada:
;; 22.86

;; 23. Análise de sentimentos em comentários
;; Você está desenvolvendo um sistema para analisar comentários em redes sociais e deseja identificar se um comentário é positivo, negativo ou neutro. 
Crie uma função que receba um comentário e retorne o tipo de sentimento baseado em palavras-chave.

;; Exemplo:
;; Entrada:
;; (analisar-comentario "Adorei o produto!")
;; Saída esperada:
;; "Positivo"

;; 24. Calculadora de juros compostos
;; Maria deseja investir seu dinheiro e precisa calcular o montante que receberá após um determinado tempo com juros compostos. 
Crie uma função que receba o capital inicial, a taxa de juros e o tempo em anos e retorne o montante final.

;; Exemplo:
;; Entrada:
;; (calcular-juros-compostos 1000 5 3)
;; Saída esperada:
;; 1157.63

;; 25. Sistema de reservas de hotéis
;; Um hotel deseja criar um sistema de reservas e precisa saber quantas reservas estão disponíveis para uma determinada data. 
Crie uma função que receba a data e o número total de quartos e o número de reservas já realizadas, retornando o número de quartos disponíveis.

;; Exemplo:
;; Entrada:
;; (reservas-disponiveis "2024-10-20" 50 30)
;; Saída esperada:
;; 20
