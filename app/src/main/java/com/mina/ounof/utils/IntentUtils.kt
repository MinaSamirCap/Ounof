package com.mina.ounof.utils

import android.app.Activity
import android.content.Intent
import android.net.Uri

class IntentUtils {
    companion object {
        fun openBrowser(activity: Activity, url: String) {
            try {
                val i = Intent(Intent.ACTION_VIEW)
                i.data = Uri.parse(url)
                activity.startActivity(i)
            } catch (ignored: Exception) {

            }

        }


        fun openDial(activity: Activity, phone: String) {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:$phone")
            activity.startActivity(intent)
        }
    }
}