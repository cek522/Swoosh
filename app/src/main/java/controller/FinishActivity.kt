package controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codys.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*
import utilities.EXTRA_LEAGUE
import utilities.EXTRA_SKILL

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE) ?: ""
        val skill = intent.getStringExtra(EXTRA_SKILL) ?: ""

        searchLeaguesText.text = "Looking for a $league $skill league near you..."
    }
}