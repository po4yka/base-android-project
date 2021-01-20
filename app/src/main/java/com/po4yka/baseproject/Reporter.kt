package com.po4yka.baseproject

import android.util.Log
import timber.log.Timber

class Reporter: Timber.Tree() {

    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        // TODO add log with your integrated system
        Log.d("$tag", message)
    }
}
