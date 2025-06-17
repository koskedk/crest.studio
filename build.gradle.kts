plugins {
    kotlin("jvm") version "1.9.23"
    application
}

group = "org.livedev.crest"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

application {
    mainClass.set("org.livedev.crest.ProgramKt")
}


tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}