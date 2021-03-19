pluginManagement {
    fun RepositoryHandler.configureRepositories() {
        mavenLocal()
        mavenCentral()
        if (this === pluginManagement.repositories) {
            gradlePluginPortal()
        } else {
            maven("$rootDir/build/repo")
        }
    }

    repositories {
        configureRepositories()
    }
    plugins {
        val kotlinVersion = "1.5.255-SNAPSHOT"
        kotlin("multiplatform.pm20").version(kotlinVersion)
        kotlin("multiplatform").version(kotlinVersion)
    }
    dependencyResolutionManagement.repositories {
        configureRepositories()
    }
}

include(
    "lib",
    "app-with-published-dep",
    "app-with-project-dep",
    "old-mpp-app-with-project-dep",
    "old-mpp-app-with-published-dep"
)
