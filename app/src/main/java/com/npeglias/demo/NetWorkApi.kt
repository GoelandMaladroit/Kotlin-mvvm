package com.npeglias.demo


import com.npeglias.demo.model.ProductFamily
import retrofit2.Call
import retrofit2.http.GET

interface NetWorkApi {

    @GET("/")
    fun getProducts(): Call<List<ProductFamily>>

}