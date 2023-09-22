package com.onurdemir.cryptoapp.service

import com.onurdemir.cryptoapp.model.Crypto
import com.onurdemir.cryptoapp.model.CryptoList
import retrofit2.http.GET
import retrofit2.http.Query

interface CryptoAPI {

    @GET("IA32-CryptoComposeData/main/cryptolist.json")
    suspend fun getCryptoList(): CryptoList

    @GET("IA32-CryptoComposeData/main/crypto.json")
    suspend fun getCrypto(): Crypto

    /*
@GET("prices")
suspend fun getCryptoList(
    @Query("key") key : String
) : CryptoList

@GET ("currencies")
suspend fun getCrypto(
    @Query("key") key : String,
    @Query("ids") id : String,
    @Query("attributes") attributes : String
) : Crypto

     */

}