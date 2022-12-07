package io.github.seoj17.diceroller

class MainContract {
    interface View {
        fun showDiceState()
    }

    interface Presenter {
        fun start()

        fun calculateNumber(): Int
    }
}