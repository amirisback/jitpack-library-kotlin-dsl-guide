## jitpack-library-kotlin-dsl-guide
[![](https://jitpack.io/v/amirisback/jitpack-library-groovy-guide.svg?style=flat-square)](https://jitpack.io/#amirisback/jitpack-library-guide) <br>

For openJDK 11 and AGP 7.0.0 +
- Please read every single note for detail
- Tutorial [Click Here](https://github.com/amirisback/jitpack-library-groovy-guide#how-to-publish-android-lib-using-openjdk-11-and-agp-700-)
- Kotlin DSL [Click Here](https://github.com/amirisback/jitpack-library-kotlin-dsl-guide)

Repository for testing build from jitpack.io
- Red : Failed
- Green : Success / Pass

## Version Release
This Is Latest Release

    $version_release = 1.1.2
    $version_dcendents = 2.1

What's New??

    * Update Build Gradle to 7.0.2 *
    * Enhance Performance *
    * Android Library First *
    * Android Library Second *
    * Kotlin Library *
    * Experimental 3 Library *
    * Experimental Java/Kotlin Library *
    * Renaming JitPack Library Guide Into JitPack Library Groovy Guide *

## Download this project

### Step 1. Add the JitPack repository to your build file (build.gradle : Project)

    Add it in your root build.gradle at the end of repositories:

    	allprojects {
    		repositories {
    			...
    			maven { url 'https://jitpack.io' }
    		}
    	}

### Step 2. Add the dependency (build.gradle : Module)

    dependencies {
        implementation 'com.github.amirisback:jitpack-library-kotlin-dsl-guide:1.0.0'
    }

## ScreenShoot External Libraries Implementation

![ScreenShoot Apps](docs/image/result.png?raw=true)

## How To Publish Android Lib Using openJDK 11 and AGP 7.0.0 +

### Step 1. Create File jitpack.yml on root project. Add this code inside files

    jdk:
      - openjdk11

### Step 2. Add classpath dcendents in buildscript (build.gradle : Project)
```kotlin
dependencies {
    ...
    // NOTE : This classpath use for multiple library module
    classpath("com.github.dcendents:android-maven-gradle-plugin:2.1")
}
```

### Step 3. Add maven-publish on plugins (build.gradle : Module)
- Attention : Choose one of the options below

```kotlin
plugins {
    id("com.android.library")
    kotlin("android")
    id("kotlin-kapt")
    `maven-publish`
}
```
### Step 4. Add publish code library (build.gradle : Module)

```kotlin
// NOTE : Delete afterEvaluate code if you publish Native Java / Kotlin Library
// NOTE : Just Using publishing function
afterEvaluate {
    publishing {
        publications {

            // Creates a Maven publication called "release".
            register("release", MavenPublication::class) {

                // Applies the component for the release build variant.
                // NOTE : Delete this line code if you publish Native Java / Kotlin Library
                from(components["release"])

                // Library Package Name (Example : "com.frogobox.androidfirstlib")
                // NOTE : Different GroupId For Each Library / Module, So That Each Library Is Not Overwritten
                groupId = ProjectSetting.PROJECT_LIB_ID_FIRST

                // Library Name / Module Name (Example : "androidfirstlib")
                // NOTE : Different ArtifactId For Each Library / Module, So That Each Library Is Not Overwritten
                artifactId = ProjectSetting.LIBRARY_FIRST

                // Version Library Name (Example : "1.0.0")
                version = ProjectSetting.PROJECT_VERSION_NAME

            }

        }
    }
}
```


## Colaborator
Very open to anyone, I'll write your name under this, please contribute by sending an email to me

- Mail To faisalamircs@gmail.com
- Subject : Github _ [Github-Username-Account] _ [Language] _ [Repository-Name]
- Example : Github_amirisback_kotlin_admob-helper-implementation

Name Of Contribute
- Muhammad Faisal Amir
- Waiting List
- Waiting List

Waiting for your contribute

## Attention !!!
- Please enjoy and don't forget fork and give a star
- Don't Forget Follow My Github Account

![ScreenShoot Apps](docs/image/mad_score.png?raw=true)