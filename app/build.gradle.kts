plugins {
    id("com.android.application")
    id("kotlin-android")
    id(lint.ktlintPluginId)
    id(lint.ktlintPluginIdeaId)
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
}

dependencies {
    /** Kotlin **/
    implementation(kotlinDependencies.kotlin)

    /** Coroutines **/

    /** Support androidx libraries **/
    implementation(androidxSupportDependencies.coreKtx)
    implementation(androidxSupportDependencies.appcompat)
    implementation(androidxSupportDependencies.constraintLayout)

    /** Material design **/
    implementation(materialDesignDependencies.material)

    /** Testing **/
    testImplementation(testingDependencies.junit)
    androidTestImplementation(testingDependencies.extJunit)
    androidTestImplementation(testingDependencies.espressoCore)
}
