package com.utilita.model


import com.google.gson.annotations.SerializedName

data class StatusModel(
    @SerializedName("APIs & DBs")
    val aPIsDBs: APIsDBs,
    @SerializedName("Sites")
    val sites: Sites
) {
    data class APIsDBs(
        @SerializedName("Core​API")
        val coreAPI: CoreAPI,
        @SerializedName("Docuware​API")
        val docuwareAPI: DocuwareAPI,
        @SerializedName("Prime DB")
        val primeDB: PrimeDB,
        @SerializedName("Redis DB")
        val redisDB: RedisDB,
        @SerializedName("Redis Q HQAPI")
        val redisQHQAPI: RedisQHQAPI,
        @SerializedName("Redis Q Prime")
        val redisQPrime: RedisQPrime,
        @SerializedName("Redis Q WAPI")
        val redisQWAPI: RedisQWAPI,
        @SerializedName("WebAPI DB")
        val webAPIDB: WebAPIDB,
        @SerializedName("Web​API")
        val webAPI: WebAPI
    ) {
        data class CoreAPI(
            @SerializedName("class")
            val classX: String,
            val responseCode: Int,
            val responseTime: Double,
            val url: Any?
        )

        data class DocuwareAPI(
            @SerializedName("class")
            val classX: String,
            val responseCode: Int,
            val responseTime: Double,
            val url: Any?
        )

        data class PrimeDB(
            @SerializedName("class")
            val classX: String,
            val responseCode: Int,
            val responseTime: Double,
            val url: Any?
        )

        data class RedisDB(
            @SerializedName("class")
            val classX: String,
            val responseCode: Int,
            val responseTime: Double,
            val url: Any?
        )

        data class RedisQHQAPI(
            @SerializedName("class")
            val classX: String,
            val responseCode: Int,
            val responseTime: Any?,
            val url: Any?
        )

        data class RedisQPrime(
            @SerializedName("class")
            val classX: String,
            val responseCode: Int,
            val responseTime: Any?,
            val url: Any?
        )

        data class RedisQWAPI(
            @SerializedName("class")
            val classX: String,
            val responseCode: Int,
            val responseTime: Any?,
            val url: Any?
        )

        data class WebAPIDB(
            @SerializedName("class")
            val classX: String,
            val responseCode: Int,
            val responseTime: Double,
            val url: Any?
        )

        data class WebAPI(
            @SerializedName("class")
            val classX: String,
            val responseCode: Int,
            val responseTime: Double,
            val url: Any?
        )
    }

    data class Sites(
        @SerializedName("My Utilita")
        val myUtilita: MyUtilita,
        @SerializedName("Prime")
        val prime: Prime,
        @SerializedName("Utilita Business")
        val utilitaBusiness: UtilitaBusiness,
        @SerializedName("Utilita Extra")
        val utilitaExtra: UtilitaExtra,
        @SerializedName("Utilita Mobile")
        val utilitaMobile: UtilitaMobile,
        @SerializedName("Utilita Switch")
        val utilitaSwitch: UtilitaSwitch
    ) {
        data class MyUtilita(
            @SerializedName("class")
            val classX: String,
            val responseCode: Int,
            val responseTime: Double,
            val url: String
        )

        data class Prime(
            @SerializedName("class")
            val classX: String,
            val responseCode: Int,
            val responseTime: Double,
            val url: String
        )

        data class UtilitaBusiness(
            @SerializedName("class")
            val classX: String,
            val responseCode: Int,
            val responseTime: Double,
            val url: String
        )

        data class UtilitaExtra(
            @SerializedName("class")
            val classX: String,
            val responseCode: Int,
            val responseTime: Double,
            val url: String
        )

        data class UtilitaMobile(
            @SerializedName("class")
            val classX: String,
            val responseCode: Int,
            val responseTime: Double,
            val url: String
        )

        data class UtilitaSwitch(
            @SerializedName("class")
            val classX: String,
            val responseCode: Int,
            val responseTime: Double,
            val url: String
        )
    }
}