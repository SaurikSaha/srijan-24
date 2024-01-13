package com.iitism.srijan24.retrofit
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.Headers
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface MerchandiseApiService {
    @Multipart
    @POST("api/purchase")
    fun uploadData(
        @Part("tshirtSize") tShirtSize: RequestBody,
        @Part("address") address: RequestBody,
        @Part("quantity") quantity: RequestBody,
        @Part imageURL: MultipartBody.Part
    ): Call<ApiResponse>
}
