package com.fhz.flow_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.fhz.flow_demo.intent.UserIntent
import com.fhz.flow_demo.uistate.UserUiState
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private val mainViewModel by viewModels<MainViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.text_view)
        val button = findViewById<Button>(R.id.button)


        button.setOnClickListener {
           //lifecycleScope.launch{
//               mainViewModel.timeFlow.collectLatest{
//                   textView.text = it.toString()
//                   delay(3000)
//               }
//           }
//            mainViewModel.post(UserIntent.GetUserInfoIntent())

        }



        lifecycleScope.launch{
            repeatOnLifecycle(Lifecycle.State.STARTED){
                mainViewModel.userUiState.collect{
                    when(it){
                        is UserUiState.Success -> {
                            textView.text = it.toString()
                        }
                        is UserUiState.Loading -> {
                            textView.text = "loading"
                        }
                        is UserUiState.Error -> {
                            textView.text = it.error.toString()
                        }
                    }
                }
            }
        }


    }
}