# 🚀 Treinamento Foursys - Trainee I
**Foco:** Lógica avançada, Estruturas de Repetição (`for`) e Fundamentos da Plataforma Java (JVM, JRE, Tipos, Memória, Operadores).

Abaixo estão 10 exercícios desenhados para elevar o seu nível de raciocínio. **Todos** os exercícios exigem obrigatoriamente a utilização da estrutura de repetição `for`, conectando-a aos conceitos estudados na trilha.

---

### Exercício 1: Aquecimento com Args, Wrappers e Tipos Primitivos
**Objetivo:** Trabalhar com entrada de dados via linha de comando, conversão de tipos e operadores aritméticos.
**Descrição:**
1. Crie um programa que receba argumentos via linha de comando (`args`).
2. Utilize um `for` para iterar sobre o array `args`.
3. Faça o *Unboxing* (conversão usando Wrappers, ex: `Integer.parseInt()`) de cada `String` para um tipo primitivo `int`.
4. Dentro do laço, use um `if / else if` para verificar se o número é par ou ímpar (usando operador aritmético `%`).
5. Imprima o resultado usando `System.out.println()`.

---

### Exercício 2: Validação de Dados com Scanner, Regex e Continue
**Objetivo:** Filtrar entradas indesejadas usando expressões regulares.
**Descrição:**
1. Instancie um objeto `Scanner` para ler 5 nomes inseridos pelo usuário.
2. Use um laço `for` de 0 a 5.
3. A cada iteração, leia a `String` digitada.
4. Utilize `Regex` (ex: `String.matches()`) para verificar se o nome contém apenas letras maiúsculas e minúsculas (sem números ou caracteres especiais).
5. Se o nome contiver números, use a palavra-chave `continue` para pular para a próxima iteração sem imprimir o nome. Caso seja válido, imprima-o.

---

### Exercício 3: Operadores Relacionais, Lógicos e Curto-Circuito
**Objetivo:** Entender a diferença entre validações completas e de curto-circuito.
**Descrição:**
1. Crie um vetor de números inteiros de tamanho 10.
2. Faça um `for` para percorrer este vetor.
3. Dentro do laço, crie uma condição que valide duas coisas:
    - Se o índice atual é menor que o tamanho do array.
    - Se o valor na posição atual não é nulo/zero.
4. Utilize operadores lógicos de curto-circuito (`&&` ou `||`) e teste trocar por operadores normais (`&` ou `|`) para ver se a `Stack` gera uma exceção (IndexOutOfBounds) forçando um erro de lógica intencional (como acessar `vetor[10]`). Comente o comportamento observado.

---

### Exercício 4: Dominando Matrizes e Operadores Compostos
**Objetivo:** Manipulação bidimensional e simplificação de sintaxe.
**Descrição:**
1. Crie uma matriz bidimensional (ex: `int[][] matriz = new int[3][3]`).
2. Utilize dois laços `for` aninhados (um dentro do outro) para preencher a matriz com números sequenciais.
3. Crie um terceiro laço `for` (que pode ser um *Enhanced For* / *For-each*) para somar todos os valores da matriz.
4. Ao invés de usar `soma = soma + valor`, é obrigatório o uso de operadores compostos (`+=`).
5. Ao final, use um operador ternário para imprimir se a soma total é maior que 50 ou não.

---

### Exercício 5: Explorando Escopo, Stack e Cast
**Objetivo:** Compreender a visibilidade das variáveis e como elas morrem na Stack.
**Descrição:**
1. Crie um laço `for` que rode 5 vezes.
2. Dentro do `for`, declare uma variável `double valorDouble = 5.75`.
3. Faça o *Casting explícito* (narrowing) dessa variável para `int` e armazene em uma nova variável.
4. Imprima os dois valores.
5. Fora do `for`, tente dar um `System.out.println()` na variável `valorDouble`. O código não vai compilar. Escreva um comentário no código explicando o porquê isso acontece, baseando-se no conceito de **Escopo** e **Stack**.

---

