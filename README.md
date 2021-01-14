# ntc-langdetect
ntc-langdetect is a module Language Detector using Apache OpenNLP  

## Quick start
```bash
# Build
mvn package
or
mvn -Dmaven.test.skip=true package

# Start
./runservice start development

# Clean
mvn clean install
```

## Call API Language Detector
```bash
# Request
curl -X POST -i 'http://localhost:8787/ld/v1/post' \
  -H "Content-Type: application/json" \
  --data '{
    "s": "anh yêu em"
  }'

# Response ISO-639-3 language code
{"err":0,"msg":"Language detector successful","data":{"langCode":"vie"}}


# Request
curl -X POST -i 'http://localhost:8787/ld/v1/post' \
  -H "Content-Type: application/json" \
  --data '{
    "s": "i love you"
  }'

# Response
{"err":0,"msg":"Language detector successful","data":{"langCode":"eng"}}


# Request
curl -X POST -i 'http://localhost:8787/ld/v1/post' \
  -H "Content-Type: application/json" \
  --data '{
    "s": "わたしは、あなたを愛しています"
  }'

# Response
{"err":0,"msg":"Language detector successful","data":{"langCode":"jpn"}}


# Request
curl -X POST -i 'http://localhost:8787/ld/v1/post' \
  -H "Content-Type: application/json" \
  --data '{
    "s": "사랑해"
  }'

# Response
{"err":0,"msg":"Language detector successful","data":{"langCode":"kor"}}


# Request
curl -X POST -i 'http://localhost:8787/ld/v1/post' \
  -H "Content-Type: application/json" \
  --data '{
    "s": "ich liebe dich"
  }'

# Response
{"err":0,"msg":"Language detector successful","data":{"langCode":"deu"}}


# Request
curl -X POST -i 'http://localhost:8787/ld/v1/post' \
  -H "Content-Type: application/json" \
  --data '{
    "s": "Jeg elsker deg"
  }'

# Response
{"err":0,"msg":"Language detector successful","data":{"langCode":"nob"}}


# Request
curl -X POST -i 'http://localhost:8787/ld/v1/post' \
  -H "Content-Type: application/json" \
  --data '{
    "s": "Я тебя люблю"
  }'

# Response
{"err":0,"msg":"Language detector successful","data":{"langCode":"che"}}
```


## License
This code is under the [Apache License v2](https://www.apache.org/licenses/LICENSE-2.0).  
