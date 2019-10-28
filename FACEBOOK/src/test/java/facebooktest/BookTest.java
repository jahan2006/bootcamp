package facebooktest;

import facebook.FacebookIn;
import org.testng.annotations.Test;

public class BookTest {
    FacebookIn facebookIn = new FacebookIn();

    @Test
    public void login() {
        facebookIn.sleepFor(5);
    }

    @Test
    public void search() {
        facebookIn.sleepFor(5);
    }

    @Test
    public void commend() {
        facebookIn.sleepFor(5);
    }

    @Test
    public void request() {
        facebookIn.sleepFor(5);
    }

    @Test
    public void friendrequst() {
        facebookIn.sleepFor(5);
    }

    @Test
    public void comment() {
        facebookIn.sleepFor(5);
    }

    @Test
    public void likepost() {
        facebookIn.sleepFor(5);
    }

    @Test
    public void upload() {
        facebookIn.sleepFor(5);
    }

    @Test
    public void readnews() {
        facebookIn.sleepFor(5);
    }
}