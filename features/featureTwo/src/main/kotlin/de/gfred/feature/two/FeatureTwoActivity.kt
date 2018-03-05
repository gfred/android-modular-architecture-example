package de.gfred.feature.two

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import dagger.android.AndroidInjection
import de.gfred.feature.two.two.R
import kotlinx.android.synthetic.main.actvitiy_feature_two.*
import javax.inject.Inject

class FeatureTwoActivity : AppCompatActivity() {

    @Inject
    lateinit var presenter: FeatureTwoPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actvitiy_feature_two)
    }

    override fun onStart() {
        super.onStart()
        presenter.create(this)
    }

    override fun onStop() {
        presenter.destroy()
        super.onStop()
    }

    fun setStringValue(value: String) = tvValue.setText(value)
}
