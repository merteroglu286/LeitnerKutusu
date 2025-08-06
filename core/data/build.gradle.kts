plugins {
    id(BuildPlugins.ANDROID_LIBRARY)
    id(BuildPlugins.KOTLIN_ANDROID)
}

android {
    namespace = "com.merteroglu286.core.data"
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
        sourceCompatibility = Options.sourceCompatibility
        targetCompatibility = Options.targetCompatibility
    }
    kotlinOptions {
        jvmTarget = Options.JVM_TARGET
    }
}

dependencies {

    implementation(Dependencies.ANDROIDX_CORE_KTX)

    testImplementation(TestDependencies.JUNIT)
    implementation(TestDependencies.ANDROIDX_JUNIT)
}