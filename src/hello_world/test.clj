
(ns hello_world.test.core
    (:gen-class)
    (:require [clojure.string :as str]))

(def numeroShort (short 5))

(inc 12)
(max 3 5 1)
(min 1 0 22)

(def a (read-line))

;; Eval salva o resultado de uma expressão
(def salvar-resultado (eval (read-string "(+ 1 2)")))
salvar-resultado

(def vetor (vector 1 2 3 true "a" "V"))

;; Buscar o valor da primeira posição, se não contiver será nil
(get vetor 0)

;; Quantidade de elementos
(count vetor)

;; Junto conjunto com o `conj`
(conj vetor 22)

;; Recuperar o reto dos itens, menos o PRIMEIRO
(rest vetor)

;; Recuperar o resto dos items, menos o PRIMEIRO nem o ULTIMO
(pop vetor)

;; Recuperar o resto dos items, menos o ULTIMO
(peek vetor)


;; Las listas son colecciones secuenciales de datos con un orden determinado que pueden ser repetidos y que se diferencian de los vectores en cuanto a que los nuevos elementos añadidos a ésta se posicionan al principio, no al final de la colección como con los vectores. No hay límite de items o miembros que se puedan guardar en éstas y admite tipos de datos de diferente naturaleza.

(def lista '( 1 "1" true ) )

;; para pegar o indice da lista
(nth lista 0)

;; juntar elementos
(conj lista "aaa")

;; para listas o peek se pega o primeiro elemento
(peek lista)

;; para listas o peek se pega o primeiro elemento
(pop lista)

;; Pega ultimo elemento
(last lista)


;; SETS

(def sets (set '(valores)))

sets

(def a (set '( valores ) ) )

(def b #{ "a" true 1 0.3 })
b

(conj b 12)

;; Remover elemento, isso é removido passando o valor
(disj b "a")

;; Aninhe dados
(def a #{ 1 2 })
(def b #{ 3 4 11})
(into a b)

;; MAPAS
(def a {"valor1" 0 "valor2" true "valor3" "hola, mundo"})

;; Existe chaves
(contains? a "valor3")
(find a "valor3")

;; todas chaves
(keys a)

;; todos os valores
(vals a)

Nos devolve se a string esta vazia 
(str/blank? miString) => false
(str/blank? "") => true
(str/blank? nil) => true
(str/blank? "   ") => true



;; Verifica se string existe
(str/includes? "todo munds" "mundo")

(str/index-of "Hola blz" "Hola")

(str/upper-case miString)