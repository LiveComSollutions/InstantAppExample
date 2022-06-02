package com.livecom.instantappexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope

class MyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val link = intent.data ?: return // there is no link in intent, do what you need

        // https://thesollution.com/s/{videoId}

        val pathSegments = link.pathSegments
        if (pathSegments.isEmpty()) {
            // there is no link in intent, do what you need
            lifecycleScope.launchWhenCreated {
                //LiveCom.openVideoListScreen(this@MyActivity)
                finish()
            }
            return
        }

        val id = pathSegments.getOrNull(1) ?: kotlin.run {
            // there is no link in intent, do what you need
            lifecycleScope.launchWhenCreated {
                //LiveCom.openVideoListScreen(this@MyActivity)
                finish()
            }
            return
        }

        if (pathSegments[0] == "s") {
            lifecycleScope.launchWhenCreated {
                //LiveCom.openVideoById(this@MyActivity, streamId = id)
                finish()
            }
        } else {
            // there is no link in intent, do what you need
            lifecycleScope.launchWhenCreated {
                //LiveCom.openVideoListScreen(this@MyActivity)
                finish()
            }
        }
    }
}