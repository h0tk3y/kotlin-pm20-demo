@file:Suppress("unused_variable")

import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.mpp.pm20.*

plugins {
    kotlin("multiplatform").apply(false)
    kotlin("multiplatform.pm20").apply(false)
}

allprojects {
    pluginManager.withPlugin("org.jetbrains.kotlin.multiplatform.pm20") {
        configure<KotlinPm20ProjectExtension> {
            mainAndTest {
                jvm
                val linuxX64 by fragments.creating(KotlinLinuxX64Variant::class)
                val iosArm64 by fragments.creating(KotlinIosArm64Variant::class)
                val iosX64 by fragments.creating(KotlinIosX64Variant::class)

                val ios by fragments.creating {
                    iosArm64.refines(this)
                    iosX64.refines(this)
                }

                val jvmAndLinux by fragments.creating {
                    jvm.refines(this)
                    linuxX64.refines(this)
                }

                val native by fragments.creating {
                    linuxX64.refines(this)
                    ios.refines(this)
                }
            }
            test {
                dependencies { implementation(kotlin("test")) }
                jvm.dependencies { implementation(kotlin("test-junit")) }
            }
            val integrationTest by modules.creating {
                jvm
                val linuxX64 by fragments.creating(KotlinLinuxX64Variant::class)
            }
        }
    }
    pluginManager.withPlugin("org.jetbrains.kotlin.multiplatform") {
        configure<KotlinMultiplatformExtension> {
            val commonMain by sourceSets.getting
            val jvmAndLinuxMain by sourceSets.creating {
                dependsOn(commonMain)
            }
            val commonIntegrationTest by sourceSets.creating
            configure(listOf(jvm(), linuxX64())) {
                compilations["main"].defaultSourceSet.dependsOn(jvmAndLinuxMain)
                compilations.create("integrationTest") {
                    defaultSourceSet.dependsOn(commonIntegrationTest)
                    associateWith(compilations["main"])
                }
            }
            val commonTest by sourceSets.getting {
                dependencies {
                    implementation(kotlin("test"))
                }
            }
            ios()
            val nativeMain by sourceSets.creating {
                dependsOn(commonMain)
                sourceSets["iosMain"].dependsOn(this)
                linuxX64().compilations["main"].defaultSourceSet.dependsOn(this)
            }
        }
    }
    pluginManager.withPlugin("maven-publish") {
        configure<PublishingExtension> {
            publications.withType<MavenPublication>().matching { it.name == "root" }.configureEach {
                artifactId = artifactId + "-published" // make sure Gradle doesn't resolve the coordinates as project
            }
            repositories {
                maven("$rootDir/build/repo")
            }
        }
    }
}

allprojects {
    group = "com.h0tk3y"
    version = "1.0"
}

