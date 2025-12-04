plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)

    id("com.google.dagger.hilt.android")
    id("kotlin-kapt")
    kotlin("plugin.serialization") version "1.9.10"
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.ssu.portfolio.fooddeliveryapp"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.ssu.portfolio.fooddeliveryapp"
        minSdk = 25
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.4" // Compatible with Kotlin 1.9.10
    }
}

dependencies {

    // ---------- ANDROIDX ----------
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose.material)
    implementation(libs.androidx.compose.foundation)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.foundation.layout)
    debugImplementation(libs.androidx.compose.ui.tooling)

    // Material Icons
    implementation("androidx.compose.material:material-icons-extended:1.7.8")

    // ---------- FIREBASE ----------
    implementation("com.google.firebase:firebase-auth-ktx:22.3.1")
    implementation("com.google.firebase:firebase-firestore-ktx:25.0.0")
    implementation("com.google.firebase:firebase-storage-ktx:21.0.0")

    // Google Sign-in + Credentials API
    implementation(libs.androidx.credentials)
    implementation(libs.androidx.credentials.play.services.auth)
    implementation(libs.googleid)

    // ---------- HILT ----------
    implementation("com.google.dagger:hilt-android:2.50")
    kapt("com.google.dagger:hilt-android-compiler:2.50")
    implementation("androidx.hilt:hilt-navigation-compose:1.2.0")

    // ---------- NAVIGATION ----------
    implementation("androidx.navigation:navigation-compose:2.8.0")

    // ---------- ACCOMPANIST ----------
    implementation("com.google.accompanist:accompanist-pager:0.28.0")
    implementation("com.google.accompanist:accompanist-pager-indicators:0.28.0")
    implementation("com.google.accompanist:accompanist-systemuicontroller:0.32.0")

    // ---------- COIL ----------
    implementation("io.coil-kt:coil-compose:2.6.0")

    // ---------- GLIDE ----------
    implementation("com.github.bumptech.glide:glide:4.16.0")
    implementation("com.github.bumptech.glide:compose:1.0.0-alpha.1")

    // ---------- LOTTIE ----------
    implementation("com.airbnb.android:lottie-compose:4.2.0")

    // ---------- ANIMATED NAVBAR ----------
    implementation("com.canopas.compose-animated-navigationbar:bottombar:1.0.1")

    // ---------- PAYMENT: Razorpay ----------
    implementation("com.razorpay:checkout:1.6.40")

    // ---------- ROOM ----------
    implementation("androidx.room:room-ktx:2.6.0")
    kapt("androidx.room:room-compiler:2.6.0") // Latest stable

    // ---------- SERIALIZATION ----------
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")

    // ---------- SPLASH ----------
    implementation("androidx.core:core-splashscreen:1.0.1")

    // ---------- TESTING ----------
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
}

// Enable kapt error correction
kapt {
    correctErrorTypes = true
    useBuildCache = true
}
