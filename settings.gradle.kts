pluginManagement {
    repositories {
        gradlePluginPortal()
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "AndroidStudioTemplates"
include(":app")
include(":basic")
include(":navigationui")
include(":empty")
include(":emptycompose")
include(":fullscreen")
include(":login")
include(":primarydetailflow")
include(":responsive")
include(":scrolling")
include(":settings")
include(":tabbed")
include(":viewmodel")
