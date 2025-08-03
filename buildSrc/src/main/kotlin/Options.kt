import org.gradle.api.JavaVersion

object Options {
    const val JVM_TARGET = "11"
    val sourceCompatibility = JavaVersion.VERSION_11
    val targetCompatibility = JavaVersion.VERSION_11
}