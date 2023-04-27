package com.example.flocator.emelyanov_test

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import com.example.flocator.R

class PrivacyPage {
    companion object {
        const val BACK_BUTTON_LOCATOR = R.id.privacy_back_button
        const val CURRENT_LOCATION_BUTTON_LOCATOR = R.id.current_loc_img_frame
        const val APPROX_LOCATION_BUTTON_LOCATOR = R.id.approx_loc_img_frame
        const val FIXED_LOCATION_BUTTON_LOCATOR = R.id.no_loc_img_frame
        const val SELECT_ALL_BUTTON_LOCATOR = R.id.privacy_select_all
        const val RECYCLER_VIEW_LOCATOR = R.id.friend_list
        const val CURRENT_LOC_TEXT_LOCATOR = R.id.current_loc_text
        const val APPROX_LOC_TEXT_LOCATOR = R.id.approx_loc_text
        const val FIX_LOC_TEXT_LOCATOR = R.id.no_loc_text
    }

    init {
        check()
    }

    fun check() {
        onView(withId(BACK_BUTTON_LOCATOR)).check(matches(isDisplayed()))
        onView(withId(CURRENT_LOCATION_BUTTON_LOCATOR)).check(matches(isDisplayed()))
        onView(withId(APPROX_LOCATION_BUTTON_LOCATOR)).check(matches(isDisplayed()))
        onView(withId(FIXED_LOCATION_BUTTON_LOCATOR)).check(matches(isDisplayed()))
        onView(withId(SELECT_ALL_BUTTON_LOCATOR)).check(matches(isDisplayed()))
        onView(withId(RECYCLER_VIEW_LOCATOR)).check(matches(isDisplayed()))
        onView(withId(CURRENT_LOC_TEXT_LOCATOR)).check(matches(withText(R.string.current_location)))
        onView(withId(APPROX_LOC_TEXT_LOCATOR)).check(matches(withText(R.string.approx_location)))
        onView(withId(FIX_LOC_TEXT_LOCATOR)).check(matches(withText(R.string.fix_location)))
    }

    fun goBack(): SettingsPage {
        onView(withId(BACK_BUTTON_LOCATOR)).perform(click())
        return SettingsPage()
    }
}