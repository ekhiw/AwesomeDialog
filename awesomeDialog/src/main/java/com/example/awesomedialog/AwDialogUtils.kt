package com.example.awesomedialog

import android.view.View

object AwDialogUtils {


    enum class POSITIONS {
        CENTER, BOTTOM
    }

    internal fun View.show() {
        this.visibility = View.VISIBLE
    }

    internal fun View.hide() {
        this.visibility = View.GONE
    }
}