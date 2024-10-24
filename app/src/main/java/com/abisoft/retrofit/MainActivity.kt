package com.abisoft.retrofit

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.abisoft.retrofit.networking.ApiClient
import com.abisoft.retrofit.networking.ApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private  val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val apiService = ApiClient.getRetrofit().create(ApiService::class.java)

        apiService.getMarvels()
            .enqueue(object :Callback<List<MarvelData>>{
                override fun onResponse(
                    call: Call<List<MarvelData>>,
                    response: Response<List<MarvelData>>
                ) {
                    if (response.isSuccessful && response.body() != null){
                        Log.d(TAG, "onResponse: ${response.body()}")
                        println("dkjfnkjfnkdvjknd")
                    }
                    else{
                        Log.e(TAG, "Response failed. Code: ${response.code()}, Message: ${response.message()}")
                    }
                }

                override fun onFailure(call: Call<List<MarvelData>>, t: Throwable) {
                    Log.e(TAG, "API call failed: ${t.message}", t)
                }


            })

    }
}