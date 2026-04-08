# PrimeAPK Editor 🚀

Um editor de APK Android de alta performance, focado em **Zero-Copy I/O**, **Descompilação Seletiva** e processamento nativo em **C++/NDK**. Totalmente migrado para **Material 3** e **Jetpack Compose**.

## 🛠️ Arquitetura Modular

- **`:app`**: Ponto de entrada principal com lógica de fusão de Split APKs.
- **`:core-native`**: Engine central em C++ para parsing de AXML binário e manipulação de DEX via `mmap`.
- **`:editor-ui`**: Interface moderna em **Jetpack Compose (Material 3)** otimizada para arquivos massivos.
- **`:signer`**: Implementação de esquemas de assinatura V2, V3 e V4.

## ⚡ Diferenciais Técnicos (SRE Approved)

1. **Material 3 Native**: Temas e componentes 100% compatíveis com as especificações mais recentes do Android.
2. **Kotlin 1.9.23 + Compose 1.5.11**: Alinhamento de versões para evitar erros de compilação e conflitos de runtime.
3. **Zero-Copy I/O**: Uso de memória otimizado para lidar com APKs grandes sem causar lags na JVM.

## 🚀 Como Compilar

Este projeto utiliza o Gradle 8.2 e exige o **Java 17**.

1. Clone o repositório.
2. Certifique-se de ter o **Android SDK** e **NDK** configurados.
3. Execute: `./gradlew assembleDebug`

## 📜 Estrutura de Arquivos

```text
/app
  /src/main/AndroidManifest.xml (Configurado para MainActivity)
  /src/main/res/values/themes.xml (Material 3 Day/Night)
/core-native
  /src/main/cpp/ (axml_parser.cpp, prime_engine.cpp)
/editor-ui
  /src/main/kotlin/ (EditorScreen.kt)
```

## 📜 Licença

Desenvolvido como um projeto de alta performance para Engenharia de Sistemas Android.
