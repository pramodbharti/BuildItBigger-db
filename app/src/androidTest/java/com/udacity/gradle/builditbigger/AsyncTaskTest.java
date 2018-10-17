package com.udacity.gradle.builditbigger;

import android.os.Handler;
import android.os.Looper;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static junit.framework.TestCase.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest {

    @Test
    public void notNullAsyncTask(){
        String result;
        EndPointsAsyncTask endPointsAsyncTask = new EndPointsAsyncTask();
        endPointsAsyncTask.execute();

        try {
            result = endPointsAsyncTask.get();
        } catch (InterruptedException | ExecutionException e){
            result = null;
        }

        final String finalResult = result;
        new Thread(new Runnable() {
            @Override
            public void run() {
                Looper.prepare();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        assertNotNull(finalResult);
                    }
                },1000);
            }
        }).run();
    }
}
