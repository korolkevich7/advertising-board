
rootProject.name = "learn"
include("m1l1-hello")

pluginManagement {
    val ktVersion: String by settings

    plugins {
        kotlin("jvm") version ktVersion apply false
    }
}