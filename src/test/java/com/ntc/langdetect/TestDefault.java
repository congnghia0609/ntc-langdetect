/*
 * Copyright 2021 nghiatc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ntc.langdetect;

import java.io.IOException;
import opennlp.tools.langdetect.Language;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author nghiatc
 * @since May 25, 2021
 *
 * cd ntc-langdetect
 *
 * # Run all the unit test classes. 
 * mvn test
 *
 * # Run a single test class. 
 * mvn -Dtest=TestApp1 test
 *
 * # Run a single test method from a test class. 
 * mvn -Dtest=TestApp1#methodname test
 */
public class TestDefault {

    private static LangDetect ld;

    @BeforeClass
    public static void initTestDefault() throws IOException {
        ld = new LangDetect();
    }

    @Before
    public void beforeEachTest() {
        //System.out.println("This is executed before each Test");
    }

    @After
    public void afterEachTest() {
        //System.out.println("This is executed after each Test");
    }

    @Test
    public void testVie() {
        String s = "anh yêu em";
        Language bestLanguage = ld.langDetect(s);
        Assert.assertEquals("Language Vie", "vie", bestLanguage.getLang());
    }

    @Test
    public void testEng() {
        String s = "i love you";
        Language bestLanguage = ld.langDetect(s);
        Assert.assertEquals("Language Eng", "eng", bestLanguage.getLang());
    }

    @Test
    public void testJpn() {
        String s = "わたしは、あなたを愛しています";
        Language bestLanguage = ld.langDetect(s);
        Assert.assertEquals("Language Jpn", "jpn", bestLanguage.getLang());
    }

    @Test
    public void testKor() {
        String s = "사랑해";
        Language bestLanguage = ld.langDetect(s);
        Assert.assertEquals("Language Kor", "kor", bestLanguage.getLang());
    }

    @Test
    public void testDeu() {
        String s = "ich liebe dich";
        Language bestLanguage = ld.langDetect(s);
        Assert.assertEquals("Language Deu", "deu", bestLanguage.getLang());
    }

    @Test
    public void testNob() {
        String s = "Jeg elsker deg";
        Language bestLanguage = ld.langDetect(s);
        Assert.assertEquals("Language Nob", "nob", bestLanguage.getLang());
    }

    @Test
    public void testChe() {
        String s = "Я тебя люблю";
        Language bestLanguage = ld.langDetect(s);
        Assert.assertEquals("Language Che", "che", bestLanguage.getLang());
    }
}
