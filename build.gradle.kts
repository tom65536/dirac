
plugins {
    id("hep.dirac.java-application-conventions")

    id("gradle.site") version "0.6"
}

dependencies {
    implementation("org.apache.commons:commons-text")
}

tasks.compileJava {
  var gid = file(layout.buildDirectory.dir("generated/sources/headers/java/main/"))
  options.compilerArgs = listOf("-h", gid.toString())

  doFirst {
        // make sure that directory exists
        gid.mkdirs()
    }
}

application {
    mainClass.set("hep.dirac.app.App")
}
