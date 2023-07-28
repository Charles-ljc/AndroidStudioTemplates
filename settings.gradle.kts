pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
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
include(":bottomnavigation")
include(":empty")
include(":emptycompose")
include(":fullscreen")
include(":login")
include(":navigationdrawer")
include(":primarydetailflow")
include(":responsive")
include(":scrolling")
include(":settings")
include(":tabbed")
include(":viewmodel")
