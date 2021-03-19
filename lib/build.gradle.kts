plugins {
    kotlin("multiplatform.pm20")
    id("maven-publish")
}

kotlin {
    main.dependencies {
        api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.2")
        api("com.github.h0tk3y.betterParse:better-parse:0.4.1")
    }
}

