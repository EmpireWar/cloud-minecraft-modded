import org.spongepowered.gradle.vanilla.repository.MinecraftPlatform

plugins {
    id("conventions.base")
    id("conventions.publishing")
    id("org.spongepowered.gradle.vanilla")
}

dependencies {
    api(libs.cloud.core)
    implementation(libs.cloud.brigadier)
    implementation(project(":cloud-minecraft-modded-common"))
    compileOnly("org.spongepowered:spongeapi:14.0.0-SNAPSHOT")
    compileOnly("org.spongepowered:sponge:1.21.4-14.0.0-SNAPSHOT")
}

minecraft {
    version("1.21.4")
    platform(MinecraftPlatform.JOINED)
}
