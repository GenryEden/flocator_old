package com.example.flocator.emelyanov_test

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import com.example.flocator.R

class BlacklistPage() {
    companion object {
        const val BACKARROW_BUTTON_LOCATOR = R.id.blacklist_back_button
        const val TITLE_LOCATOR = R.id.blacklist_title
        const val UNSELECT_ALL_LOCATOR = R.id.blacklist_unselect_all_frame
    }

    init {
        check()
    }

    fun check() {
        onView(withId(BACKARROW_BUTTON_LOCATOR)).check(matches(isDisplayed()))
        onView(withParent(withId(UNSELECT_ALL_LOCATOR))).check(matches(withText(R.string.uncheck_everyone)))
        onView(withId(TITLE_LOCATOR)).check(matches(withText(R.string.black_list)))
    }

    fun goBack(): SettingsPage {
        onView(withId(BACKARROW_BUTTON_LOCATOR)).perform(click())
        return SettingsPage()
    }
}