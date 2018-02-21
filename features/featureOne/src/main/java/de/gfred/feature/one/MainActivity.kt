package de.gfred.feature.one

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.jakewharton.rxbinding2.view.RxView
import de.gfred.feature.one.view.two.ViewTwoButton
import de.gfred.featureoneviewone.ViewOneButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : MainActivityViewActions, AppCompatActivity() {
    private var presenter = MainPresenter()

    lateinit var buttonOne: ViewOneButton
    lateinit var buttonTwo: ViewTwoButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()

        presenter.create(this)
    }

    override fun onStop() {
        presenter.destroy()
        super.onStop()
    }

    private fun initView() {
        buttonOne = ViewOneButton(this);
        buttonContainer.addView(buttonOne)

        buttonTwo = ViewTwoButton(this);
        buttonContainer.addView(buttonTwo)
    }

    override fun onButtonOneClicked() = RxView.clicks(buttonOne)

    override fun onButtonTwoClicked() = RxView.clicks(buttonTwo)

    override fun showToast() = Toast.makeText(this, "Button from View Two clicked.", Toast.LENGTH_SHORT).show()
}
