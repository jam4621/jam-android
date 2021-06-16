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
    private const val gradleBuildToolVersion = "4.2.1"
    const val gradleBuildTool = "com.android.tools.build:gradle:$gradleBuildToolVersion"

    const val gradlePluginModuleVersion = "1.5.10"
    const val gradlePluginModule = "gradle-plugin"
}

object kotlinDependencies {
    private const val kotlinVersion = "1.5.10"
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"
}

object androidxSupportDependencies {
    private const val coreKtxVersion = "1.5.0"
    const val coreKtx = "androidx.core:core-ktx:$coreKtxVersion"

    private const val appcompatVersion = "1.3.0"
    const val appcompat = "androidx.appcompat:appcompat:$appcompatVersion"

    private const val constraintLayoutVersion = "2.0.4"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion"
}

object materialDesignDependencies {
    private const val materialVersion = "1.3.0"
    const val material = "com.google.android.material:material:$materialVersion"
}

object testingDependencies {
    private const val extJunitVersion = "1.1.1"
    const val extJunit = "androidx.test.ext:junit:$extJunitVersion"

    private const val espressoVersion = "3.3.0"
    const val espressoCore = "androidx.test.espresso:espresso-core:$espressoVersion"

    private const val junitVersion = "4.13.2"
    const val junit = "junit:junit:$junitVersion"
}

object lint {
    private const val ktlintPluginVersion = "10.1.0"
    const val ktlintPluginClasspath = "org.jlleitschuh.gradle:ktlint-gradle:$ktlintPluginVersion"
    const val ktlintPluginId = "org.jlleitschuh.gradle.ktlint"
    const val ktlintPluginIdeaId = "org.jlleitschuh.gradle.ktlint-idea"
}
