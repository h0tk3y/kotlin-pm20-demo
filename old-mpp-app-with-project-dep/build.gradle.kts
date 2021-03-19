plugins {
    kotlin("multiplatform")
    id("maven-publish")
}

kotlin {
    val commonMain by sourceSets.getting {
        dependencies {
            api(project(":lib"))
        }
    }
}