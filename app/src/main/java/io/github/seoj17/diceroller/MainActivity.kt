package io.github.seoj17.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.github.seoj17.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainContract.View {
    private lateinit var binding: ActivityMainBinding
    private lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = MainPresenter(this)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        presenter.start()
    }

    override fun showDiceState() {
        with(binding) {
            rollDice.setOnClickListener {
                val diceState = presenter.calculateNumber()
                binding.dice.setImageResource(diceState)
            }
        }
    }

    fun temp(
        a:Int,
        b: Int,
        c:String,
        d:String
    ) = a + b
}