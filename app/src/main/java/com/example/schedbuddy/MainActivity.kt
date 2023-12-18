package com.example.schedbuddy

//import android.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
//import android.widget.TextView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.ViewFlipper
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.schedbuddy.ui.theme.SchedbuddyTheme
var honors: Boolean = false
var ap: Boolean = false
var elect: Int = 10
var sounds: Int = 12

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            setContentView(R.layout.activity_main)
            val classes: Button = findViewById(R.id.button1)
            val careers: Button = findViewById(R.id.button2)
            val home : ImageView = findViewById(R.id.imageView3)
            val work : ImageView = findViewById(R.id.imageView5)
            val school : ImageView = findViewById(R.id.imageView4)
            val glass : ImageView = findViewById(R.id.imageView)
            val viewFlipper: ViewFlipper = findViewById(R.id.myViewFlipper)
            val submit: Button = findViewById(R.id.submitButton)
            val submitTwo: Button = findViewById(R.id.submitButton2)
            val studying: Button = findViewById(R.id.studyHall)
            val socialStudying: Button = findViewById(R.id.historyButton)
            val gymHealth: Button = findViewById(R.id.nutrition)
            val musics: Button = findViewById(R.id.music)
            val electivesAndFun: Button = findViewById(R.id.electives)
            val bio: Button = findViewById(R.id.biology)
            val lang: Button = findViewById(R.id.languageOfWorld)
            val eng: Button = findViewById(R.id.english)
            val numbersAndMaths: Button = findViewById(R.id.mathematics)
            val doctor: Button = findViewById(R.id.doctorButton)
            val socialServ: Button = findViewById(R.id.socialButton)
            val ads: Button = findViewById(R.id.adsButton)
            val business: Button = findViewById(R.id.businessButton)
            val iT: Button = findViewById(R.id.iTButton)
            val edu: Button = findViewById(R.id.eduButton)
            val mathJob: Button = findViewById(R.id.mathButton)
            val scienceJob: Button = findViewById(R.id.scienceButton)
            val engineJob: Button = findViewById(R.id.engineButton)

            //val scheduleFinal = mutableListOf("")

            val radioGroup1: RadioGroup = findViewById(R.id.honors)
            radioGroup1.setOnCheckedChangeListener { group, checkedId ->
                val selectedRadioButton: RadioButton = findViewById(checkedId)
                val selectedOption: String = selectedRadioButton.text.toString()
                if (selectedOption == "Yes, and I want to continue" || selectedOption == "No, but I want to start"){
                    honors = true
                    bio.text = "Honors Biology"
                    eng.text = "Honors English 9"
                }else{
                    honors = false
                }
            }

            val radioGroup2: RadioGroup = findViewById(R.id.math)
            radioGroup2.setOnCheckedChangeListener { group, checkedId ->
                val selectedRadioButton: RadioButton = findViewById(checkedId)
                val selectedOption: String = selectedRadioButton.text.toString()
                if (selectedOption == "8th Grade"){
                    numbersAndMaths.text = "Algebra I"
                }else if (selectedOption == "Algebra 1"){
                    if(honors == true){
                        numbersAndMaths.text = "Honors Geometry"
                    }else {
                        numbersAndMaths.text = "Geometry"
                    }
                }else if (selectedOption == "Geometry"){
                    if(honors == true){
                        numbersAndMaths.text = "Honors Algebra II"
                    }else {
                        numbersAndMaths.text = "Algebra II"
                    }
                }else{
                    numbersAndMaths.text = "Algebra Enrich."
                }
            }

            val radioGroup3: RadioGroup = findViewById(R.id.AP)
            radioGroup3.setOnCheckedChangeListener { group, checkedId ->
                val selectedRadioButton: RadioButton = findViewById(checkedId)
                val selectedOption: String = selectedRadioButton.text.toString()
                if (selectedOption == "Yes"){
                    ap = true
                    socialStudying.text = "AP World History"
                }else{
                    ap = false
                }
            }

            val radioGroup4: RadioGroup = findViewById(R.id.gym)
            radioGroup4.setOnCheckedChangeListener { group, checkedId ->
                val selectedRadioButton: RadioButton = findViewById(checkedId)
                val selectedOption: String = selectedRadioButton.text.toString()
                if (selectedOption == "Yes, one semester"){
                    gymHealth.text = "Gym (1 Sem)"
                }else if (selectedOption == "Yes, two semesters"){
                    gymHealth.text = "Gym (2 Sem)"
                }else if (selectedOption == "No, but I need health"){
                    gymHealth.text = "Health"
                }else if (selectedOption == "Yes, one semester, and I need health too"){
                    gymHealth.text = "Gym (1) + Health"
                }else if (selectedOption == "Yes, two semesters, and I need health too"){
                    gymHealth.text = "Gym (2) + Health"
                }else{
                    gymHealth.text = ""
                }
            }

            val radioGroup5: RadioGroup = findViewById(R.id.elective)
            radioGroup5.setOnCheckedChangeListener { group, checkedId ->
                val selectedRadioButton: RadioButton = findViewById(checkedId)
                val selectedOption: String = selectedRadioButton.text.toString()
                if (selectedOption == "Family and Consumer Sciences"){
                    electivesAndFun.text = "FACS"
                    elect = 11
                }else if (selectedOption == "Art"){
                    electivesAndFun.text = "Art"
                    elect = 10
                }else if (selectedOption == "Computer Science"){
                    elect = 14
                    if(ap == true){
                        electivesAndFun.text = "AP CSA"
                    }else {
                        electivesAndFun.text = "Computer Sci."
                    }
                }else if (selectedOption == "Business"){
                    electivesAndFun.text = "Business"
                    elect = 13
                }else{
                    electivesAndFun.text = "Nutrition"
                    elect = 22
                }
            }

            val radioGroup6: RadioGroup = findViewById(R.id.performing_arts)
            radioGroup6.setOnCheckedChangeListener { group, checkedId ->
                val selectedRadioButton: RadioButton = findViewById(checkedId)
                val selectedOption: String = selectedRadioButton.text.toString()
                if (selectedOption == "Yes, Band"){
                    musics.text = "Band"
                    sounds = 17
                }else if (selectedOption == "Yes, Choir"){
                    musics.text = "Choir"
                    sounds = 15
                }else if (selectedOption == "Yes, Orchestra"){
                    musics.text = "Orchestra"
                    sounds = 16
                }else if (selectedOption == "Yes, Theatre"){
                    musics.text = "Theatre"
                    sounds = 18
                }else if (selectedOption == "Yes, Piano"){
                    musics.text = "Piano"
                    sounds = 19
                }else{
                    musics.text = "P. Arts"
                    sounds = 20
                }
            }

            val radioGroup7: RadioGroup = findViewById(R.id.language)
            radioGroup7.setOnCheckedChangeListener { group, checkedId ->
                val selectedRadioButton: RadioButton = findViewById(checkedId)
                val selectedOption: String = selectedRadioButton.text.toString()
                if (selectedOption == "Spanish 1"){
                    lang.text = "Spanish 1"
                }else if (selectedOption == "Spanish 2"){
                    if(honors == true){
                        lang.text = "Honors Spanish 2"
                    }else {
                        lang.text = "Spanish 2"
                    }
                }else if (selectedOption == "French 1"){
                    lang.text = "French 1"
                }else if (selectedOption == "French 2"){
                    if(honors == true){
                        lang.text = "Honors French 2"
                    }else {
                        lang.text = "French 2"
                    }
                }else if (selectedOption == "German 1"){
                    lang.text = "German 1"
                }else if (selectedOption == "German 2"){
                    if(honors == true){
                        lang.text = "Honors German 2"
                    }else {
                        lang.text = "German 2"
                    }
                }else if (selectedOption == "Language For Heritage Speakers 1"){
                    lang.text = "Heritage 1"
                }else{
                    lang.text = "Heritage 2"
                }
            }

            /*
            val radioGroup8: RadioGroup = findViewById(R.id.additional_classes)
            radioGroup8.setOnCheckedChangeListener { group, checkedId ->
                val selectedRadioButton: RadioButton = findViewById(checkedId)
                val selectedOption: String = selectedRadioButton.text.toString()
                if (selectedOption == "Additional science classes"){
                    other = "Science"
                }else if (selectedOption == "Additional social studies classes"){
                    other = "Social"
                }else{
                    other = "None"
                }
            }
             */

            val radioGroup9: RadioGroup = findViewById(R.id.study_hall)
            radioGroup9.setOnCheckedChangeListener { group, checkedId ->
                val selectedRadioButton: RadioButton = findViewById(checkedId)
                val selectedOption: String = selectedRadioButton.text.toString()
                if (selectedOption == "Yes"){
                    studying.text = "Study Hall"
                }else if (selectedOption == "Yes, only 1 semester"){
                    studying.text = "Study Hall"
                }else{
                    studying.text = "No Study Hall"
                }
            }

            val radioGroup10: RadioGroup = findViewById(R.id.group1)
            radioGroup10.setOnCheckedChangeListener { group, checkedId ->
                val selectedRadioButton: RadioButton = findViewById(checkedId)
                val selectedOption: String = selectedRadioButton.text.toString()
                if (selectedOption == "Disagree"){
                    socialServ.visibility = View.INVISIBLE
                }else{
                    socialServ.visibility = View.VISIBLE
                }
            }

            val radioGroup11: RadioGroup = findViewById(R.id.group2)
            radioGroup11.setOnCheckedChangeListener { group, checkedId ->
                val selectedRadioButton: RadioButton = findViewById(checkedId)
                val selectedOption: String = selectedRadioButton.text.toString()
                if (selectedOption == "Disagree"){
                    iT.visibility = View.INVISIBLE
                }else{
                    iT.visibility = View.VISIBLE
                }
            }

            val radioGroup12: RadioGroup = findViewById(R.id.group3)
            radioGroup12.setOnCheckedChangeListener { group, checkedId ->
                val selectedRadioButton: RadioButton = findViewById(checkedId)
                val selectedOption: String = selectedRadioButton.text.toString()
                if (selectedOption == "Disagree"){
                    edu.visibility = View.INVISIBLE
                }else{
                    edu.visibility = View.VISIBLE
                }
            }

            val radioGroup13: RadioGroup = findViewById(R.id.group4)
            radioGroup13.setOnCheckedChangeListener { group, checkedId ->
                val selectedRadioButton: RadioButton = findViewById(checkedId)
                val selectedOption: String = selectedRadioButton.text.toString()
                if (selectedOption == "Disagree"){
                    business.visibility = View.INVISIBLE
                }else{
                    business.visibility = View.VISIBLE
                }
            }

            val radioGroup14: RadioGroup = findViewById(R.id.group5)
            radioGroup14.setOnCheckedChangeListener { group, checkedId ->
                val selectedRadioButton: RadioButton = findViewById(checkedId)
                val selectedOption: String = selectedRadioButton.text.toString()
                if (selectedOption == "Disagree"){
                    engineJob.visibility = View.INVISIBLE
                }else{
                    engineJob.visibility = View.VISIBLE
                }
            }

            val radioGroup15: RadioGroup = findViewById(R.id.group6)
            radioGroup15.setOnCheckedChangeListener { group, checkedId ->
                val selectedRadioButton: RadioButton = findViewById(checkedId)
                val selectedOption: String = selectedRadioButton.text.toString()
                if (selectedOption == "Disagree"){
                    ads.visibility = View.INVISIBLE
                }else{
                    ads.visibility = View.VISIBLE
                }
            }

            val radioGroup16: RadioGroup = findViewById(R.id.group7)
            radioGroup16.setOnCheckedChangeListener { group, checkedId ->
                val selectedRadioButton: RadioButton = findViewById(checkedId)
                val selectedOption: String = selectedRadioButton.text.toString()
                if (selectedOption == "Disagree"){
                    doctor.visibility = View.INVISIBLE
                }else{
                    doctor.visibility = View.VISIBLE
                }
            }

            val radioGroup17: RadioGroup = findViewById(R.id.group8)
            radioGroup17.setOnCheckedChangeListener { group, checkedId ->
                val selectedRadioButton: RadioButton = findViewById(checkedId)
                val selectedOption: String = selectedRadioButton.text.toString()
                if (selectedOption == "Disagree"){
                    mathJob.visibility = View.INVISIBLE
                }else{
                    mathJob.visibility = View.VISIBLE
                }
            }

            val radioGroup18: RadioGroup = findViewById(R.id.group9)
            radioGroup18.setOnCheckedChangeListener { group, checkedId ->
                val selectedRadioButton: RadioButton = findViewById(checkedId)
                val selectedOption: String = selectedRadioButton.text.toString()
                if (selectedOption == "Disagree"){
                    scienceJob.visibility = View.INVISIBLE
                }else{
                    scienceJob.visibility = View.VISIBLE
                }
            }

            submit.setOnClickListener {
                viewFlipper.displayedChild = 3
            }

            submitTwo.setOnClickListener {
                viewFlipper.displayedChild = 4
            }

            classes.setOnClickListener {
                viewFlipper.displayedChild = 1
            }

            careers.setOnClickListener {
                viewFlipper.displayedChild = 2
            }

            home.setOnClickListener{
                viewFlipper.displayedChild = 0
            }

            work.setOnClickListener{
                viewFlipper.displayedChild = 4
            }

            school.setOnClickListener {
                viewFlipper.displayedChild = 3
            }

            glass.setOnClickListener {
                viewFlipper.displayedChild = 5
            }

            bio.setOnClickListener {
                viewFlipper.displayedChild = 8
            }

            socialStudying.setOnClickListener {
                viewFlipper.displayedChild = 9
            }

            numbersAndMaths.setOnClickListener {
                viewFlipper.displayedChild = 7
            }

            eng.setOnClickListener {
                viewFlipper.displayedChild = 6
            }

            electivesAndFun.setOnClickListener {
                viewFlipper.displayedChild = elect
            }

            lang.setOnClickListener {
                viewFlipper.displayedChild = 11
            }

            musics.setOnClickListener {
                viewFlipper.displayedChild = sounds
            }

            gymHealth.setOnClickListener {
                viewFlipper.displayedChild = 21
            }

            doctor.setOnClickListener {
                viewFlipper.displayedChild = 23
            }

            socialServ.setOnClickListener {
                viewFlipper.displayedChild = 23
            }

            ads.setOnClickListener {
                viewFlipper.displayedChild = 23
            }

            business.setOnClickListener {
                viewFlipper.displayedChild = 23
            }

            iT.setOnClickListener {
                viewFlipper.displayedChild = 23
            }

            edu.setOnClickListener {
                viewFlipper.displayedChild = 23
            }

            mathJob.setOnClickListener {
                viewFlipper.displayedChild = 23
            }

            scienceJob.setOnClickListener {
                viewFlipper.displayedChild = 23
            }

            engineJob.setOnClickListener {
                viewFlipper.displayedChild = 23
            }

            SchedbuddyTheme {
                 //A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SchedbuddyTheme {
        Greeting("Android")
    }
}