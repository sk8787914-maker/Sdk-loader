package com.github.nukc.stateview

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout

class StateView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    fun showLoading() {
        visibility = VISIBLE
    }

    fun showContent() {
        visibility = VISIBLE
    }

    fun showEmpty() {
        visibility = VISIBLE
    }
}
