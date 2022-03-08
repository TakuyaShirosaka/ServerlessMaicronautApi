## ServerlessMaicronautApi
Micronaut(Java/Gradle) × GraalVM × Serverless Framework

required:
> Serverless Framework

native build & deploy:
>./gradlew buildNativeLambda && serverless deploy

example:
>curl --location --request GET 'https://XXXXXXXX.execute-api.ap-northeast-1.amazonaws.com/dev/'
>>{"name":"This is IT!!","isbn":"f038d1ec-9089-458d-9955-8d67add38a45"}

>curl --location --request POST 'https://XXXXXXXX.execute-api.ap-northeast-1.amazonaws.com/dev/food/'
>>{"name":"Super Food","price":50000}

>curl --location --request POST 'https://XXXXXXXX.execute-api.ap-northeast-1.amazonaws.com/dev/food/more'
>>{"name":"More Post Food","price":50000}

## Micronaut 3.3.4 Documentation

- [User Guide](https://docs.micronaut.io/3.3.4/guide/index.html)
- [API Reference](https://docs.micronaut.io/3.3.4/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/3.3.4/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

## Handler

[AWS Lambda Handler](https://docs.aws.amazon.com/lambda/latest/dg/java-handler.html)

Handler: io.micronaut.function.aws.proxy.MicronautLambdaHandler


- [Shadow Gradle Plugin](https://plugins.gradle.org/plugin/com.github.johnrengelman.shadow)
## Feature aws-lambda documentation

- [Micronaut AWS Lambda Function documentation](https://micronaut-projects.github.io/micronaut-aws/latest/guide/index.html#lambda)


