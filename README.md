## jitpack-library-test
[![](https://jitpack.io/v/amirisback/jitpack-library-test.svg?style=flat-square)](https://jitpack.io/#amirisback/jitpack-library-test) <br>
Repository for testing build from jitpack.io
- Red : Failed
- Green : Success / Pass

## Version Release
This Is Latest Release

    $version_release = 1.0.9

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
        implementation 'com.github.amirisback:jitpack-library-test:1.0.9'
    }

## How To Publish Android Lib Using openJDK 11 and AGP 7.0.0 +

### Step 1. Add jitpack.yml on root project

    jdk:
      - openjdk11

### Step 2. Add maven-publish on plugins

    plugins {
        id 'com.android.library'
        ...
        id 'maven-publish'
    }

### Step 3. Add publish code library on build.gradle library module

    afterEvaluate {
        publishing {
            publications {

                // Creates a Maven publication called "release".
                release(MavenPublication) {

                    // Applies the component for the release build variant.
                    from components.release

                    // Library Package Name
                    groupId = 'com.frogobox.sample'

                    // Github Repository Name
                    artifactId = 'jitpack-library-test'

                    // Version Library Name
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