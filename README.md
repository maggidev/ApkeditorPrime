# PrimeAPK Editor (Monolithic) 🚀

Um editor de APK Android de alta performance, consolidado em um único módulo para máxima confiabilidade de build.

## 🛠️ Arquitetura

- **Módulo Único (`:app`)**: Contém toda a lógica de UI (Compose), Core (Native C++), Signer e Merger.
- **Material 3**: Interface moderna e totalmente compatível.
- **NDK Integration**: Processamento nativo via JNI integrado diretamente.

## 🚀 Como Compilar

Este projeto utiliza o Gradle 8.2 e exige o **Java 17**.

1. Clone o repositório.
2. Certifique-se de ter o **Android SDK** e **NDK** configurados.
3. Execute: `./gradlew assembleDebug`

## 📜 Licença

Desenvolvido para Engenharia de Sistemas Android.
