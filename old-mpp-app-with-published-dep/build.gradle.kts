plugins {
    kotlin("multiplatform")
    id("maven-publish")
}

kotlin {
    val commonMain by sourceSets.getting {
        dependencies {
            api(files().builtBy(":lib:publish")) // depends on the publication done in ":lib"
            api("com.h0tk3y:lib-published:1.0")
        }
    }
}