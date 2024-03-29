/**
 * Anbefalte versjoner av tredjepartsbiblioteker.
 */
const val RapidsAndRivers = "com.github.navikt:rapids-and-rivers:2022100711511665136276.49acbaae4ed4"
const val kotliquery ="com.github.seratch:kotliquery:1.9.0"
object Auth0 {
    private const val version = "3.11.0"
    const val javajwt = "com.auth0:java-jwt:$version"
}

object Awaitility {
    private const val version = "4.0.3"
    private const val groupId = "org.awaitility"

    const val awaitilityKotlin = "$groupId:awaitility-kotlin:$version"
}

object Bouncycastle {
    private const val version = "1.66"
    const val bcprovJdk15on = "org.bouncycastle:bcprov-jdk15on:$version"
}

object Brukernotifikasjon {
    private const val version = "1.2021.08.27-09.12-f8a8cbc76319"
    private const val version_internal = "1.2021.09.27-09.56-fee7c58af3ee"
    const val schemas = "com.github.navikt:brukernotifikasjon-schemas:$version"
    const val schemas_internal = "com.github.navikt:brukernotifikasjon-schemas-internal:$version_internal"
}

object Doknotifikasjon {
    private const val version = "1.2020.11.16-09.27-d037b30bb0ea"
    const val schemas = "com.github.navikt:doknotifikasjon-schemas:$version"
}

object DittNAV {
    object Common {
        private const val version = "2022.09.30-12.41-aa46d2d75788"
        private const val groupId = "com.github.navikt.dittnav-common-lib"

        const val influxdb = "$groupId:dittnav-common-influxdb:$version"
        const val utils = "$groupId:dittnav-common-utils:$version"
    }
}

object Flyway {
    const val version = "6.5.7"
    const val pluginId = "org.flywaydb.flyway"
    const val core = "org.flywaydb:flyway-core:$version"
}

object GraphQL {
    const val version = "5.3.2"
    private const val groupId = "com.expediagroup"
    const val pluginId = "com.expediagroup.graphql"

    const val kotlinClient = "$groupId:graphql-kotlin-client:$version"
    const val kotlinKtorClient = "$groupId:graphql-kotlin-ktor-client:$version"
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
    const val dataTypeJsr310 = "com.fasterxml.jackson.datatype:jackson-datatype-jsr310:$version"
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
    const val orgjson = "$groupId:jjwt-orgjson:$version"
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
        private const val version = "6.2.1"
        private const val groupId = "io.confluent"

        const val avroSerializer = "$groupId:kafka-avro-serializer:$version"
        const val schemaRegistry = "$groupId:kafka-schema-registry:$version"
    }
}

object Kluent {
    private const val version = "1.68"
    const val kluent = "org.amshove.kluent:kluent:$version"
}

object Kotest {
    const val version = "4.3.1"
    private const val groupId = "io.kotest"

    const val runnerJunit5 = "$groupId:kotest-runner-junit5:$version"
    const val assertionsCore = "$groupId:kotest-assertions-core:$version"
    const val extensions = "$groupId:kotest-extensions:$version"
}

object Kotlin {
    const val version = "1.6.10"
    private const val groupId = "org.jetbrains.kotlin"

    const val reflect = "$groupId:kotlin-reflect:$version"
}

object KotlinLogging {
    private const val version = "3.0.0"

    const val logging = "io.github.microutils:kotlin-logging:$version"
}

object Kotlinx {
    private const val groupId = "org.jetbrains.kotlinx"

    const val coroutines = "$groupId:kotlinx-coroutines-core:1.3.9"
    const val htmlJvm = "$groupId:kotlinx-html-jvm:0.7.3"
    const val atomicfu = "$groupId:atomicfu:0.14.4"
    const val datetime = "$groupId:kotlinx-datetime:0.3.2"
}

object Ktor {
    private const val version = "1.6.7"
    private const val groupId = "io.ktor"

    const val auth = "$groupId:ktor-auth:$version"
    const val authJwt = "$groupId:ktor-auth-jwt:$version"
    const val htmlBuilder = "$groupId:ktor-html-builder:$version"
    const val jackson = "$groupId:ktor-jackson:$version"
    const val serverNetty = "$groupId:ktor-server-netty:$version"
    const val clientApache = "$groupId:ktor-client-apache:$version"
    const val clientJson = "$groupId:ktor-client-json:$version"
    const val clientSerializationJvm = "$groupId:ktor-client-serialization-jvm:$version"
    const val clientJackson = "$groupId:ktor-client-jackson:$version"
    const val clientLogging = "$groupId:ktor-client-logging:$version"
    const val clientLoggingJvm = "$groupId:ktor-client-logging-jvm:$version"
    const val clientMock = "$groupId:ktor-client-mock:$version"
    const val clientMockJvm = "$groupId:ktor-client-mock-jvm:$version"
    const val metricsMicrometer = "$groupId:ktor-metrics-micrometer:$version"
    const val serverTestHost = "$groupId:ktor-server-test-host:$version"
    const val serialization = "$groupId:ktor-serialization:$version"
}

