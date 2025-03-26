# Desafio de criação de UML da Trilha Java Básico DIO
Um desafio proposto pelo curso da Santander de Java na plataforma DIO para praticar conceitos de orientação a objetos, abaixo está o gráfico que representa as heranças e representações gráficas de todos os métodos:
```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
    }

    class Internet {
    }

    class Telefone {
    }

    class MP3 {
    }

    iPhone <-- ReprodutorMusical
    iPhone <-- AparelhoTelefonico
    iPhone <-- NavegadorInternet
    Internet <-- NavegadorInternet
    Telefone <-- AparelhoTelefonico
    MP3 <-- ReprodutorMusical
```
