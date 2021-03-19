plugins {
    kotlin("multiplatform")
    id("maven-publish")
}

kotlin {
    val commonMain by sourceSets.getting {
        dependencies {
            api("com.h0tk3y:lib-published:1.0")
        }
    }
}