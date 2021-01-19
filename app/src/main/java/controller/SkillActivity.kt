package controller

import android.os.Bundle
import utilities.EXTRA_LEAGUE
import android.content.Intent
import android.view.View
import android.widget.Toast
import com.codys.swoosh.R
import kotlinx.android.synthetic.main.activity_skill.*
import utilities.EXTRA_SKILL

class SkillActivity : BaseActivity() {
    var league = ""
    var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE) ?: ""
        println(league)
    }

    fun onSkillFinishClick(view: View){
        if(skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE,league)
            finishActivity.putExtra(EXTRA_SKILL,skill)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this,"Please select a skill level", Toast.LENGTH_SHORT).show()
        }
    }

    fun onBallerClick(view: View){
        beginnerSkillButton.isChecked = false
        skill = "baller"
    }

    fun onBeginnerClick(view: View) {
        ballerSkillButton.isChecked = false
        skill = "beginner"
    }
}