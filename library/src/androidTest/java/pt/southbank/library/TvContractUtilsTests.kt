package pt.southbank.library

import android.support.test.InstrumentationRegistry
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import pt.southbank.library.model.Channel
import pt.southbank.library.model.InternalProviderData
import pt.southbank.library.utils.TvContractUtils

/**
 * carlosjpedro : 10/10/2017.
 */
@RunWith(AndroidJUnit4::class)
class TvContractUtilsTests {

    @Rule
    @JvmField
    val testActivityRule = ActivityTestRule<TestActivity>(TestActivity::class.java)

    @Test
    fun updateChannels() {
        val testActivity = testActivityRule.activity

        val internalProviderData = InternalProviderData()


        val channels = listOf(
                Channel.Builder()
                        .setOriginalNetworkId(11231)
                        .setDisplayName("Test Channel 12341")
                        .setDisplayNumber("11")
                        .setInternalProviderData(internalProviderData)
                        .setInputId("testInput")
                        .build()
        )

        TvContractUtils.updateChannels(testActivity, "testInput", channels)


        val fetchedChannels = TvContractUtils.getChannels(testActivity.contentResolver)
        Assert.assertEquals(1, fetchedChannels.size)
    }
}