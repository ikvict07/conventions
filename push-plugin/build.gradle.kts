plugins {
    kotlin("jvm") version "2.0.21"
    `java-gradle-plugin`
    `maven-publish`
    id("org.nevertouchgrass.push.plugin") version "1.0.0"
}

group = "org.nevertouchgrass"
version = "1.0.0"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation(gradleApi())
}

kotlin {
    jvmToolchain(21)
}

gradlePlugin {
    plugins {
        create("push-plugin") {
            id = "org.nevertouchgrass.push.plugin"
            implementationClass = "org.nevertouchgrass.push.plugin.PushPlugin"
        }
    }
}