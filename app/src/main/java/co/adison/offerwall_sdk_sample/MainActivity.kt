package co.adison.offerwall_sdk_sample

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import co.adison.offerwall.Adison
import co.adison.offerwall_sdk_sample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val viewModel by lazy { MainActivityViewModel() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main).apply { vm = viewModel }
    }

    class MainActivityViewModel {
        //오퍼월 노출 함수
        fun onShowOfferwall() {
            Adison.showOfferwall()
        }
    }
}