### Exercício 6: Enums e Switch com Laço
**Objetivo:** Trabalhar com constantes tipadas e controle de fluxo.
**Descrição:**
1. Crie um `Enum` chamado `StatusProcesso` com os valores: `INICIADO`, `PROCESSANDO`, `PAUSADO`, `CONCLUIDO`, `FALHOU`.
2. No método `main`, use o método `.values()` do seu Enum para obter um vetor com todos os status.
3. Use um laço `for` para iterar sobre esse vetor.
4. Dentro do laço, utilize um `switch` (passando a variável do Enum).
5. Para cada `case`, imprima uma mensagem personalizada simulando um fluxo de sistema. Se cair no `case FALHOU`, utilize um `break` seguido de um aviso no console.

---

### Exercício 7: Operadores Bit a Bit (Bitwise)
**Objetivo:** Entender como a JVM processa a nível de bits.
**Descrição:**
1. Crie um laço `for` que vá de 1 a 5.
2. A cada iteração, pegue o valor do contador e aplique os operadores bit a bit *Left Shift* (`<< 1`) e *Right Shift* (`>> 1`).
3. Imprima o número original e os resultados das operações de deslocamento de bits.
4. Adicione um comentário explicando qual é o efeito prático do `<< 1` e do `>> 1` em relação a operações aritméticas clássicas (multiplicação e divisão).

---

### Exercício 8: Autoboxing, Unboxing e Heap
**Objetivo:** Analisar como objetos pesam na memória versus tipos primitivos.
**Descrição:**
1. Crie um vetor do tipo Wrapper `Integer[] objetos = new Integer[5]`.
2. Em um `for`, preencha esse vetor atribuindo valores primitivos `int` diretamente (aqui ocorre o **Autoboxing**).
3. Crie uma variável primitiva `int soma = 0`.
4. Em um segundo `for`, some os valores do vetor à variável `soma` (aqui ocorre o **Unboxing** automático).
5. Em um comentário de bloco (`/* */`), explique: Onde as instâncias de `Integer` foram armazenadas (Stack ou Heap)? Como o **Garbage Collector** vai tratar essas instâncias caso a referência do vetor se perca?

---

### Exercício 9: Teoria Aplicada - JRE, JDK e Bytecode
**Objetivo:** Consolidar a arquitetura Java através de código.
**Descrição:**
1. Crie um vetor de `String` contendo as siglas: `"JDK"`, `"JRE"`, `"JVM"`, `"JIT"`, `"BYTECODE"`.
2. Utilize um laço `for` clássico para percorrer o array do final para o começo (de `length - 1` até `0`).
3. Use `if` e `else if` para verificar qual é a palavra atual e imprima a definição correspondente de cada uma no ecossistema Java.
4. Exemplo de saída esperada: `BYTECODE: É o código intermediário gerado pelo compilador (`javac`), compreendido apenas pela JVM.`

---

### Exercício 10: O Mega Desafio - Simulador de Execução Java
**Objetivo:** Juntar Scanner, Matrizes, Enums, For, Switch e Controle de Fluxo.
**Descrição:**
1. Crie uma matriz 2x2 de `String` simulando blocos de memória que precisam ser limpos (preencha com palavras aleatórias).
2. Utilize um `Scanner` e crie um laço `for` "infinito" (ex: `for(;;)`).
3. A cada ciclo, exiba um menu: `1- Limpar Memória | 2- Forçar Erro | 3- Sair`.
4. Leia a opção com o `Scanner`. Utilize um `switch`:
    - **Caso 1:** Use dois laços `for` internos para "zerar" a matriz (substituir os valores por null). Imprima "Garbage Collector acionado".
    - **Caso 2:** Crie uma variável que force um *Casting* inválido ou declare infinitas `Strings` para simular estouro de memória (Heap).
    - **Caso 3:** Utilize o comando `break` para quebrar o `for` infinito e encerrar o programa.
5. Após o encerramento, exiba um `System.out.println("Sistema finalizado.")`.

---