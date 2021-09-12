## jitpack-library-test
[![](https://jitpack.io/v/amirisback/jitpack-library-test.svg?style=flat-square)](https://jitpack.io/#amirisback/jitpack-library-test) <br>

For openJDK 11 and AGP 7.0.0 +
- Please read every single note for detail
- Tutorial [Click Here](https://github.com/amirisback/jitpack-library-test#how-to-publish-android-lib-using-openjdk-11-and-agp-700-)

Repository for testing build from jitpack.io
- Red : Failed
- Green : Success / Pass

## Version Release
This Is Latest Release

    $version_release = 1.1.0
    $version_dcendents = 2.1

What's New??

    * Update Build Gradle to 7.0.2 *
    * Enhance Performance *
    * Android Library First *
    * Android Library Second *
    * Kotlin Library *
    * Experimental 3 Library *
    * Experimental Java/Kotlin Library *

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
        implementation 'com.github.amirisback:jitpack-library-test:1.1.0'
    }

## ScreenShoot External Libraries Implementation

![ScreenShoot Apps](docs/image/result.png?raw=true)

## How To Publish Android Lib Using openJDK 11 and AGP 7.0.0 +

### Step 1. Create File jitpack.yml on root project. Add this code inside files

    jdk:
      - openjdk11

### Step 2. Add classpath dcendents in buildscript (build.gradle : Project)

    dependencies {
        ...
        // NOTE : This classpath use for multiple library module
        classpath 'com.github.dcendents:android-maven-gradle-plugin:$version_dcendents'
    }

### Step 3. Add maven-publish on plugins (build.gradle : Module)
- Attention : Choose one of the options below

#### Option 1

    apply plugin: 'com.android.library'
    ...
    apply plugin: 'maven-publish'

#### Option 2

    plugins {
        id 'com.android.library'
        ...
        id 'maven-publish'
    }

### Step 4. Add publish code library (build.gradle : Module)

    afterEvaluate {
        publishing {
            publications {

                // Creates a Maven publication called "release".
                release(MavenPublication) {

                    // Applies the component for the release build variant.
                    from components.release

                    // Library Package Name (Example : "com.frogobox.androidfirstlib")
                    // NOTE : Different GroupId For Each Library / Module, So That Each Library Is Not Overwritten
                    groupId = $projectFirstLibraryId

                    // Library Name / Module Name (Example : "androidfirstlib")
                    // NOTE : Different ArtifactId For Each Library / Module, So That Each Library Is Not Overwritten
                    artifactId = $firstLibrary

                    // Version Library Name (Example : "1.0.0")
                    version = "$projectVersionName"

                }
            }
        }
    }


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