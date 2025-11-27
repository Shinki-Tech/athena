# 🦉 Projeto Athena: Plataforma de Inteligência e Automação de ServiceDesk

![Status Build](<https://img.shields.io/badge/Status-Em%20Desenvolvimento%20(PoC)-yellowgreen>)
![Tecnologia Backend](https://img.shields.io/badge/Backend-Quarkus%20%7C%20Java%2021%2B-blue)
![Tecnologia Frontend](https://img.shields.io/badge/Frontend-Angular%20%7C%20Electron%2F%20Tauri-red)

O Projeto Athena é a evolução de uma automação RPA legada (Bacen V2) para uma solução moderna baseada em API, destinada a otimizar a gestão de chamados no ServiceDesk Plus (SDP) do Sicoob. O objetivo é transformar tarefas de rotina em automações instantâneas e integrar Inteligência Artificial para diagnóstico técnico.

---

## ✨ Visão Geral e Propósito

Athena é uma plataforma dual-pilar:

### 1. ⚙️ Automação Funcional Genérica (Velocidade Operacional)

Construção de um motor de workflows em Quarkus capaz de gerenciar o ciclo de vida completo do chamado via API do SDP (criar, reabrir, editar, fechar, adicionar notas) para as seguintes linhas de serviço:

- **ServiceDesk Bacen:** Migração e automação completa do ciclo de vida.
- **Integração de apps da SIpag.** (a definir)
- **Empresas parceiras do Sicoob.** (a definir)

### 2. 🧠 Inteligência Aumentada (Análise Cognitiva)

Desenvolvimento de um Analisador LLM focado na **Fila de Suporte às APIs**.

- **Análise Contextual:** O LLM será treinado com o histórico de tickets e documentação interna do Sicoob.
- **Tool Calling:** A IA usará este recurso para consultar bases de dados específicas do Sicoob/APIs (via endpoints do Quarkus) e fornecer diagnósticos e sugestões de resolução precisas.

---

## 🛠️ Stack Tecnológico

| Categoria           | Tecnologia                       | Uso Principal                                                                                |
| :------------------ | :------------------------------- | :------------------------------------------------------------------------------------------- |
| **Backend Core**    | **Quarkus (Java)**               | Serviço _cloud-native_ para orquestração de lógica de negócios, LLM e gerenciamento de APIs. |
| **Banco de Dados**  | **PostgreSQL**                   | Persistência de logs de automação e dados do Vector Store para o LLM.                        |
| **Containerização** | **Docker**                       | Empacotamento do Backend (Quarkus) e do Vector Store.                                        |
| **Frontend**        | **Angular**                      | Interface de usuário (UI) limpa e minimalista.                                               |
| **Desktop Wrapper** | **Electron**                     | Empacotamento do Frontend Angular para uma experiência de **aplicativo desktop nativo**.     |
| **APIs Chave**      | **Zoho ServiceDesk Plus API v3** | Cliente SDP Client unificado para todas as operações de CRUD.                                |

---

## 🚀 Próximos Passos (PoC Inicial)

O foco inicial é construir o **Mínimo Backend Viável (MVB)** para validar o uso do Quarkus e a integração SDP.

1.  **Configuração do Backend:** Inicialização do projeto **Quarkus** e ambiente **Docker**.
2.  **Auth & Client Core:** Implementação do serviço de gerenciamento **OAuth/Refresh Token** e o **API Client SDP** unificado.
3.  **Projetos Piloto:** Migração da automação **ServiceDesk Bacen** para o novo cliente unificado (PoC de valor rápido).
4.  **Design de UI/UX:** Desenvolvimento do protótipo de design **Athena** no Figma.

---

## 🔑 Autenticação e Configuração

Para rodar o projeto, as seguintes variáveis de ambiente são necessárias para o cliente SDP:

- `SDP_BASE_URL`: (Ex: `https://portaldeservicos.sicoob.com.br/`)
- `SDP_CLIENT_ID`
- `SDP_CLIENT_SECRET`
- `SDP_REFRESH_TOKEN`

**(Detalhes sobre a obtenção do token de autenticação e os passos para rodar o ambiente Docker serão adicionados aqui.)**
