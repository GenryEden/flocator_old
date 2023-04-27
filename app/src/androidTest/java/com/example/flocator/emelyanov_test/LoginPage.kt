package com.example.flocator.emelyanov_test

import com.example.flocator.R
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId

class LoginPage {
    companion object {
        const val LOGIN_FIELD_LOCATOR = R.id.email_login_field
        const val PASSWORD_FIELD_LOCATOR = R.id.password_login_field
        const val SUBMIT_BUTTON_LOCATOR = R.id.entrance_btn
        const val REGISTER_BUTTON_LOCATOR = R.id.registration_btn
    }

    init {
        check()
    }

    fun check() {
        onView(withId(LOGIN_FIELD_LOCATOR)).check(matches(isDisplayed()))
        onView(withId(PASSWORD_FIELD_LOCATOR)).check(matches(isDisplayed()))
        onView(withId(SUBMIT_BUTTON_LOCATOR)).check(matches(isDisplayed()))
        onView(withId(REGISTER_BUTTON_LOCATOR)).check(matches(isDisplayed()))
    }
}