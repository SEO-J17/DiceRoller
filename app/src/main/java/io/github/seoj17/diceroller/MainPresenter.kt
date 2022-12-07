package io.github.seoj17.diceroller

import java.util.*


class MainPresenter(
    private val view: MainContract.View
) : MainContract.Presenter {
    override fun start() {
        view.showDiceState()
    }

    override fun calculateNumber(): Int {
        return when (Random().nextInt(6)) {
            0 -> R.drawable.dice_1
            1 -> R.drawable.dice_2
            2 -> R.drawable.dice_3
            3 -> R.drawable.dice_4
            4 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
}