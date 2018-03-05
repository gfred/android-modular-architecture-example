package de.gfred.feature.one

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.jakewharton.rxbinding2.view.RxView
import com.jakewharton.rxbinding2.widget.RxTextView
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_feature_one.*
import javax.inject.Inject

class FeatureOneActivity : AppCompatActivity() {
    @Inject
    lateinit var presenter: FeatureOnePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_one)
    }

    override fun onStart() {
        super.onStart()
        presenter.create(this)
    }

    override fun onStop() {
        presenter.destroy()
        super.onStop()
    }

    fun setUserName(username: String) {
        etUserName.setText(username)
        etUserName.setSelection(username.length)
    }

    fun onUserNameChanged() = RxTextView.textChanges(etUserName)

    fun onButtonOneClicked() = RxView.clicks(buttonOne)

    fun onButtonTwoClicked() = RxView.clicks(buttonTwo)

    fun showToast() = Toast.makeText(this, "Button from View Two clicked.", Toast.LENGTH_SHORT).show()
}
