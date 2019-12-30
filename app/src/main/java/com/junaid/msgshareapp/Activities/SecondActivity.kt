package com.junaid.msgshareapp.Activities

import android.view.ActionMode
import androidx.appcompat.app.AppCompatActivity
import com.junaid.msgshareapp.R

class SecondActivity:AppCompatActivity() {

        override fun onActionModeStarted(mode: ActionMode?) {
            super.onActionModeStarted(mode)
            setContentView(R.layout.activity_second)

        }
     }