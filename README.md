[![Codacy Badge](https://api.codacy.com/project/badge/grade/d0f04e048bba4a01a7ef0166bf5b8d32)](https://www.codacy.com/app/Codacy/codacy-pmdjava)
[![Build Status](https://circleci.com/gh/codacy/codacy-pmdjava.svg?style=shield&circle-token=:circle-token)](https://circleci.com/gh/codacy/codacy-pmdjava)

# Codacy PMDJava

This is the docker engine we use at Codacy to have [PMDJava](https://pmd.github.io/) support.
You can also create a docker to integrate the tool and language of your choice!
Check the **Docs** section for more information.

## Usage

You can create the docker by doing:

```
sbt docker:publishLocal
```

The docker is ran with the following command:

```
docker run -it -v $srcDir:/src  <DOCKER_NAME>:<DOCKER_VERSION>
```

## Docs

[Tool Developer Guide](https://support.codacy.com/hc/en-us/articles/207994725-Tool-Developer-Guide)

[Tool Developer Guide - Using Scala](https://support.codacy.com/hc/en-us/articles/207280379-Tool-Developer-Guide-Using-Scala)

## Test

We use the [codacy-plugins-test](https://github.com/codacy/codacy-plugins-test) to test our external tools integration.
You can follow the instructions there to make sure your tool is working as expected.
