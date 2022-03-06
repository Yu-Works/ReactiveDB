import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.20-M1"
}

group = "com.IceCreamQAQ.Yu"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}