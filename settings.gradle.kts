pluginManagement {
    repositories {
        maven { url = uri("https://maven.aliyun.com/repository/google") }
        maven { url = uri("https://maven.aliyun.com/repository/central") }
        maven { url = uri("https://maven.aliyun.com/repository/spring") }
        maven { url = uri("https://mirrors.aliyun.com/gradle/") }
        maven { url = uri("https://mirrors.aliyun.com/macports/distfiles/gradle/") }
        maven { url = uri("https://maven.aliyun.com/nexus/content/groups/public/") }
        maven { url = uri("https://maven.aliyun.com/nexus/content/repositories/jcenter") }
        maven { url = uri("https://maven.aliyun.com/nexus/content/repositories/google") }
        maven { url = uri("https://maven.aliyun.com/nexus/content/repositories/gradle-plugin")}
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven { url = uri("https://maven.aliyun.com/repository/google") }
        maven { url = uri("https://maven.aliyun.com/repository/central") }
        maven { url = uri("https://maven.aliyun.com/repository/spring") }
        maven { url = uri("https://mirrors.aliyun.com/gradle/") }
        maven { url = uri("https://mirrors.aliyun.com/macports/distfiles/gradle/") }
        maven { url = uri("https://maven.aliyun.com/nexus/content/groups/public/") }
        maven { url = uri("https://maven.aliyun.com/nexus/content/repositories/jcenter") }
        maven { url = uri("https://maven.aliyun.com/nexus/content/repositories/google") }
        maven { url = uri("https://maven.aliyun.com/nexus/content/repositories/gradle-plugin")}
        google()
        mavenCentral()
    }
}

rootProject.name = "SunnyWeather"
include(":app")
