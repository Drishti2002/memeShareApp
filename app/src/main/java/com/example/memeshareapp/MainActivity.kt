package com.example.memeshareapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.util.Log
import android.view.View
//import android.widget.ImageView
//import com.android.volley.Request
//import com.android.volley.Response
//import com.android.volley.toolbox.JsonObjectRequest
//import com.android.volley.toolbox.Volley
//import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //loadingMeme()
    }

//    private fun loadingMeme(){
//        val queue = Volley.newRequestQueue(this)
//        val url = "https://meme-api.com/gimme"
//        val memeImg = findViewById<ImageView>(R.id.memeImg)
//
//
//        val jsonRequest = JsonObjectRequest(Request.Method.GET, url, null,
//            { response ->
//                val url = response.getString("url")
//                Glide.with(this).load(url).into(memeImg)
//
//            },
//             {  })
//
//
//        queue.add(jsonRequest)
//
//
//    }

    fun shareMeme(view: View) {}
    fun nextMeme(view: View) {}

}




