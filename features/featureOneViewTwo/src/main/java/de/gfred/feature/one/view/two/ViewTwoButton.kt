package de.gfred.feature.one.view.two

import android.content.Context
import android.util.AttributeSet
import android.widget.Button


class ViewTwoButton : Button {
    constructor(context: Context?) : super(context) {
        setText(R.string.feature_one_view_two_button)
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs){
        setText(R.string.feature_one_view_two_button)
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        setText(R.string.feature_one_view_two_button)
    }
}