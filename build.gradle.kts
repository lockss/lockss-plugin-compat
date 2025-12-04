/*
 * LOCKSS Plugin Compat
 *
 * Compatibility layer for LOCKSS plugins.
 */

plugins {
    id("lockss-java-conventions")
}

group = "org.lockss.laaws"
version = "1.7.0-SNAPSHOT"
description = "LOCKSS Plugin Compatibility Layer"

dependencies {
    // Internal dependencies
    api(project(":lockss-core"))
    // Need lockss-core test artifacts in main code (for backwards compat shims)
    api(project(":lockss-core", configuration = "testArtifacts"))

    // Test dependencies
    testImplementation(platform(project(":lockss-pom-bundles:lockss-junit5-bundle")))
    testImplementation(libs.junit.jupiter.engine)
}
