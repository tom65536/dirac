
plugins {
  id("hep.dirac.java-application-conventions")

  id("com.stehno.gradle.site") version "0.0.3"
  id("com.stehno.gradle.webpreview") version "0.3.0"
}

group = "hep.dirac"

val ghOwner = "tom65536"

val webUrl = "https://${ghOwner}.github.io/${project.name}/"
val githubUrl = "https://github.com/$ghOwner}/${project.name}.git"

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

site {
  siteUrl = webUrl
}

webPreview {
  port = 0
  copyUrl = false
  resourceDir = file(layout.buildDirectory.dir("site"))
  contextPath = "/"
}

tasks.site.dependsOn = [
  // 'jacocoTestReport',
  // 'asciidoctor',
  'javadoc',
  'build']
