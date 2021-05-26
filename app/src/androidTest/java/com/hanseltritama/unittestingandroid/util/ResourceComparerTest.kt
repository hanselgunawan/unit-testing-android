package com.hanseltritama.unittestingandroid.util

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import com.hanseltritama.unittestingandroid.R
import org.junit.After
import org.junit.Before
import org.junit.Test

class ResourceComparerTest {

    private var resourceComparer: ResourceComparer? = null

    @Before
    fun setup() {
        resourceComparer = ResourceComparer()
    }

    @After
    fun tearDown() {
        resourceComparer = null
    }

    @Test
    fun stringResourceSameAsGivenString_returnsTrue() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer?.isEqual(context, R.string.app_name, "UnitTestingAndroid")
        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceSameAsGivenString_returnsFalse() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer?.isEqual(context, R.string.app_name, "Hansel")
        assertThat(result).isFalse()
    }
}