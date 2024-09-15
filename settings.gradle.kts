pluginManagement {

        repositories {
            google()
            mavenCentral()

        }


}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()

        maven {
            url = uri("C:\\Users\\acer\\Documents\\sdktest\\flutter_module\\build\\host\\outputs\\repo")
            // This is relative to the location of the build.gradle file
            // if using a relative path.
        }

        maven {
            url = uri("https://storage.googleapis.com/download.flutter.io")
        }
    }
}

rootProject.name = "My Application"
include(":app")
include(":flutter_module")
project(":flutter_module").projectDir = File("flutter_module")

// Add these lines


