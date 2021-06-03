object DockerComposeDefaults {

    val environomentVariables : Map<String, String> = mutableMapOf(
        "LEGACY_API_URL" to "http://localhost:8090/person/dittnav-legacy-api",
        "EVENT_HANDLER_URL" to "http://localhost:8092",
        "CORS_ALLOWED_ORIGINS" to "localhost:9002",
        "INNLOGGINGSSTATUS_URL" to "http://localhost:9081/person/innloggingsstatus",

        "OIDC_ISSUER" to "http://localhost:9000",
        "OIDC_DISCOVERY_URL" to "http://localhost:9000/.well-known/openid-configuration",
        "OIDC_ACCEPTED_AUDIENCE" to "stubOidcClient",
        "LOGINSERVICE_IDPORTEN_DISCOVERY_URL" to "http://localhost:9000/.well-known/openid-configuration",
        "LOGINSERVICE_IDPORTEN_AUDIENCE" to "stubOidcClient",
        "OIDC_CLAIM_CONTAINING_THE_IDENTITY" to "pid",

        "KAFKA_BOOTSTRAP_SERVERS" to "localhost:29092",
        "KAFKA_BROKERS" to "localhost:29092",

        "KAFKA_SCHEMAREGISTRY_SERVERS" to "http://localhost:8081",
        "KAFKA_SCHEMA_REGISTRY" to "http://localhost:8081",

        "SERVICEUSER_USERNAME" to "username",
        "SERVICEUSER_PASSWORD" to "password",
        "GROUP_ID" to "dittnav_events",

        "DB_HOST" to "localhost:5432",
        "DB_PORT" to "5432",
        "DB_NAME" to "dittnav-event-cache-preprod",
        "DB_DATABASE" to "dittnav-event-cache-preprod",
        "DB_USERNAME" to "dittnav-event-cache-preprod-user",
        "DB_PASSWORD" to "testpassword",
        "DB_MOUNT_PATH" to "notUsedOnLocalhost",

        "NAIS_CLUSTER_NAME" to "dev-sbs",
        "NAIS_NAMESPACE" to "q1",

        "SENSU_HOST" to "stub",
        "SENSU_PORT" to "0",
        "PRODUCER_ALIASES" to "",

        "INFLUXDB_HOST" to "",
        "INFLUXDB_PORT" to "0",
        "INFLUXDB_DATABASE_NAME" to "",
        "INFLUXDB_USER" to "",
        "INFLUXDB_PASSWORD" to "",
        "INFLUXDB_RETENTION_POLICY" to ""
    )

}
