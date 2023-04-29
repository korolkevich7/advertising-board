import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") apply false
}

allprojects {
    group = "com.github.korolkevich"
    version = "1.0-SNAPSHOT"
    repositories {
        google()
        mavenCentral()
        jitpack()
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "17"
    }
}

fun RepositoryHandler.jitpack() {
    maven { url = project.uri("https://jitpack.io") }
}