package company.xy.sdk.ui.sample

import android.content.Intent
import android.os.Bundle

import company.xy.sdk.ui.XYBaseActivity
import company.xy.sdk.ui.views.XYButton

open class XYOUISampleActivity : XYBaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_xyo_ui_sample)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        val secondaryActivityButton = findViewById<XYButton>(R.id.secondaryActivityButton)
        secondaryActivityButton.setOnClickListener {
            val intent = Intent(this@XYOUISampleActivity, XYOSecondaryActivity::class.java)
            startActivity(intent)
        }
    }
}
