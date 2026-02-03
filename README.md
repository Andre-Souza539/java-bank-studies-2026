# Java Bank – 2026

> Projeto de estudos focado em **Java**, **Spring Boot** e **boas práticas profissionais** de desenvolvimento backend, incluindo **CI/CD** com GitHub Actions.

![CI](https://github.com/Andre-Souza539/java-bank-studies-2026/actions/workflows/ci.yml/badge.svg)

---

## 📌 Objetivo

Este repositório foi criado para:

* Praticar desenvolvimento backend com **Java + Spring Boot**
* Aplicar conceitos reais usados no mercado
* Simular um projeto bancário simples (API)
* Evoluir gradualmente com testes, pipeline e padrões de arquitetura

É um projeto **educacional**, mas estruturado como projeto **profissional**.

---

## 🧱 Stack Tecnológica

* **Java 17+**
* **Spring Boot**
* **Maven**
* **JUnit / Mockito** (testes)
* **GitHub Actions** (CI)
* **Linux Runner (Ubuntu)**

---

## ⚙️ CI/CD

Pipeline automatizada com **GitHub Actions** que executa:

* Checkout do código
* Configuração do Java
* Build do projeto
* Execução de testes

A pipeline é acionada em:

* `push`
* `pull request`

📁 Configuração:

```
.github/workflows/ci.yml
```

---

## ▶️ Como rodar o projeto localmente

### Pré-requisitos

* Java 17+
* Maven (ou usar o Maven Wrapper)

### Passos

```bash
git clone https://github.com/Andre-Souza539/java-bank-studies-2026.git
cd java-bank-studies-2026
./mvnw clean spring-boot:run
```

---

## 🧪 Testes

Para rodar os testes:

```bash
./mvnw test
```

---

## 🗂️ Organização de Branches

* `main` → código estável
* `development` → desenvolvimento contínuo
* `feature/*` → novas funcionalidades

---

## 🚧 Próximos Passos (Roadmap)

* [ ] CRUD de contas bancárias
* [ ] Validações de domínio
* [ ] Testes unitários e de integração
* [ ] Cobertura de testes (JaCoCo)
* [ ] Dockerização
* [ ] Deploy automatizado

---

## 📚 Observações

Este projeto faz parte de um plano de estudos contínuo para aprofundamento em **backend Java** e **engenharia de software**.

---

👤 **Autor**: André Souza
🔗 GitHub: [https://github.com/Andre-Souza539](https://github.com/Andre-Souza539)
