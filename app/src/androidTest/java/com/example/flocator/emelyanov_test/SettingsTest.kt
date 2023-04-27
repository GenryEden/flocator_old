package com.example.flocator.emelyanov_test

import androidx.test.filters.LargeTest
import com.example.flocator.common.utils.FragmentNavigationUtils
import com.example.flocator.settings.BlackListFragment
import com.example.flocator.settings.SettingsFragment
import org.junit.Before
import org.junit.Test

@LargeTest
class SettingsTest: BaseTest() {
    @Before
    fun start() {
        activityScenario.scenario.onActivity {
            FragmentNavigationUtils.clearAllAndOpenFragment(
                it.supportFragmentManager,
                SettingsFragment()
            )
        }
    }

    @Test
    fun blacklistOpenClose() {
        SettingsPage().openBlacklistPage().goBack()
    }

    @Test
    fun privacyOpenClose() {
        SettingsPage().openPrivacyPage().goBack()
    }

    @Test
    fun exitAccountOpenClose() {
        SettingsPage().openExitAccountPage().close()
    }


    @Test
    fun exitAccountTest() {
        SettingsPage().openExitAccountPage().confirm()
    }


}