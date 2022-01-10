package io.victorpw.debugbannersampleapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import io.victorpw.debugBanner.Banner
import io.victorpw.debugBanner.BannerGravity
import io.victorpw.debugBanner.BannerView

class SecondActivity : AppCompatActivity(), BannerView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        findViewById<Button>(R.id.thirdActivityButton)?.setOnClickListener {
            startActivity(Intent(this, ThirdActivity::class.java))
        }
    }

    override fun createBanner(): Banner {
        return Banner(
                bannerText = "BETA",
                bannerColorRes = R.color.yellow,
                textColorRes = android.R.color.black,
                bannerGravity = BannerGravity.END)
    }
}
