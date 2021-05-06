package com.utilita.model

import android.icu.text.CaseMap
import com.google.gson.annotations.SerializedName

/*data class StatusModel(
        var userId:Int?=0,
        var id:Int?=0,
        var title:String?="",
        var body:String?=""
)*/

data class StatusModel(
         @SerializedName("APIs & DBs")
         val aPIsDBs: APIsDBs,
         @SerializedName("Sites")
         val sites: Sites
 ) {
     data class APIsDBs(
             @SerializedName("Core​API")
             val coreAPI: Details,
             @SerializedName("Docuware​API")
             val docuwareAPI: Details,
             @SerializedName("Prime DB")
             val primeDB: Details,
             @SerializedName("Redis DB")
             val redisDB: Details,
             @SerializedName("Redis Q HQAPI")
             val redisQHQAPI: Details,
             @SerializedName("Redis Q Prime")
             val redisQPrime: Details,
             @SerializedName("Redis Q WAPI")
             val redisQWAPI: Details,
             @SerializedName("WebAPI DB")
             val webAPIDB: Details,
             @SerializedName("Web​API")
             val webAPI: Details
     )

         data class Details(
             @SerializedName("class")
             val classX: String,
             val responseCode: Int,
             val responseTime: Double,
             val url: String
         )

     data class Sites(
             @SerializedName("My Utilita")
             val myUtilita: Details,
             @SerializedName("Prime")
             val prime: Details,
             @SerializedName("Utilita Business")
             val utilitaBusiness: Details,
             @SerializedName("Utilita Extra")
             val utilitaExtra: Details,
             @SerializedName("Utilita Mobile")
             val utilitaMobile: Details,
             @SerializedName("Utilita Switch")
             val utilitaSwitch: Details
     )
 }
   /* @SerializedName("APIs & DBs") val APIsDBs: List<APIsDBsStatus>,
    @SerializedName("Sites") val Sites: List<SitesStatus>
)
    data class APIsDBsStatus(
        @SerializedName("Core​API")
        val coreAPI: Details,
        @SerializedName("Docuware​API")
        val docuwareAPI: Details,
        @SerializedName("Prime DB")
        val primeDB: Details,
        @SerializedName("Redis DB")
        val redisDB: Details,
        @SerializedName("Redis Q HQAPI")
        val redisQHQAPI: Details,
        @SerializedName("Redis Q Prime")
        val redisQPrime: Details,
        @SerializedName("Redis Q WAPI")
        val redisQWAPI: Details,
        @SerializedName("WebAPI DB")
        val webAPIDB: Details,
        @SerializedName("Web​API")
        val webAPI: Details
    )

    data class SitesStatus(
        @SerializedName("My Utilita")
        val myUtilita: Details,
        @SerializedName("Prime")
        val prime: Details,
        @SerializedName("Utilita Business")
        val utilitaBusiness: Details,
        @SerializedName("Utilita Extra")
        val utilitaExtra: Details,
        @SerializedName("Utilita Mobile")
        val utilitaMobile: Details,
        @SerializedName("Utilita Switch")
        val utilitaSwitch: Details
    )

data class Details(
        @SerializedName("url")
        val url: Any?,
        @SerializedName("responseCode")
        val responseCode: Int,
        @SerializedName("responseTime")
        val responseTime: Double,
        @SerializedName("class")
        val classX: String

)*/