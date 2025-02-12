pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
    }
}
plugins {
    id("com.gradle.enterprise") version "3.11.4"
}
gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
    }
}

rootProject.name = "gradle-errorprone-plugin"
