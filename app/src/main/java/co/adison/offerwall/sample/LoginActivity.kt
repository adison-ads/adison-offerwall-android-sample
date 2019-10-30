package co.adison.offerwall.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import android.widget.Toast
import co.adison.offerwall.Adison

class LoginActivity : AppCompatActivity() {

    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        textView = findViewById(R.id.et_id)
        textView.text = Adison.getUid()
    }

    fun login(v: View?) {
        val id = if (textView.text.isNullOrBlank()) {
            null
        } else {
            textView.text.toString()
        }
        Adison.setUid(id)
        Toast.makeText(this, "Set Uid '$id'", Toast.LENGTH_SHORT).show()
        finish()
    }

}
