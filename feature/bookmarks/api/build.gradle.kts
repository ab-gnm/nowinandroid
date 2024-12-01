plugins {
    alias(libs.plugins.nowinandroid.android.feature)
//    alias(libs.plugins.nowinandroid.android.library.compose)
}

android {
    namespace = "com.google.samples.apps.nowinandroid.feature.bookmarks.api"
}

dependencies {
    implementation(projects.core.common)
}