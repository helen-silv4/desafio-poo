<h1 align="center">  POO - Desafio </h1>

## :dart: Modelagem e Diagramação de um Componente iPhone

Com base no vídeo de lançamento do iPhone de 2007 modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)

#### Funcionalidades
1. **Reprodutor Musical**
    - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
    - Métodos: `ligar(int num)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
    - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

## :pushpin: Objetivo
1. Criar um diagrama UML que represente as funcionalidades descritas.
2. Implementar as classes e interfaces correspondentes em Java.

## :writing_hand: Diagrama UML (Mermaid)

O diagrama abaixo foi desenvolvido na sintaxe [Mermaid](https://mermaid.js.org/), uma alternativa open-source compatível com arquivos Markdown.

```mermaid
classDiagram
  AparelhoTelefonico : + ligar(num int) void
  AparelhoTelefonico : + atender() void
  AparelhoTelefonico : + iniciarCorreioVoz(num int) void

  IPhone : - boolean estaLigado
  IPhone : - boolean estaTocando
  IPhone : + getEstaLigado() boolean
  IPhone : + setEstaLigado(estaLigado boolean) void
  IPhone : + getEstaTocando() boolean
  IPhone : + setEstaTocando(estaTocando boolean) void
  IPhone : + ligar(num int) void
  IPhone : + atender() void
  IPhone : + iniciarCorreioVoz(num int) void

  ReprodutorMusical : + tocar() void
  ReprodutorMusical : + pausar() void
  ReprodutorMusical : + selecionarMusica(String musica) void
  
  IPod : - boolean estaTocandoMusica
  IPod : - String musicaSelecionada
  IPod : + getEstaTocandoMusica() boolean
  IPod : + setEstaTocandoMusica(estaTocandoMusica boolean) void
  IPod : + get musicaSelecionada() String
  IPod : + setMusicaSelecionada(musicaSelecionada String) void
  IPod : + tocar() void
  IPod : + pausar() void
  IPod : + selecionarMusica(String musica) void

  NavegadorInternet : + exibirPagina(String url) void
  NavegadorInternet : + atualizarPagina() void
  NavegadorInternet : + adicionarNovaAba() void

  Safari : - String url
  Safari : + getUrl() String
  Safari : + setUrl(url String) void
  Safari : + exibirPagina(String url) void
  Safari : + atualizarPagina() void
  Safari : + adicionarNovaAba() void

  AparelhoTelefonico <.. IPhone
  ReprodutorMusical <.. IPod
  NavegadorInternet <.. Safari

  IPhone o-- IPod
  IPhone o-- Safari

```
## :desktop_computer: IDE

Este projeto foi desenvolvido utilizando a IDE IntelliJ IDEA.

Você pode baixá-la em: [jetbrains.com/idea](https://www.jetbrains.com/idea/)