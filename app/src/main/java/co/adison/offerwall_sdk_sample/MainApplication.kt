package co.adison.offerwall_sdk_sample

import android.app.Application
import android.content.Context
import android.widget.Toast
import co.adison.offerwall.Adison
import co.adison.offerwall.AdisonOfferwallListener
import co.adison.offerwall.Server
import co.adison.offerwall.data.AdisonError
import junit.framework.Assert

class MainApplication : Application() {
    // !! App ID를 설정해 주세요
    val appId: String? = null

    override fun onCreate() {
        super.onCreate()
        Assert.assertNotNull("App id 를 설정해 주세요", appId)
        appId?.let {
            with(Adison) {
                //App id 설정
                initialize(applicationContext, it)

                //설정한 App id에 맞는 서버 설정
                setServer(Server.Development)

                //광고 목록 상단 앱 바 타이틀 변경
                setDefaultOfferwallListTitle("커스텀 오퍼월 타이틀")

                setOfferwallListener(object : AdisonOfferwallListener() {
                    //
                    override fun onError(exception: Throwable?) {
                        Toast.makeText(applicationContext, "onError()", Toast.LENGTH_SHORT).show()
                    }

                    //광고 참여 실패
                    override fun onParticipateFailure(error: AdisonError?) {
                        Toast.makeText(applicationContext, "onParticipateFailure()", Toast.LENGTH_SHORT).show()
                    }

                    //로그인 요청
                    override fun requestLogin(context: Context?) {
                        Toast.makeText(applicationContext, "requestLogin()", Toast.LENGTH_SHORT).show()
                    }

                })
            }
        }
    }
}