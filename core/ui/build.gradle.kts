plugins {
    id(BuildPlugins.ANDROID_LIBRARY)
    id(BuildPlugins.KOTLIN_ANDROID)
    id(BuildPlugins.KOTLIN_COMPOSE)
}

android {
    namespace = "com.merteroglu286.core.ui"
    compileSdk = BuildConfig.COMPILE_SDK_VERSION

    defaultConfig {
        minSdk = BuildConfig.MIN_SDK_VERSION

        testInstrumentationRunner = TestBuildConfig.TEST_INSTRUMENTATION_RUNNER
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = Options.targetCompatibility
        targetCompatibility = Options.targetCompatibility
    }
    kotlinOptions {
        jvmTarget = Options.JVM_TARGET
    }

    buildFeatures {
        compose = true
    }
}

dependencies {

    api(Dependencies.ANDROIDX_CORE_KTX)
    api(platform(Dependencies.ANDROIDX_COMPOSE_BOM))
    api(Dependencies.ANDROIDX_UI)
    api(Dependencies.ANDROIDX_UI_GRAPHICS)
    api(Dependencies.ANDROIDX_UI_TOOLING_PREVIEW)
    api(Dependencies.MATERIAL3)

    testImplementation(TestDependencies.JUNIT)

    androidTestImplementation(TestDependencies.ANDROIDX_JUNIT)
    androidTestImplementation(TestDependencies.ANDROIDX_ESPRESSO_CORE)
    androidTestImplementation(platform(Dependencies.ANDROIDX_COMPOSE_BOM))
    androidTestImplementation(TestDependencies.ANDROIDX_COMPOSE_UI_TEST)

    debugImplementation(Dependencies.ANDROIDX_UI_TOOLING)
    debugImplementation(TestDependencies.ANDROIDX_UI_TEST_MANIFEST)
}