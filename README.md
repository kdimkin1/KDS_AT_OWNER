# Automation Tests (OWNER lib with Provider, Config configurations examples)

## Technology Stack
| <a href="https://www.jetbrains.com/idea/"><img src="https://starchenkov.pro/qa-guru/img/skills/Intelij_IDEA.svg" width="40" height="40"  alt="IDEA"/></a> | <a href="https://www.jetbrains.com/idea/"><img src="https://starchenkov.pro/qa-guru/img/skills/Java.svg" width="40" height="40"  alt="Java"/></a> |<a href="https://www.jetbrains.com/idea/"><img src="https://starchenkov.pro/qa-guru/img/skills/JUnit5.svg" width="40" height="40"  alt="JUnit 5"/></a> | <a href="https://www.jetbrains.com/idea/"><img src="https://starchenkov.pro/qa-guru/img/skills/Gradle.svg" width="40" height="40"  alt="Gradle"/></a> |<a href="https://www.jetbrains.com/idea/"><img src="https://starchenkov.pro/qa-guru/img/skills/Selenide.svg" width="40" height="40"  alt="Selenide"/></a> | <a href="https://www.jetbrains.com/idea/"><img src="https://starchenkov.pro/qa-guru/img/skills/Allure_Report.svg" width="40" height="40"  alt="Allure"/></a> |
|:---------------------------------------------------------------------------------------------------------------------------------------------------------:| :---------: | :---------: | :---------: | :---------: |:-------------------------------------------------------------------------------------------------------------------------------------------------------:|
|                                                                           IDEA                                                                            | Java | Junit5 | Gradle | Selenide |                                                                         Allure                                                                          |
See details:  
```bash
Run configuration:
1.API:
gradle clean api_run 

2.WEB:
2.1 local run:
gradle clean web_run -Drun-type=local
2.2. remote run:
gradle clean web_run -Drun-type=remote

```

More info:
```bash
Owner 
https://mvnrepository.com/artifact/org.aeonbits.owner/owner 
https://owner.aeonbits.org/ -- description

assertj
https://mvnrepository.com/artifact/org.assertj/assertj-core

Usage steps for realisation:
1) build.gradle
1.1)
systemProperties(System.getProperties())
1.2)
'org.aeonbits.owner:owner:1.0.12',

2) creates  "Provider" and "Config" (with annatations @Key, @DefaultValue )
```
