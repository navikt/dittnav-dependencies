/**
 * Anbefalte versjoner av tredjepartsbiblioteker.
 */

object Bouncycastle {
    private const val version = "1.66"
    const val bcprovJdk15on = "org.bouncycastle:bcprov-jdk15on:$version"
}

object Brukernotifikasjon {
    private const val version = "1.2020.08.21-11.47-631516352cc5"
    const val schemas = "com.github.navikt:brukernotifikasjon-schemas:$version"
}

object DittNAV {
    object Common {
        private const val version = "2020.10.05-08.55-d4650785151c"
        private const val groupId = "com.github.navikt.dittnav-common-lib"

        const val logging = "$groupId:dittnav-common-logging:$version"
        const val metrics = "$groupId:dittnav-common-metrics:$version"
        const val security = "$groupId:dittnav-common-security:$version"
        const val test = "$groupId:dittnav-common-test:$version"
        const val utils = "$groupId:dittnav-common-utils:$version"
    }
}

object Flyway {
    const val version = "6.5.7"
    const val pluginId = "org.flywaydb.flyway"
    const val core = "org.flywaydb:flyway-core:$version"
}

object H2Database {
    private const val version = "1.4.200"
    const val h2 = "com.h2database:h2:$version"
}

object Hikari {
    private const val version = "3.4.5"
    const val cp = "com.zaxxer:HikariCP:$version"
}

object Influxdb {
    private const val version = "2.20"
    const val java = "org.influxdb:influxdb-java:$version"
}

object Jackson {
    private const val version = "2.11.3"
    private const val groupId = "com.fasterxml.jackson.datatype"
    const val dataTypeJsr310 = "$groupId:jackson-datatype-jsr310:$version"
    const val moduleKotlin = "com.fasterxml.jackson.module:jackson-module-kotlin:$version"
}

object Junit {
    private const val version = "5.4.1"
    private const val groupId = "org.junit.jupiter"

    const val api = "$groupId:junit-jupiter-api:$version"
    const val engine = "$groupId:junit-jupiter-engine:$version"
    const val params = "$groupId:junit-jupiter-params:$version"
}

object Jjwt {
    private const val version = "0.11.2"
    private const val groupId = "io.jsonwebtoken"

    const val api = "$groupId:jjwt-api:$version"
    const val impl = "$groupId:jjwt-impl:$version"
    const val jackson = "$groupId:jjwt-jackson:$version"
}

object Kafka {
    object Apache {
        private const val version = "2.5.1"
        private const val groupId = "org.apache.kafka"

        const val clients = "$groupId:kafka-clients:$version"
        const val kafka_2_12 = "$groupId:kafka_2.12:$version"
        const val streams = "$groupId:kafka-streams:$version"
    }

    object Confluent {
        private const val version = "5.5.0"
        private const val groupId = "io.confluent"

        const val avroSerializer = "$groupId:kafka-avro-serializer:$version"
        const val schemaRegistry = "$groupId:kafka-schema-registry:$version"
    }
}

object Kluent {
    private const val version = "1.61"
    const val kluent = "org.amshove.kluent:kluent:$version"
}

object Kotlin {
    const val version = "1.4.10"
}

object Kotlinx {
    private const val groupId = "org.jetbrains.kotlinx"

    const val coroutines = "$groupId:kotlinx-coroutines-core:1.3.9"
    const val htmlJvm = "$groupId:kotlinx-html-jvm:0.7.2"
}

object Ktor {
    private const val version = "1.4.1"
    private const val groupId = "io.ktor"

    const val auth = "io.ktor:ktor-auth:$version"
    const val authJwt = "io.ktor:ktor-auth-jwt:$version"
    const val htmlBuilder = "io.ktor:ktor-html-builder:$version"
    const val jackson = "io.ktor:ktor-jackson:$version"
    const val serverNetty = "io.ktor:ktor-server-netty:$version"
    const val clientApache = "io.ktor:ktor-client-apache:$version"
    const val clientJson = "io.ktor:ktor-client-json:$version"
    const val clientSerializationJvm = "io.ktor:ktor-client-serialization-jvm:$version"
    const val clientJackson = "io.ktor:ktor-client-jackson:$version"
    const val clientLogging = "io.ktor:ktor-client-logging:$version"
    const val clientLoggingJvm = "io.ktor:ktor-client-logging-jvm:$version"
    const val clientMock = "io.ktor:ktor-client-mock:$version"
    const val clientMockJvm = "io.ktor:ktor-client-mock-jvm:$version"
}

object Logback {
    private const val version = "1.2.3"
    const val classic = "ch.qos.logback:logback-classic:$version"
}

object Logstash {
    private const val version = "6.4"
    const val logbackEncoder = "net.logstash.logback:logstash-logback-encoder:$version"
}

object Mockk {
    private const val version = "1.9.3"
    const val mockk = "io.mockk:mockk:$version"
}

object NAV {
    const val vaultJdbc = "no.nav:vault-jdbc:1.3.7"
    const val kafkaEmbedded = "no.nav:kafka-embedded-env:2.5.0"
    const val tokenValidatorKtor = "no.nav.security:token-validation-ktor:1.3.0"
}

object Postgresql {
    private const val version = "42.2.16"
    const val postgresql = "org.postgresql:postgresql:$version"
}

object Prometheus {
    private const val version = "0.9.0"
    private const val groupId = "io.prometheus"

    const val common = "$groupId:simpleclient_common:$version"
    const val hotspot = "$groupId:simpleclient_hotspot:$version"
    const val httpServer = "$groupId:simpleclient_httpserver:$version"
    const val logback = "$groupId:simpleclient_logback:$version"
    const val simpleClient = "$groupId:simpleclient:$version"
}

object Shadow {
    const val version = "6.0.0"
    const val pluginId = "com.github.johnrengelman.shadow"
}

object Auth0 {
    private const val version = "3.11.0"
    const val javajwt = "com.auth0:java-jwt:$version"
}
