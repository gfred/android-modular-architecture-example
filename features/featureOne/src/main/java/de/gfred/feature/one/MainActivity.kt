package de.gfred.feature.one

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import com.jakewharton.rxbinding2.view.RxView
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var presenter: IMainPresenter

    lateinit var buttonOne: Button
    lateinit var buttonTwo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    override fun onStart() {
        super.onStart()
        presenter.create(this)
    }

    override fun onStop() {
        presenter.destroy()
        super.onStop()
    }

    private fun initView() {
        buttonOne = Button(this);
        buttonContainer.addView(buttonOne)

        buttonTwo = Button(this);
        buttonContainer.addView(buttonTwo)
    }

    fun onButtonOneClicked() = RxView.clicks(buttonOne)

    fun onButtonTwoClicked() = RxView.clicks(buttonTwo)

    fun showToast() = Toast.makeText(this, "Button from View Two clicked.", Toast.LENGTH_SHORT).show()
}
