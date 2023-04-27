package com.example.flocator.emelyanov_test

import android.util.Log
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.flocator.R;

class ExitAccountPage {
    companion object {
        const val WINDOW_TITLE_LOCATOR = R.id.settings_exit_account_popup_title
        const val ENSURE_TEXT_LOCATOR = R.id.are_you_sure_exit_text
        const val CONFIRM_BUTTON_LOCATOR = R.id.exit_account_confirm_button
        const val CLOSE_WINDOW_BUTTON_LOCATOR = R.id.exit_account_close_button
    }

    fun check() {
        onView(withId(WINDOW_TITLE_LOCATOR)).check(matches(isDisplayed()))
        onView(withId(ENSURE_TEXT_LOCATOR)).check(matches(isDisplayed()))
        onView(withId(CONFIRM_BUTTON_LOCATOR)).check(matches(isDisplayed()))
        onView(withId(CLOSE_WINDOW_BUTTON_LOCATOR)).check(matches(isDisplayed()))
    }

    fun confirm(): LoginPage {
        onView(withId(CONFIRM_BUTTON_LOCATOR)).perform(click())
        return LoginPage()
    }

    fun close(): SettingsPage {
        onView(withId(CLOSE_WINDOW_BUTTON_LOCATOR)).perform(click())
        return SettingsPage()
    }
}