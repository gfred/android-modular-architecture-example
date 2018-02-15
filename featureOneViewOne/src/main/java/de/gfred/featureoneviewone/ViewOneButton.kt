package de.gfred.featureoneviewone

import android.content.Context
import android.util.AttributeSet
import android.widget.Button


class ViewOneButton : Button {
    constructor(context: Context?) : super(context) {
        setText(R.string.feature_one_view_one_button)
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs){
        setText(R.string.feature_one_view_one_button)
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        setText(R.string.feature_one_view_one_button)
    }
}