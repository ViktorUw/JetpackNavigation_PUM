# JetpackNavigation_PUM

A small Android app written in Java that shows how to move between two fragments with the **Jetpack Navigation Component** and pass data between them. It was built as a lab exercise for the *Mobile Application Programming* (PUM) course.

## What it does

- **Fragment A** has a floating action button that opens Fragment B and passes an integer argument (`value = 17`) in a `Bundle`.
- **Fragment B** reads the argument, displays it, and has a button that navigates back to Fragment A using a generated `NavDirections` action.

## Tech stack

- **Java**
- **Navigation Component** (`navigation-fragment`, `navigation-ui`) with Safe Args
- View Binding
- Min SDK 28, target SDK 34

## Project structure

```
app/src/main/
├── java/com/example/jetpacknavigation/
│   ├── MainActivity.java   # Hosts the NavHostFragment
│   ├── FragmentA.java      # Start screen, sends the argument
│   └── FragmentB.java      # Receives and displays the argument
└── res/navigation/         # Navigation graph
```

## Getting started

1. Clone the repository:
   ```bash
   git clone https://github.com/ViktorUw/JetpackNavigation_PUM.git
   ```
2. Open the project in **Android Studio** and let Gradle sync.
3. Run the app on an emulator or a device with Android 9.0 (API 28) or newer.
