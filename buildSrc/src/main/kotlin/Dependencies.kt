/**
 * Created by NGUYEN VAN SON on 16/06/2021.
 * nvs266@gmail.com
 */

object buildConfigVersions {
    const val applicationId = "com.wejam4621.vn"
    const val compileSdkVersion = 30
    const val minSdkVersion = 21
    const val targetSdkVersion = 30
    const val versionCode = 1
    const val versionName = "1.0"
}

object gradleDependencies {
    private const val gradleBuildToolVersion = "4.2.2"
    const val gradleBuildTool = "com.android.tools.build:gradle:$gradleBuildToolVersion"

    const val gradlePluginModuleVersion = "1.5.10"
    const val gradlePluginModule = "gradle-plugin"
}

object kotlinDependencies {
    private const val kotlinVersion = "1.5.10"
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"
}

object jetpackLibraries {
    private const val coreKtxVersion = "1.5.0"
    const val coreKtx = "androidx.core:core-ktx:$coreKtxVersion"

    private const val appcompatVersion = "1.3.0"
    const val appcompat = "androidx.appcompat:appcompat:$appcompatVersion"

    private const val constraintLayoutVersion = "2.0.4"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion"

    private const val hiltNavigationFragmentVersion = "1.0.0"
    const val hiltNavigationFragment = "androidx.hilt:hilt-navigation-fragment:$hiltNavigationFragmentVersion"

    object navigation {
        private const val version = "2.3.5"
        const val fragmentKtx = "androidx.navigation:navigation-fragment-ktx:$version"
        const val uiKtx = "androidx.navigation:navigation-ui-ktx:$version"
    }

    object test {
        private const val extJunitVersion = "1.1.1"
        const val extJunit = "androidx.test.ext:junit:$extJunitVersion"

        private const val espressoVersion = "3.3.0"
        const val espressoCore = "androidx.test.espresso:espresso-core:$espressoVersion"
    }

    object hilt {
        private const val version = "2.35"

        const val hiltClasspath = "com.google.dagger:hilt-android-gradle-plugin:$version"
        const val hiltPluginId = "dagger.hilt.android.plugin"

        const val hilt = "com.google.dagger:hilt-android:$version"
        const val hiltCompiler = "com.google.dagger:hilt-android-compiler:$version"
    }

    object lifecycle {
        private const val version = "2.4.0-alpha02"
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
        const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:$version"
        const val annotationProcessor = "androidx.lifecycle:lifecycle-common-java8:$version"
    }
}

object materialDesignDependencies {
    private const val materialVersion = "1.3.0"
    const val material = "com.google.android.material:material:$materialVersion"
}

object testingDependencies {
    private const val junitVersion = "4.13.2"
    const val junit = "junit:junit:$junitVersion"
}

object lint {
    private const val ktlintPluginVersion = "10.1.0"
    const val ktlintPluginClasspath = "org.jlleitschuh.gradle:ktlint-gradle:$ktlintPluginVersion"
    const val ktlintPluginId = "org.jlleitschuh.gradle.ktlint"
    const val ktlintPluginIdeaId = "org.jlleitschuh.gradle.ktlint-idea"
}
