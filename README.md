# ntc-langdetect
ntc-langdetect is a library Language Detector using Apache OpenNLP  

## Maven
```Xml
<dependency>
    <groupId>com.streetcodevn</groupId>
    <artifactId>ntc-langdetect</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Quick start
```java
LangDetect ld = new LangDetect();
String s = "anh yêu em";
// Get the most probable language
Language bestLanguage = ld.langDetect(s);
System.out.println("bestLanguage: " + bestLanguage.toString());

// or

Language bestLanguage = ld.getLdME().predictLanguage(s);
System.out.println("bestLanguage: " + bestLanguage.toString());
```


## License
This code is under the [Apache License v2](https://www.apache.org/licenses/LICENSE-2.0).  
