package co.adison.offerwall.sample

import android.app.Application
import android.content.Context
import android.support.multidex.MultiDex
import android.support.multidex.MultiDexApplication
import android.widget.Toast
import co.adison.offerwall.Adison
import co.adison.offerwall.AdisonOfferwallListener
import co.adison.offerwall.Server
import co.adison.offerwall.data.AdisonError

class MainApplication : MultiDexApplication() {

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)

        MultiDex.install(this)
    }

}
