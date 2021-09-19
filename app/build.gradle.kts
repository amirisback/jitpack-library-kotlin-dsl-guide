plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-kapt")
}

android {
    compileSdk = ProjectSetting.PROJECT_COMPILE_SDK

    defaultConfig {
        applicationId = ProjectSetting.PROJECT_APP_ID
        minSdk = ProjectSetting.PROJECT_MIN_SDK
        targetSdk = ProjectSetting.PROJECT_TARGET_SDK
        versionCode = ProjectSetting.PROJECT_VERSION_CODE
        versionName = ProjectSetting.PROJECT_VERSION_NAME

        multiDexEnabled = true
        vectorDrawables.useSupportLibrary = true

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        // Naming APK // AAB
        setProperty("archivesBaseName", "${ProjectSetting.NAME_APK}(${versionName})")

    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false

            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures {
        viewBinding = true
        compose = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Dependency.COMPOSE_VERSION
        kotlinCompilerVersion = Dependency.KOTLIN_VERSION
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = JavaVersion.VERSION_11.toString()
            useIR = true
        }
    }

    packagingOptions {
        exclude("META-INF/AL2.0")
        exclude("META-INF/LGPL2.1")
    }
}

dependencies {

    implementation(project(":dslfirst"))

    implementation("androidx.core:core-ktx:1.6.0")
    implementation("androidx.appcompat:appcompat:1.3.1")
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.compose.ui:ui:${Dependency.COMPOSE_VERSION}")
    implementation("androidx.compose.material:material:${Dependency.COMPOSE_VERSION}")
    implementation("androidx.compose.ui:ui-tooling-preview:${Dependency.COMPOSE_VERSION}")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
    implementation("androidx.activity:activity-compose:1.3.1")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:${Dependency.COMPOSE_VERSION}")
    debugImplementation("androidx.compose.ui:ui-tooling:${Dependency.COMPOSE_VERSION}")
}