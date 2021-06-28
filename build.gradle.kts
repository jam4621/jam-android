// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
        maven("https://plugins.gradle.org/m2/")
    }
    dependencies {
        classpath(gradleDependencies.gradleBuildTool)
        classpath(kotlin(gradleDependencies.gradlePluginModule, version = gradleDependencies.gradlePluginModuleVersion))
        classpath(lint.ktlintPluginClasspath)
        classpath(jetpackLibraries.hilt.hiltClasspath)
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class.java) {
    delete(rootProject.buildDir)
}

apply(plugin = lint.ktlintPluginId)
