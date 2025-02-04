plugins {
    alias(libs.plugins.kotlin.jvm)
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}
dependencies{
    implementation(libs.gson)
    implementation(libs.javax)
    implementation(libs.kotlinx.coroutine)
}