object Ktor2 {
    private const val version = "2.1.1"
    private const val groupId = "io.ktor"
    private const val tmsGroupId = "com.github.navikt.tms-ktor-token-support"
    private const val tmsSupportversion = "2.0.0"
    const val kotlinX = "$groupId:ktor-serialization-kotlinx-json:$version"
    const val jackson = "$groupId:ktor-serialization-jackson:$version"
    object Server {
        private const val prefix = "$groupId:ktor-server"
        const val core = "$prefix-core:$version"
        const val netty = "$prefix-netty:$version"
        const val defaultHeaders = "$prefix-default-headers:$version"
        const val metricsMicrometer = "$prefix-metrics-micrometer:$version"
        const val auth = "$prefix-auth:$version"
        const val authJwt ="$prefix-auth-jwt:$version"
        const val contentNegotiation = "$prefix-content-negotiation:$version"
        const val statusPages = "$prefix-status-pages:$version"
        const val htmlDsl ="$prefix-html-builder:$version"
        const val cors = "$prefix-cors:$version"
    }

    object Client {
        private const val prefix = "$groupId:ktor-client"
        const val core = "$prefix-core:$version"
        const val apache = "$prefix-apache:$version"
        const val contentNegotiation = "$prefix-content-negotiation:$version"
    }

    object TmsTokenSupport {
        private const val prefix = "$tmsGroupId:token-support"
        const val authenticationInstaller = "$prefix-authentication-installer:$tmsSupportversion"
        const val azureExchange = "$prefix-azure-exchange:$tmsSupportversion"
        const val azureValidation = "$prefix-azure-validation:$tmsSupportversion"
        const val tokenXValidation = "$prefix-tokenx-validation:$tmsSupportversion"
        const val authenticationInstallerMock = "$tmsGroupId:token-support-authentication-installer-mock:$tmsSupportversion"
        const val tokenXValidationMock = "$tmsGroupId:token-support-tokenx-validation-mock:$tmsSupportversion"
        const val azureValidationMock = "$tmsGroupId:token-support-azure-validation-mock:$tmsSupportversion"
        const val tokendingsExchange = "$tmsGroupId:token-support-tokendings-exchange:$tmsSupportversion"
        const val idportenSidecar = "$tmsGroupId:token-support-idporten-sidecar:$tmsSupportversion"
        const val idportenSidecarMock = "$tmsGroupId:token-support-idporten-sidecar-mock:$tmsSupportversion"

    }

    object Test {
        const val clientMock = "io.ktor:ktor-client-mock:$version"
        const val serverTestHost = "io.ktor:ktor-server-test-host:$version"
    }
}

object Logback {
    private const val version = "1.4.1"
    const val classic = "ch.qos.logback:logback-classic:$version"
}

object Logstash {
    private const val version = "6.4"
    const val logbackEncoder = "net.logstash.logback:logstash-logback-encoder:$version"
}

object Micrometer {
    private const val version = "1.7.0"
    private const val groupId = "io.micrometer"

    const val registryPrometheus = "$groupId:micrometer-registry-prometheus:$version"
}

object Mockk {
    private const val version = "1.12.2"
    const val mockk = "io.mockk:mockk:$version"
}

object NAV {
    const val vaultJdbc = "no.nav:vault-jdbc:1.3.7"
    const val kafkaEmbedded = "no.nav:kafka-embedded-env:2.8.1"
    const val tokenValidatorKtor = "no.nav.security:token-validation-ktor:1.3.10"
    const val tokenValidatorKtor2 = "no.nav.security:token-validation-ktor-v2:2.1.4"
    const val customKtorCorsFeature =
        "com.github.navikt:wildcard-subdomain-ktor-cors-feature:2020.11.03-14.59-81af587291fd"
}

object Postgresql {
    private const val version = "42.4.1"
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
    const val version = "7.1.2"
    const val pluginId = "com.github.johnrengelman.shadow"
}

object TestContainers {
    private const val version = "1.16.2"
    private const val groupId = "org.testcontainers"

    const val junitJupiter = "$groupId:junit-jupiter:$version"
    const val testContainers = "$groupId:testcontainers:$version"
    const val postgresql = "$groupId:postgresql:$version"
}

object Tms {
    object KtorTokenSupport {
        private const val version = "2022.04.26-13.05-59c7bf5e3472"
        private const val groupId = "com.github.navikt.tms-ktor-token-support"

        const val authenticationInstaller = "$groupId:token-support-authentication-installer:$version"
        const val azureExchange = "$groupId:token-support-azure-exchange:$version"
        const val azureValidation = "$groupId:token-support-azure-validation:$version"
        const val idporten = "$groupId:token-support-idporten:$version"
        const val idportenSidecar = "$groupId:token-support-idporten-sidecar:$version"
        const val tokendingsExchange = "$groupId:token-support-tokendings-exchange:$version"
        const val tokenXValidation = "$groupId:token-support-tokenx-validation:$version"

        const val authenticationInstallerMock = "$groupId:token-support-authentication-installer-mock:$version"
        const val tokenXValidationMock = "$groupId:token-support-tokenx-validation-mock:$version"
        const val azureValidationMock = "$groupId:token-support-azure-validation-mock:$version"
        const val idportenSidecarMock = "$groupId:token-support-idporten-sidecar-mock:$version"
    }
}

object ULID {
    private const val version = "8.2.0"
    private const val groupId = "de.huxhorn.sulky"

    const val sulkyUlid = "$groupId:de.huxhorn.sulky.ulid:$version"
}

object Unleash {
    private const val version = "3.3.1"
    private const val groupId = "no.finn.unleash"

    const val clientJava = "$groupId:unleash-client-java:$version"
}
