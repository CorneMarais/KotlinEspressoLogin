package com.example.kotlinloginuitest

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import com.example.kotlinloginuitest.ui.login.LoginActivity

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule


@RunWith(AndroidJUnit4::class)
@LargeTest
class ExampleInstrumentedTest {

    @get:Rule var mActivityTestRule = ActivityTestRule(LoginActivity::class.java)

    @Test
    fun  Login(){
        onView(withId(R.id.username))
            .perform(typeText("Hallo"))
            .check(matches(withId(R.id.username)))

        onView(withId(R.id.password))
            .check(matches(withId(R.id.password)))
            .perform(typeText("1234567"))
            .check(matches(withText("1234567")))

        onView(withId(R.id.login))
            .check(matches(isClickable()))
            .perform(click())
    }

}
