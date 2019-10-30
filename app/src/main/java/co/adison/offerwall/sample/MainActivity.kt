package co.adison.offerwall.sample

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import co.adison.offerwall.Adison
import co.adison.offerwall.AdisonOfferwallListener

import kotlinx.android.synthetic.main.activity_main.*

open class MainActivity : AppCompatActivity() {

    val APP_ID_DEVELOP = "SnD2RYJ8P4wUGkohmMD9LmWW"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Adison.initialize(this, APP_ID_DEVELOP)
        Adison.setServer(co.adison.offerwall.Server.Development)
        Adison.setIsTester(true)
        Adison.setAllowPoints(true)

        val config = co.adison.offerwall.AdisonConfig()
        config.offerwallListTitle = "오퍼월 샘플"

        Adison.setConfig(config)

        Adison.setOfferwallListener(object: co.adison.offerwall.AdisonOfferwallListener() {
            override fun requestLogin(context: android.content.Context?) {
                startActivity(android.content.Intent(this@MainActivity, LoginActivity::class.java))
            }

            override fun onParticipateFailure(error: co.adison.offerwall.data.AdisonError?) {

            }

            override fun onError(exception: Throwable?) {

            }
        });
    }

    override fun onStart() {
        super.onStart()

        btn_offerwall.setOnClickListener({
            Adison.showOfferwall()
        })

        btn_login.setOnClickListener {
            startActivity(android.content.Intent(this@MainActivity, LoginActivity::class.java))
        }
    }

}
