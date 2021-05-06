package com.utilita.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.utilita.R
import com.utilita.utils.Utils
import kotlinx.android.synthetic.main.status_details_activity.*
import kotlinx.android.synthetic.main.status_item_view.*

class StatusDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.status_details_activity)

        status_title.text = intent.getStringExtra(Utils.TAG_STATUS_TITLE)
        response_class.text = intent.getStringExtra(Utils.TAG_STATUS_DETAILS_RESPONSE_CLASS)
        status_response_code.text = intent.getIntExtra(Utils.TAG_STATUS_DETAILS_RESPONSE_CODE,0).toString()
        status_response_time.text = intent.getDoubleExtra(Utils.TAG_STATUS_DETAILS_RESPONSE_TIME,0.0).toString()
        status_url.text = intent.getStringExtra(Utils.TAG_STATUS_DETAILS_RESPONSE_URL)

    }
}