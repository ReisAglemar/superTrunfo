# 🎴 Super Trunfo - Java Console

Projeto desenvolvido em Java com foco em lógica de programação, orientação a objetos e organização em camadas.

---

## 📌 Objetivo

Implementar uma versão do jogo **Super Trunfo** em modo console, aplicando conceitos como:

- Programação Orientada a Objetos (POO)
- Interfaces
- Encapsulamento
- Organização por pacotes
- Estruturação de projeto Maven

---

## 🗂️ Estrutura do Projeto

        supertrunfo
        └── src/main/java
        ├── com/reis/supertrunfo
        │ └── Supertrunfo.java
        │
        ├── database
        │ └── DataBase.java
        │
        └── entities
        ├── ActionsInterface.java
        ├── DeskCards.java
        ├── Player.java
        └── Toplay.java
---

### 📦 Pacotes

- **com.reis.supertrunfo**
  - Classe principal da aplicação (`main`).

- **database**
  - Responsável pela simulação/carregamento dos dados do jogo.

- **entities**
  - Contém as entidades e regras de negócio:
    - `Player` → Representa o jogador.
    - `DeskCards` → Representa as cartas do jogo.
    - `Toplay` → Controle de turno.
    - `ActionsInterface` → Define as ações do jogo.

---

## ⚙️ Tecnologias Utilizadas

- Java
- Maven
- Programação Orientada a Objetos

---

## ▶️ Como Executar

### 1️⃣ Clonar o repositório

```bash
git clone <url-do-repositorio>
