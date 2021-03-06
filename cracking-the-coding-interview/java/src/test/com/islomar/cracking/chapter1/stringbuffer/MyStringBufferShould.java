package com.islomar.cracking.chapter1.stringbuffer;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@Test
public class MyStringBufferShould {

    public void beInitializedAsAnEmptyString() {
        MyStringBuffer sut = new MyStringBuffer();

        assertThat(sut.toString(), is(""));
    }

    public void generateAStringAfterAppendingOneString() {
        MyStringBuffer sut = new MyStringBuffer();

        sut.append("a");

        assertThat(sut.toString(), is("a"));
    }

    public void generateAStringAfterAppendingTwoStrings() {
        MyStringBuffer sut = new MyStringBuffer();

        sut.append("a");
        sut.append("b");

        assertThat(sut.toString(), is("ab"));
    }
}
