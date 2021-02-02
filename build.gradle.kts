import org.jetbrains.kotlin.gradle.plugin.mpp.pm20.jvm

plugins {
    kotlin("multiplatform.pm20")
}

kotlin {
    mainAndTest {
        val common by fragments.existing

        val jvmAndLinux by fragments.creating {
            refines(common)
        }

        jvm {
            refines(jvmAndLinux)
        }
    }

    main.dependencies {
        api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.2")
    }

    test.jvm.dependencies {
        implementation(kotlin("test-junit"))
    }
}

