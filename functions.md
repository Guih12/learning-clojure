# Exercícios de Clojure

```clojure
## 1. Função Simples (Fácil)
Crie uma função chamada `soma` que recebe dois números e retorna a soma deles.

(defn soma [a b]
  ;; Implementar a soma aqui
)

## 2. Função com Aridade Variável (Fácil)
Crie uma função chamada `media` que recebe uma quantidade variável de números e retorna a média deles.

(defn media [& numeros]
  ;; Implementar o cálculo da média aqui
)

## 3. Verificação de Par (Intermediária)
Crie uma função chamada `par?` que recebe um número e retorna `true` se o número for par e `false` caso contrário.

(defn par? [n]
  ;; Implementar a verificação aqui
)

## 4. Fluxo de Controle com Condições (Intermediária)
Crie uma função chamada `classifica-numero` que recebe um número e retorna "positivo", "negativo" ou "zero".

(defn classifica-numero [n]
  ;; Implementar a classificação aqui
)

## 5. Recursão Simples (Intermediária)
Crie uma função chamada `fatorial` que calcula o fatorial de um número usando recursão.

(defn fatorial [n]
  ;; Implementar o cálculo do fatorial aqui
)

## 6. Filtragem de Lista (Difícil)
Crie uma função chamada `filtra-pares` que recebe uma lista de números e retorna uma nova lista contendo apenas os números pares.

(defn filtra-pares [numeros]
  ;; Implementar a filtragem aqui
)

## 7. Mapeamento com Funções (Difícil)
Crie uma função chamada `dobrar` que recebe uma lista de números e retorna uma nova lista com cada número dobrado.

(defn dobrar [numeros]
  ;; Implementar o mapeamento aqui
)

## 8. Uso de `reduce` (Difícil)
Crie uma função chamada `produto` que calcula o produto de uma lista de números usando a função `reduce`.

(defn produto [numeros]
  ;; Implementar o cálculo do produto aqui
)

## 9. Manipulação de Mapas (Difícil)
Crie uma função chamada `incrementa-valores` que recebe um mapa e retorna um novo mapa com todos os valores incrementados em 1.

(defn incrementa-valores [m]
  ;; Implementar a manipulação de mapas aqui
)

## 10. Função com Parâmetros Rest e Condições (Difícil)
Crie uma função chamada `conta-positivos` que recebe uma quantidade variável de números e retorna a contagem de quantos deles são positivos.

(defn conta-positivos [& numeros]
  ;; Implementar a contagem de positivos aqui
)