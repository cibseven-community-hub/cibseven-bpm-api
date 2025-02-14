# CIB seven Engine API

A small extract of the API layer from the greatest process engine ever.

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.cibseven.community.cibseven-api/cibseven-bpm-engine-api/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.cibseven.community.cibseven-api/cibseven-bpm-engine-api)

## What is this?

Sometimes for building libraries it is useful to have the API only, without the implementation. This library extracts the official Java CIB seven Engine API from CIB seven JAR and packages it as a small JAR. By doing so, we had to provide very few own classes, to cut the track to implementation. It is by **NO MEANS** a replacement, but just a bunch of classes which may be required on the classpath, if you use a library referencing CIB seven BPM classes (but not using them).

## Why do you need this

Imagine you are implementing a remote-communication library like CIB seven REST Client Spring Boot that implements the CIB seven Engine API by calling a remote process engine. Or you are building a library that wants to use different artifacts of the CIB seven API, without puting them on a compile 
dependency. Then - consider to use this lib...


Short facts:

| Original Library         | Size (mean)  | Dependencies  | API only                | Size (mean) | Dependencies |
| ------------------------ | -----------: | ------------: | ----------------------- | ----------: |-------------:|
| cibseven-engine          |    4,7 mb    |    20         | cibseven-bpm-engine-api |   225 kb    |            7 |
| cibseven-engine-dmn      |    144 kb    |     6         | cibseven-dmn-engine-api |    14 kb    |            3 |


## Quick Introduction

### Setup
If you just want to start using the library, put the following dependency into your project `pom.xml`:

```xml
<dependency>
  <groupId>org.cibseven.community.cibseven-api</groupId>
  <artifactId>cibseven-bpm-engine-api</artifactId>
  <version>7.22.0</version>
</dependency>
```

If you are interested in using the DMN engine API only, put the following dependency into your `pom.xml`:

```xml
<dependency>
    <groupId>org.cibseven.community.cibseven-api</groupId>
    <artifactId>cibseven-dmn-engine-api</artifactId>
    <version>7.22.0</version>
</dependency>
```


If you are using Gradle Kotlin DSL add to your `build.gradle.kts`:

```kotlin
implementation("org.cibseven.community.cibseven-api:cibseven-bpm-engine-api:7.22.0")
```

and for DMN only:

```kotlin
implementation("org.cibseven.community.cibseven-api:cibseven-dmn-engine-api:7.22.0")
```


For Gradle Groovy DSL add to your `build.gradle`:

```groovy
implementation 'org.cibseven.community.cibseven-api:cibseven-bpm-engine-api:7.22.0'
```

and for DMN only:

```groovy
implementation 'org.cibseven.community.cibseven-api:cibseven-bpm-engine-api:7.22.0'
```

Please note that the version of this library is tightly-coupled to the version of original CIB seven API.  

## Supported version

Used BPM engine:

| CIB seven BPM Version | CIB seven BPM API Version | 
|-----------------------|--------------------------:| 
| 1.1.0                 |                     1.1.0 |


Upstream:

io.holunda.data:camunda-bpm-api | org.cibseven.community.data:cibseven-bpm-api
--- | --- 
7.22.1 | 1.1.0

## License

This library is developed under [Apache License 2](./LICENSE).

## Maintainer

* [Simon Zambrovski](https://gihub.com/zambrovski)
* [Jan Galinski](https://gihub.com/jangalinski)
