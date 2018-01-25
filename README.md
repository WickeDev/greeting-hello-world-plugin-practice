## Greeting Gradle Plugin

```
buildscript {
    repositories {
        maven {
            url 'https://github.com/wickedev/greeting-hello-world-plugin-practice/raw/master/maven-repo'
        }
    }
    dependencies {        
        classpath "net.codesanctum.greeting:plugin:0.1.0"
    }
}

apply plugin: 'greeting'
```

```
./gradlew hello
```