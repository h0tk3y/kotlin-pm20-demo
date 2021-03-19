plugins {
    kotlin("multiplatform.pm20")
    id("maven-publish")
}

kotlin {
    main.dependencies {
        api(project(":lib"))
    }
}
