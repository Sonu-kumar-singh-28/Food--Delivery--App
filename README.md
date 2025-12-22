🍔 Food Delivery App..

Built with Kotlin, MVVM, Dagger-Hilt, ViewModel, Firebase Realtime Database & Room

A modern and scalable Food Delivery Android Application designed with clean architecture and production-level practices. It provides real-time menu updates, smooth cart management, secure authentication, and offline support using Room Database. This project is perfect for showcasing Android development skills and understanding multi-layer architecture with Firebase integration.

🚀 Tech Stack
✨ Languages & Architecture

Kotlin

MVVM Architecture

Repository Pattern

Clean Architecture (UI → ViewModel →  Repository →  Data Sources)

🔧 Dependency Injection

Dagger-Hilt..

🗄 Local Storage

Room Database..

Offline-first design

Local caching for menu items & cart

☁ Remote Backend

Firebase Realtime Database

Live menu updates

Orders saving in real-time

🔥 Authentication (Optional)

Firebase Authentication (Email/Password)

🎨 UI

XML / Jetpack Compose (as per your implementation)

Material Design Components

📱 App Features
🍽 Menu & Food Categories

Real-time menu items fetched from Firebase

Room DB stores data locally

Auto-sync when online

🛒 Cart System

Add / remove items

Persistent cart using Room

Auto-update totals

📦 Order Placement.

Orders stored on Firebase

Order-ID & timestamp

Smooth error handling

👤 User Authentication

Firebase login / signup

Secure session handling

🌐 Offline Support

Room DB caching

App works even without internet

📂 Project Structure (Clean MVVM)
com.example.fooddelivery
│
├── data
│   ├── local (Room)
│   ├── remote (Firebase)
│   ├── repository
│
├── di (Hilt Modules)
├── model (Data Models)
├── ui
│   ├── activities / fragments
│   ├── viewmodel
│
└── utils

🛠 Setup Instructions

Clone the repository

git clone https://github.com/yourusername/Food-Delivery-App.git


Add your google-services.json to

app/src/main/


Enable Firebase Realtime Database + Authentication in console

Build the project in Android Studio

Run on Emulator / Device
