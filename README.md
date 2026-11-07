# GameDex — Catálogo de Jogos (AP2)

Aplicação Android desenvolvida em Kotlin com Jetpack Compose para a avaliação AP2 da disciplina de Programação para Dispositivos Móveis. O projeto implementa um catálogo temático de videojogos com navegação tipada, componentes Material 3 e carregamento assíncrono de imagens via Coil.

## 👥 Integrantes
* João Vitor Daitx dos Santos

## 🎮 Tema Escolhido
**GameDex**: Catálogo com dados estáticos em memória contendo informações sobre videojogos populares (capas oficiais da Steam, anos de lançamento, avaliações e descrições detalhadas).

## 📱 Capturas de Ecrã

### Catálogo de Jogos (Lista)
<img width="668" height="922" alt="image" src="https://github.com/user-attachments/assets/c4408fa5-22a5-4606-8ac3-55804d015b1b" />


### Detalhes do Jogo (Detalhe)
<img width="666" height="922" alt="image" src="https://github.com/user-attachments/assets/af77709e-743a-4ac1-ad4d-647386146bd3" />
<img width="675" height="917" alt="image" src="https://github.com/user-attachments/assets/75c7c0fb-c403-4e1c-b5ab-78cd9ebf65b4" />



## 🛠️ Tecnologias e Recursos Utilizados
* **Linguagem & Framework:** Kotlin 2.0 com Jetpack Compose
* **Design System:** Material 3 com paleta de cores personalizada em `ui.theme`
* **Navegação:** Navigation Compose com rotas tipadas `@Serializable`
* **Listagem Eficiente:** `LazyColumn` com chaves estáveis (`key = { it.id }`)
* **Carregamento de Imagens:** `AsyncImage` (Coil Compose) com permissão de Internet
