# Lista de Exercícios em Clojure

Esta lista de exercícios foi criada para ajudar você a se familiarizar com as principais estruturas de dados e funcionalidades idiomáticas de Clojure. Para cada exercício, escreva testes básicos para validar o comportamento e os resultados do código.

---

## Exercício 1: Manipulação de Listas
**Objetivo:** Praticar operações básicas com listas, incluindo `cons`, `conj`, `first`, `rest`, `map`, e `filter`.

**Instruções:**  
1. Crie uma função chamada `manipular-lista` que recebe uma lista de números.
2. A função deve retornar uma nova lista que:
   - Adiciona o número `0` ao início.
   - Adiciona o número `99` ao final.
   - Filtra apenas números pares.
   - Dobra cada valor restante.

**Exemplos:**
```clojure
(manipular-lista [1 2 3 4 5 6]) ;=> (0 4 8 12 99)


## Exercício 2: Manipulação de Vetores

**Objetivo:** Familiarizar-se com vetores e operações de indexação usando get, assoc e iteração.

**Instruções**:

1) Implemente uma função substituir-valor que receba um vetor e um índice, e substitua o valor presente nesse índice pelo dobro do valor.
Se o índice estiver fora dos limites do vetor, retorne o vetor original.

**Exemplos:**
```clojure
(substituir-valor [10 20 30 40] 2) ;=> [10 20 60 40]
(substituir-valor [10 20 30 40] 4) ;=> [10 20 30 40]

## Exercício 3: Trabalho com Mapas

**Objetivo**: Praticar manipulação de pares chave-valor em mapas usando assoc, get, e contains?.

**Instruções**:

1) Crie uma função atualizar-idade que recebe um mapa representando uma pessoa ({:nome "Ana" :idade 25}) e uma nova idade.

2) A função deve:
    - Adicionar ou atualizar a idade da pessoa.
    - Verificar se a chave :idade existe. Se não existir, retorne um mapa com a idade atualizada.
    - Retorne o mapa resultante.

**Exemplos:**
```clojure
(atualizar-idade {:nome "Ana" :idade 25} 26) ;=> {:nome "Ana" :idade 26}
(atualizar-idade {:nome "João"} 30) ;=> {:nome "João" :idade 30}


## Exercício 4: Manipulação de Conjuntos (Sets)

**Objetivo**: Entender a manipulação de conjuntos, incluindo verificação de pertencimento e operações de união e interseção.

**Instruções**:

1) Implemente uma função analisar-numeros que recebe dois conjuntos de números.
2) A função deve:
    - Retornar um conjunto com os números presentes em ambos os conjuntos (interseção).
    - Retornar um conjunto com todos os números únicos de ambos os conjuntos (união).

**Exemplos:**
```clojure
(analisar-numeros #{1 2 3} #{2 3 4}) ;=> {:intersecao #{2 3} :uniao #{1 2 3 4}}

## Exercício Final: Organizar Dados em Coleções Combinadas

**Objetivo**: Usar listas, vetores, mapas e conjuntos para organizar dados de uma coleção.

**Instruções**:

1) Crie uma função organizar-pessoas que recebe uma lista de mapas, cada um representando uma pessoa ({:nome "Ana" :idade 30 :cidade "São Paulo"}).
2) A função deve retornar um mapa organizado por cidade, onde cada cidade é uma chave e os valores são conjuntos de nomes das pessoas que moram em cada cidade.

```clojure
(organizar-pessoas [{:nome "Ana" :idade 30 :cidade "São Paulo"}
                    {:nome "Carlos" :idade 22 :cidade "Rio de Janeiro"}
                    {:nome "Bia" :idade 25 :cidade "São Paulo"}])
;=> {"São Paulo" #{"Ana" "Bia"}, "Rio de Janeiro" #{"Carlos"}}
