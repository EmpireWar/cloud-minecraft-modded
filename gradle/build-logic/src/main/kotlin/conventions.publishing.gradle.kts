import org.incendo.cloudbuildlogic.city
import org.incendo.cloudbuildlogic.jmp

plugins {
    id("org.incendo.cloud-build-logic.publishing")
}

indra {
    github("Incendo", "cloud-minecraft-modded") {
        ci(true)
    }
    mitLicense()

    configurePublications {
        pom {
            developers {
                jmp()
                city()
            }
        }
    }
}

publishing {
    repositories {
        maven {
            name = "convallyria"
            url = uri("https://repo.convallyria.com/snapshots")
            credentials(PasswordCredentials::class)
        }

        maven {
            name = "empirewar"
            url = uri("https://repo.empirewar.org/snapshots")
            credentials(PasswordCredentials::class)
        }
    }
}

javadocLinks {
    override(libs.fabricLoader, "https://maven.fabricmc.net/docs/fabric-loader-{version}")
    excludes.add("net.fabricmc.fabric-api:")
    defaultJavadocProvider = "https://www.javadocs.dev/{group}/{name}/{version}"
    exclude(libs.immutablesValueAnnotations)
    exclude(libs.immutablesAnnotate)
}
