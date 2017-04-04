/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * this activity is the main activity and works on intents;
 */


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    /**
     *@param view calls for intent to number class
     */
    public void submitNumbers(final View view) {
        Intent intent = new Intent(this, Numbers.class);
        startActivity(intent);
    }

    /**
     *@param view calls for intent to family class
     */
    public void submitFamily(final View view) {
        Intent intent = new Intent(this, Family.class);
        startActivity(intent);

    }

    /**
     *@param view calls for intent to phrases class
     */
    public void submitPhrases(final View view) {
        Intent intent = new Intent(this, Phrases.class);
        startActivity(intent);

    }


}
