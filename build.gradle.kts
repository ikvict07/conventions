plugins {
    kotlin("jvm") version "2.0.21"
    id("org.nevertouchgrass.push.plugin") version "1.0.0"
    `java-gradle-plugin`
}

group = "org.nevertouchgrass"
version = "1.0.0"

repositories {
    mavenCentral()
    mavenLocal()
}


dependencies {
    testImplementation(kotlin("test"))
    implementation(gradleApi())
    implementation(project(":push-plugin"))
}

gradlePlugin {
    plugins {
        create("all-plugins") {
            id = "org.nevertouchgrass.all.plugins"
            implementationClass = "org.nevertouchgrass.AllPlugins"
        }
    }
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}
