# CP1 - Sistema de Funcionários (Java + Hibernate + Reflection)

## 📌 Descrição
Projeto acadêmico desenvolvido para aplicar conceitos de Programação Orientada a Objetos (POO), persistência com Hibernate (JPA) e uso de Reflection em Java.

O sistema simula o cadastro de funcionários e calcula salários com regras diferentes conforme o tipo de funcionário.

---

## 🎯 Objetivos
- Aplicar herança e polimorfismo
- Implementar CRUD com Hibernate
- Utilizar annotations personalizadas
- Gerar SQL dinamicamente com Reflection

---

## 🧱 Estrutura
- **Funcionario**: classe base com atributos e cálculo padrão
- **FuncionarioSenior**: possui bônus baseado em horas trabalhadas
- **FuncionarioTranquilizador**: possui bônus por desempenho com clientes
- **FuncionarioDAO**: responsável pelo CRUD
- **GeradorSQL**: gera query SQL via Reflection

---

## 🧠 Conceitos aplicados
- Herança
- Polimorfismo
- Encapsulamento
- Annotations
- Reflection
- Persistência com Hibernate

---

## 🗄 Persistência
Foi utilizado Hibernate com banco Oracle para realizar:

- CREATE
- READ
- UPDATE
- DELETE

**Observação:** Apenas a classe `Funcionario` é persistida, simplificando o mapeamento.

---

## 🧪 Testes
A classe `Teste.java` demonstra:

- Operações CRUD
- Polimorfismo entre subclasses
- Diferença no cálculo de salários
- Geração de SQL com Reflection

---

## 📸 Evidências
Foram capturados prints das seguintes execuções:

- CREATE (insert)
- READ (select)
- UPDATE (update)
- DELETE (delete)
- Polimorfismo
- Reflection

---

## ⚙️ Tecnologias
- Java
- Maven
- Hibernate (JPA)
- Oracle Database

---

## ▶️ Execução
1. Configurar o banco Oracle no `persistence.xml`
2. Executar a classe `Teste.java`

---

## 👨‍💻 Autor
Lucas Vieira e Pedro Puga
