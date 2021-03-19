plugins {
    kotlin("multiplatform.pm20")
    id("maven-publish")
}

kotlin {
    main.dependencies {
        api(files().builtBy(":lib:publish")) // depends on the publication done in ":lib"
        api("$group:lib-published:$version")
    }
}