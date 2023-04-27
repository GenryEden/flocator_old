package com.example.flocator.emelyanov_test

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import com.example.flocator.R

class SettingsPage {
    companion object {
        const val NICKNAME_FIELD_LOCATOR = R.id.name_field
        const val DATE_OF_BIRTH_LINE_LOCATOR = R.id.date_of_birth_line
        const val BLACKLIST_LINE_LOCATOR = R.id.blacklist_line
        const val PRIVACY_LINE_LOCATOR = R.id.privacy_line
        const val CHANGE_PASS_LINE_LOCATOR = R.id.change_password_line
        const val EXIT_ACCOUNT_LINE_LOCATOR = R.id.exit_account_line
        const val DELETE_ACCOUNT_LINE_LOCATOR = R.id.delete_account_line
        const val DATE_OF_BIRTH_TITLE_LOCATOR = R.id.date_of_birth_title
        const val BLACKLIST_LINE_TITLE_LOCATOR = R.id.blacklist_line_title
    }

    init {
        check()
    }

    fun check() {
        onView(withId(NICKNAME_FIELD_LOCATOR)).check(matches(isDisplayed()))
        onView(withId(DATE_OF_BIRTH_LINE_LOCATOR)).check(matches(isDisplayed()))
        onView(withId(BLACKLIST_LINE_LOCATOR)).check(matches(isDisplayed()))
        onView(withId(PRIVACY_LINE_LOCATOR)).check(matches(isDisplayed()))
        onView(withId(CHANGE_PASS_LINE_LOCATOR)).check(matches(isDisplayed()))
        onView(withId(EXIT_ACCOUNT_LINE_LOCATOR)).check(matches(isDisplayed()))
        onView(withId(DELETE_ACCOUNT_LINE_LOCATOR)).check(matches(isDisplayed()))
        onView(withId(DATE_OF_BIRTH_TITLE_LOCATOR)).check(matches(withText(R.string.date_of_birth)))
        onView(withId(BLACKLIST_LINE_TITLE_LOCATOR)).check(matches(withText(R.string.black_list)))
        onView(withParent(withId(PRIVACY_LINE_LOCATOR))).check(matches(withText(R.string.privacy)))
        onView(withParent(withId(CHANGE_PASS_LINE_LOCATOR))).check(matches(withText(R.string.change_pass)))
        onView(withParent(withId(EXIT_ACCOUNT_LINE_LOCATOR))).check(matches(withText(R.string.exit_account)))
        onView(withParent(withId(DELETE_ACCOUNT_LINE_LOCATOR))).check(matches(withText(R.string.delete_account)))
    }

    fun enterNickname(text: String) {
        onView(withId(NICKNAME_FIELD_LOCATOR)).perform(
            typeText(text),
            closeSoftKeyboard()
        )
    }

    fun openBlacklistPage(): BlacklistPage {
        onView(withId(BLACKLIST_LINE_LOCATOR)).perform(click())
        return BlacklistPage()
    }

    fun openPrivacyPage(): PrivacyPage {
        onView(withId(PRIVACY_LINE_LOCATOR)).perform(click())
        return PrivacyPage()
    }

    fun openExitAccountPage(): ExitAccountPage {
        onView(withId(EXIT_ACCOUNT_LINE_LOCATOR)).perform(click())
        return ExitAccountPage()
    }
}