package net.piedevelopers.junitandretrofit;

import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.view.View;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = getInstrumentation().getTargetContext();
        assertEquals("net.piedevelopers.junitandretrofit", appContext.getPackageName());
    }

    @Rule
    public ActivityTestRule<MainActivity> rule=new ActivityTestRule(MainActivity.class);
    MainActivity mainActivity=null;
    Instrumentation.ActivityMonitor monitor=getInstrumentation().addMonitor(SecondActivity.class.getName(),null,false);


    @Before
    public  void setUp(){
        mainActivity=rule.getActivity();
    }
    @Test
    public void testlaunch(){

        View view=mainActivity.findViewById(R.id.helloworld);
        assertNotNull(view);
    }
    @Test
    public void onbuttonclick(){

        assertNotNull(mainActivity.findViewById(R.id.helloworldbutton));
        onView(withId(R.id.helloworldbutton)).perform(click());
   //     getInstrumentation().waitForMonitorWithTimeout(monitor,5000);

    }
    @After
    public  void teardown(){
        mainActivity=null;
    }

}