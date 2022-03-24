package cn.lentme.projects.whitetile.main


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cn.lentme.projects.whitetile.core.GameSystem
import cn.lentme.projects.whitetile.databinding.ActivityMainBinding
import cn.lentme.projects.whitetile.game.view.TileScreenView

class MainActivity : AppCompatActivity() {
    private val tag = "MainActivity"
    private lateinit var _binding: ActivityMainBinding
    private lateinit var _gameManager: GameSystem

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(TileScreenView(this))
        init()
    }

    private fun init(){

    }
}