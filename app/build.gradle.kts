/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("hep.dirac.java-application-conventions")
}

dependencies {
    implementation("org.apache.commons:commons-text")
    implementation(project(":model"))
    implementation(project(":impl"))
}

application {
    // Define the main class for the application.
    mainClass.set("hep.dirac.app.App")
}