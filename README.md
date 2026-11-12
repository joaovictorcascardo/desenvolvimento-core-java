# Desenvolvimento Core Java

Todos os exercícios que fiz no treinamento de Java da Foursys, do básico da linguagem até orientação a objetos. Está separado por assunto, na ordem em que estudei.

## Conteúdo

| Pasta | Assunto | Arquivos |
| --- | --- | --- |
| `capitulo_06/operadores_casting` | Operadores e conversão de tipos | 20 |
| `capitulo_06/decisao` | `if`, `else` e `switch` | 41 |
| `capitulo_06/enumeration` | `enum` | 20 |
| `capitulo_07/lacos` | `for` básico, `for` com arrays e extras | 32 |
| `capitulo_07/lacoWhile` | `while` e `do while` | 3 |
| `capitulo_07/continue_break` | `continue` e `break` | 2 |
| `capitulo_07/matrizes` | Matrizes | 10 |
| `capitulo_07/metodos` | Métodos, parâmetros e retorno | 20 |
| `capitulo_07/recursividade` | Recursão | 11 |
| `modulo2/capitulo_01` | Classes e objetos | 20 |
| `modulo2/encapsulamento` | Encapsulamento, getters, setters e validações | 47 |
| `extras_poo` | Exercício extra de POO | 2 |
| `exercicios_proprios` | Exercícios extras de `for`, regex e wrappers | 2 |
| `desafio` | Jogo Stop, cálculo exponencial, deslocamento circular e baralho de truco | 5 |
| `simulado` | Simulado final do módulo 1 | 9 |

As pastas `caderno` e `extras` dentro de alguns capítulos separam os exercícios da apostila dos exercícios extras passados em aula.

Em `docs/` estão dois diagramas que fiz no Excalidraw pra entender como a memória funciona na criação de objetos e a diferença entre atributo de instância e `static`.

## Como rodar

Precisa do JDK 17 ou mais novo. Dá pra abrir a pasta no IntelliJ e rodar qualquer arquivo pelo botão de play, ou pelo terminal:

```bash
cd src
javac -encoding UTF-8 -d ../out capitulo_07/recursividade/*.java
java -cp ../out capitulo_07.recursividade.Exercicio01
```

Troque o caminho e o nome da classe pelo exercício que quiser rodar.
