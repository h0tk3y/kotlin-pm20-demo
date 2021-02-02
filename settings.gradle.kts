pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
    }
    plugins {
        kotlin("multiplatform.pm20").version("1.5.255-SNAPSHOT")
    }
}

dependencyResolutionManagement {
    repositories {
        mavenLocal()
        jcenter()
    }
}
