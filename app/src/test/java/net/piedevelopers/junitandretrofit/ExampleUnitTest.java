package net.piedevelopers.junitandretrofit;

import junit.extensions.ActiveTestSuite;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
 public class ExampleUnitTest {


    @Test
    public  void  add()
    {
          MainActivity mainActivity=new MainActivity();
          assertEquals(6,mainActivity.addno(3,3));

    }
    @Test
    public void testlaunch()
    {

    }
}