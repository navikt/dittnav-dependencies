/**
 * Anbefalte versjoner av tredjepartsbiblioteker.
 */

object Brukernotifikasjon {
    private const val version = "1.2020.02.07-13.16-fa9d319688b1"
    const val schemas = "no.nav:brukernotifikasjon-schemas:$version"
}

object Flyway {
    const val version = "5.2.4"
    const val core = "org.flywaydb:flyway-core:$version"
}

object H2Database {
    private const val version = "1.4.200"
    const val h2 = "com.h2database:h2:$version"
}

object Hikari {
    private const val version = "3.2.0"
    const val cp = "com.zaxxer:HikariCP:$version"
}

object Influxdb {
    private const val version = "2.8"
    const val java = "org.influxdb:influxdb-java:$version"
}

object Junit {
    private const val version = "5.4.1"
    const val api = "org.junit.jupiter:junit-jupiter-api:$version"
    const val engine = "org.junit.jupiter:junit-jupiter-engine:$version"
}

object Kafka {
    object Apache {
        private const val version = "2.3.0"
        const val clients = "org.apache.kafka:kafka-clients:$version"
        const val kafka_2_12 = "org.apache.kafka:kafka_2.12:$version"
        const val streams = "org.apache.kafka:kafka-streams:$version"
    }

    object Confluent {
        private const val version = "5.3.0"
        const val avroSerializer = "io.confluent:kafka-avro-serializer:$version"
        const val schemaRegistry = "io.confluent:kafka-schema-registry:$version"
    }
}

object Kluent {
    private const val version = "1.52"
    const val kluent = "org.amshove.kluent:kluent:$version"
}

object Kotlin {
    const val version = "1.3.50"
}

object Ktor {
    private const val version = "1.3.0"
    const val serverNetty = "io.ktor:ktor-server-netty:$version"
    const val htmlBuilder = "io.ktor:ktor-html-builder:$version"
}

object Logback {
    private const val version = "1.2.3"
    const val classic = "ch.qos.logback:logback-classic:$version"
}

object Logstash {
    private const val version = "5.2"
    const val logbackEncoder = "net.logstash.logback:logstash-logback-encoder:$version"
}

object Mockk {
    private const val version = "1.9.3"
    const val mockk = "io.mockk:mockk:$version"
}

object NAV {
    const val vaultJdbc = "no.nav:vault-jdbc:1.3.1"
    const val kafkaEmbedded = "no.nav:kafka-embedded-env:2.1.1"
}

object Postgresql {
    private const val version = "42.2.5"
    const val postgresql = "org.postgresql:postgresql:$version"
}

object Prometheus {
    private const val version = "0.6.0"
    const val common = "io.prometheus:simpleclient_common:$version"
    const val hotspot = "io.prometheus:simpleclient_hotspot:$version"
    const val logback = "io.prometheus:simpleclient_logback:$version"
}
