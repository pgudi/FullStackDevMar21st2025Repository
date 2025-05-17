plugins {
    id("java")
}

group = "com.gentech"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // https://mvnrepository.com/artifact/org.apache.poi/poi
    implementation("org.apache.poi:poi:5.4.1")
    // https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml
    implementation("org.apache.poi:poi-ooxml:5.4.1")
}

tasks.test {
    useJUnitPlatform()
}