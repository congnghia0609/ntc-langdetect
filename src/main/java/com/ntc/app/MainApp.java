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

package com.ntc.app;

import com.ntc.langdetect.LangDetect;
import io.vertx.core.Launcher;
import opennlp.tools.langdetect.Language;

/**
 *
 * @author nghiatc
 * @since Jan 15, 2021
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // 1. Test
            LangDetect ld = new LangDetect();
            //String s = "anh yêu em"; // Vietnamese | bestLanguage: vie (0.013795926928726346)
            //String s = "i love you"; // English | bestLanguage: eng (0.012871108192121533)
            //String s = "わたしは、あなたを愛しています"; // Janpanese | bestLanguage: jpn (0.013529188314355168)
            //String s = "사랑해"; // Korean | bestLanguage: kor (0.010695602361328911)
            //String s = "ich liebe dich"; // Geaman | bestLanguage: deu (0.014547305267375082)
            //String s = "Jeg elsker deg"; // NaUy | bestLanguage: nob (0.016747988621281257)
            String s = "Я тебя люблю"; // Nga | bestLanguage: che (0.016200802253547433)
            Language bestLanguage = ld.getLdME().predictLanguage(s);
            System.out.println("bestLanguage: " + bestLanguage.toString());
            
            // 2. Start VertX Http Server
            //Launcher.executeCommand("run", "com.ntc.jvertx.MainVerticle");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
