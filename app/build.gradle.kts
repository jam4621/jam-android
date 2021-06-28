plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")

    id(lint.ktlintPluginId)
    id(lint.ktlintPluginIdeaId)

    id(jetpackLibraries.hilt.hiltPluginId)
}

android {
    compileSdkVersion(buildConfigVersions.compileSdkVersion)

    defaultConfig {
        applicationId = buildConfigVersions.applicationId
        minSdkVersion(buildConfigVersions.minSdkVersion)
        targetSdkVersion(buildConfigVersions.targetSdkVersion)
        versionCode = buildConfigVersions.versionCode
        versionName = buildConfigVersions.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("debug") {
            lintOptions {
                disable("UnsafeExperimentalUsageError", "UnsafeExperimentalUsageWarning")
            }
        }

        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    buildFeatures {
        dataBinding = true
    }
}

dependencies {
    /** Kotlin **/
    implementation(kotlinDependencies.kotlin)

    /** Support androidx libraries **/
    implementation(jetpackLibraries.coreKtx)
    implementation(jetpackLibraries.appcompat)
    implementation(jetpackLibraries.constraintLayout)

    /** Navigation Component **/
    implementation(jetpackLibraries.navigation.fragmentKtx)
    implementation(jetpackLibraries.navigation.uiKtx)

    /** Material design **/
    implementation(materialDesignDependencies.material)

    /** Testing **/
    testImplementation(testingDependencies.junit)
    androidTestImplementation(jetpackLibraries.test.extJunit)
    androidTestImplementation(jetpackLibraries.test.espressoCore)

    /** Dependency Injection **/
    implementation(jetpackLibraries.hilt.hilt)
    kapt(jetpackLibraries.hilt.hiltCompiler)
    implementation(jetpackLibraries.hiltNavigationFragment)

    /** Lifecycle **/
    implementation(jetpackLibraries.lifecycle.viewModel)
    implementation(jetpackLibraries.lifecycle.liveData)
    implementation(jetpackLibraries.lifecycle.annotationProcessor)
}
