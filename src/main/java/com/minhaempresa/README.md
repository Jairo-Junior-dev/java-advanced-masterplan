# 🧭 Java Advanced Masterplan

Este repositório é um plano de estudos completo e progressivo para dominar **Java em nível avançado**, incluindo tópicos como: estruturas de dados, programação concorrente, arquitetura de software, engenharia reversa, geração dinâmica de classes, criação de VMs e construção de um emulador completo.

---

## 🎯 Objetivo

Criar uma base sólida e avançada de conhecimento Java para:

- Desenvolver aplicações profissionais, performáticas e escaláveis
- Entender profundamente o funcionamento interno da JVM
- Construir um **emulador de videogame (8 bits)** do zero, com leitura de arquivos binários, processamento, renderização gráfica e controle de tempo real

---

## 📂 Estrutura do Projeto


```plaintext
java-advanced-masterplan/
├── 01-fundamentos/
│   ├── tipos-primitivos/
│   ├── controle-fluxo/
│   ├── orientacao-a-objetos/
│   └── enums-records/
├── 02-colecoes-generics/
│   ├── list-set-map/
│   ├── stream-api/
│   ├── optional/
│   └── comparators-sorting/
├── 03-tratamento-excecoes/
│   ├── excecoes-checked-unchecked/
│   ├── excecoes-customizadas/
│   └── exception-handling-patterns/
├── 04-design-patterns-solid/
│   ├── solid/
│   ├── creational/
│   ├── structural/
│   └── behavioral/
├── 05-testes/
│   ├── junit5/
│   ├── mockito/
│   ├── test-containers/
│   └── tdd-pratica/
├── 06-concorrencia-paralelismo/
│   ├── threads-basico/
│   ├── executor-service/
│   ├── sincronizacao-locks/
│   ├── completable-futures/
│   └── estruturas-concorrentes/
├── 07-ferramentas-java/
│   ├── maven/
│   ├── gradle/
│   ├── lombok/
│   └── profiler-visualvm/
├── 08-sistemas-arquitetura/
│   ├── arquitetura-hexagonal/
│   ├── ddd/
│   ├── mvc-clean/
│   ├── modularizacao/
│   └── arquitetura-em-camadas/
├── 09-springboot/
│   ├── api-rest/
│   ├── spring-data-jpa/
│   ├── jwt-seguranca/
│   ├── validacoes/
│   └── docker-deploy/
├── 10-devtools-productividade/
│   ├── logs/
│   ├── git-estrategias/
│   ├── github-actions/
│   └── bash-scripts-utils/
├── 11-java-baixo-nivel/
│   ├── manipulacao-bits/
│   ├── bytebuffer-hex/
│   ├── leitura-arquivos-binarios/
│   ├── cpu-modelo-simples/
│   └── interprete-instrucoes/
├── 12-emulador/
│   ├── arquitetura-emulador/
│   ├── rom-parser/
│   ├── cpu-core/
│   ├── memory-bus/
│   ├── graphics-render/
│   ├── controles/
│   ├── debugger-emulador/
│   └── emulador-final/
├── 13-reflection-e-anotacoes/
├── 14-java-io-nio/
├── 15-java-advanced-apis/
├── 16-memoria-performance/
├── 17-compiladores-e-vms/
│   └── gerar-classe-em-runtime/
├── 18-integracao-nativa/
├── 19-algoritmos-e-estruturas/
├── 20-projetos-extras/
```

## 🔍 Visão Geral das Pastas

### 🔹 01-fundamentos/
Fundamentos do Java moderno: tipos primitivos, fluxo de controle, orientação a objetos e `record`.

### 🔹 02-colecoes-generics/
Domínio de List, Set, Map, Stream API, Optional e ordenação customizada.

### 🔹 03-tratamento-excecoes/
Tratamento profissional de erros, exceções customizadas e padrões robustos.

### 🔹 04-design-patterns-solid/
Estudo dos princípios SOLID e principais padrões de projeto (Factory, Strategy, etc).

### 🔹 05-testes/
Testes unitários, mocks, TestContainers e TDD com JUnit 5 e Mockito.

### 🔹 06-concorrencia-paralelismo/
Multithreading, paralelismo, estruturas concorrentes e programação reativa.

### 🔹 07-ferramentas-java/
Maven, Gradle, Lombok, e ferramentas de profiling como VisualVM.

### 🔹 08-sistemas-arquitetura/
DDD, MVC, Arquitetura Hexagonal, Modularização e Clean Architecture.

### 🔹 09-springboot/
Desenvolvimento profissional com Spring Boot: APIs REST, JWT, validação, e deploy com Docker.

### 🔹 10-devtools-productividade/
Logs, Git, GitHub Actions, scripts Bash e estratégias de produtividade para projetos Java.

### 🔹 11-java-baixo-nivel/
Manipulação de bits, byte buffers, leitura de arquivos binários e simulação de registradores.

### 🔹 12-emulador/
Construção completa de um emulador em Java: arquitetura, CPU, parser de ROM, gráficos e controles.

---

## 🧬 Avançado e Meta-Programação

### 🔹 13-reflection-e-anotacoes/
Uso de Reflection, criação de anotações customizadas e mini frameworks como o Spring.

### 🔹 14-java-io-nio/
Leitura/escrita de arquivos com Java IO/NIO, FileWatcher e buffers diretos.

### 🔹 15-java-advanced-apis/
Uso avançado de APIs como `java.time`, expressões regulares, `java.util.concurrent` e `java.lang.instrument`.

### 🔹 16-memoria-performance/
Técnicas de análise de performance, tuning da JVM, JFR, Garbage Collector e JMH.

---

## ⚙️ Compiladores, Bytecode e Geração de Classes

### 🔹 17-compiladores-e-vms/
Criação de parsers, leitura de bytecode, construção de mini VMs e...

> 💡 **Geração de Classe em Runtime com ByteBuddy**

Dentro da pasta [`gerar-classe-em-runtime/`](./17-compiladores-e-vms/gerar-classe-em-runtime/), você encontrará um exemplo prático de como:

- Criar uma nova classe enquanto o programa roda
- Adicionar métodos dinamicamente
- Instanciar e executar essa classe sem nunca ter escrito um `.java`
- Usar a biblioteca [ByteBuddy](https://bytebuddy.net/) para isso

Frameworks como Spring Boot e Hibernate utilizam isso nos bastidores!

---

## 🔗 Integrações e Baixo Nível

### 🔹 18-integracao-nativa/
Java com C: uso de JNI, JNA, e interoperação com bibliotecas nativas.

---

## 🧠 Lógica e Estruturas de Dados

### 🔹 19-algoritmos-e-estruturas/
Implementações manuais de listas, filas, árvores, algoritmos de ordenação e busca.

---

## 🧪 Projetos Complementares

### 🔹 20-projetos-extras/
Projetos práticos como:
- Mini shell Java
- Editor de texto
- Paint em Java2D
- Interpretador de JSON
- Simulador de arquivos `.rom`

---

## ✅ Como usar

```bash
# Clonar o projeto
git clone https://github.com/seu-usuario/java-advanced-masterplan.git
cd java-advanced-masterplan

# Navegue pelas pastas e execute os exemplos com Java 17+
cd 17-compiladores-e-vms/gerar-classe-em-runtime
mvn clean compile exec:java
