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
import java.io.InputStream;
import opennlp.tools.langdetect.Language;
import opennlp.tools.langdetect.LanguageDetectorME;
import opennlp.tools.langdetect.LanguageDetectorModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author nghiatc
 * @since Jan 15, 2021
 */
public class LangDetect {
    private static final Logger log = LoggerFactory.getLogger(LangDetect.class);
    private String pathModelLD = "models/ld/langdetect-183.bin";
    private LanguageDetectorME ldME;

    public LangDetect() throws IOException {
        // Load model
        InputStream isModel = getResourceAsStream(pathModelLD);
        LanguageDetectorModel ldModel = new LanguageDetectorModel(isModel);
        ldME = new LanguageDetectorME(ldModel);
    }

    public LangDetect(String pathModel) throws IOException {
        if (pathModel == null || pathModel.isEmpty()) {
            throw new ExceptionInInitializerError("Path model is NULL or empty.");
        }
        this.pathModelLD = pathModel;
        // Load model
        InputStream isModel = getResourceAsStream(pathModelLD);
        LanguageDetectorModel ldModel = new LanguageDetectorModel(isModel);
        ldME = new LanguageDetectorME(ldModel);
    }

    public String getPathModelLD() {
        return pathModelLD;
    }

    public LanguageDetectorME getLdME() {
        return ldME;
    }
    
    public InputStream getResourceAsStream(String name) {
        InputStream in = null;
        ClassLoader loader = getClass().getClassLoader();
        if (loader != null) {
            in = loader.getResourceAsStream(name);
        } else {
            in = ClassLoader.getSystemResourceAsStream(name);
        }
        return in;
    }
    
    public Language langDetect(String s) {
        return ldME.predictLanguage(s);
    }
}
