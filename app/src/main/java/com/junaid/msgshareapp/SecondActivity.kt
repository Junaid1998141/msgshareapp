package com.junaid.msgshareapp

import android.view.ActionMode
import androidx.appcompat.app.AppCompatActivity

    class SecondActivity:AppCompatActivity() {

        override fun onActionModeStarted(mode: ActionMode?) {
            super.onActionModeStarted(mode)
            setContentView(R.layout.activity_second)
        }

          }