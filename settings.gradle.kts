pluginManagement {
    repositories {
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
        google()
        mavenCentral()
    }
}

rootProject.name = "ADBshizuku"
include(":app")
include(":sdk")
include(":comp-depslib:adb-adi")
include(":comp-depslib:adb-aidl")
include(":comp-depslib:adb-common")
include(":comp-depslib:adb-manager")
include(":comp-depslib:adb-provider")
include(":comp-depslib:adb-rish")
include(":comp-depslib:adb-server")
include(":comp-depslib:adb-server-share")
include(":comp-depslib:adb-shared")
include(":comp-depslib:adb-start")