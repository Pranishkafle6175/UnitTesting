package com.example.testing

import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test


class ComponentTest{
    private lateinit var component:Component


    //This function below the Before tag i.e setup runs every time for evry test cases
    @Before
    fun setup(){
        component= Component()
    }

    @Test
    fun resIdEqualsGivenString_returnsTrue(){
        val context= ApplicationProvider.getApplicationContext<android.content.Context>()
        val result = component.check(context,R.string.app_name,"Testing")

        assertThat(result).isTrue()
    }
}