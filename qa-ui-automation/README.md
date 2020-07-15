# UI Automation Suite

-> Project description goes here

## Getting Started


### Mac:
1. Install java: http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
2. Install maven: https://maven.apache.org/install.html

```
#!/bin/sh
VERSION=3.5.0
curl -O http://mirrors.koehn.com/apache/maven/maven-3/$VERSION/binaries/apache-maven-$VERSION-bin.zip
```

## Running the tests

### Modifying environment configuration

For local testing, you can add your config to [serenity.properties](serenity.properties)

When you need this config to apply to Jenkins and Docker:

Specific environment configuration is stored in *./serenity-configs/*
```
serenity-configs/
├── browserstack_webdriver.conf
├── environment_urls.conf
└── general_settings.conf
```
When adding a new environment, simply add the URL to the list in environment_urls.
If you need to add a new driver, add it to the folder keeping the format and filename (`drivername_webdriver.conf`), and add it to the python script. You can ask @goperez if you're unsure how add this to the python code.

general_settings will be applied to **all** config files. Add common serenity parameters in here.

When you want to test the serenity.properties that Jenkins will use:

_Config file for a specific env:_

 `python .build/run_tests --config-only --env {env_name}`

Ex:
`python .build/run_tests --config-only --env int --driver browserstack` -> Will create a serenity.properties file to run tests against the integration environment using BrowserStack.

### Maven command line to run the tests
Wether you are in your laptop or a container, run the tests like this if you want to run all the scripts: `mvn clean verify serenity:aggregate`
The reports will be generated in `target/site/serenity`, or the corresponding docker container volume map (see next point in this README)

Run the tests like this if you want to run only the 'BETASMOKE' Tests

mvn clean verify  -Dcucumber.options="--tags @BETASMOKE"

### Run tests using Docker
This is what our Jenkins jobs use to run this tests, if your Jenkins job is failing, try to run this locally. From this project's root directory run:
docker build -t qa-ui-automation .
docker run -it -u root -v $HOME/target:/qa-ui-automation/target  ssartisan/qa-ui-automation /bin/bash
Arguments explained:
  -it: open interactive shell
  -v: mount a volume for the selenium reports. Make sure you use a folder you have access to in your own $HOME
After that you should get a shell inside the docker conatiner with all the code from the repo in there. Now you can run Maven and any other command inside the container.
Example:
```
~$ docker run -it -v $HOME/target:/qa-ui-automation/target  ssartisan/qa-ui-automation /bin/bash
~$ .build/run_tests --driver browserstack --env dev --tag "LPSEARCH, LPASSESSMENTS"
Running:  mvn verify -Dcucumber.options=" --tags @LPSEARCH, LPASSESSMENTS"
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building PalomarUIAutomation 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
...
```

### Using the Python script Jenkins triggers directly
*python .build/run_tests*

This script will create a configuration file and run the tests given some optional parameters. Check accepted parameters running:

`python .build/run_tests --help`

### Run tests manually (or using Eclipse)

The code is run using:
`mvn clean verify -Dcucumber.options="{options}"`

Ex: `mvn clean verify serenity:aggregate` -> Run all tests

Ask [vhnehru](https://github.skillsoft.com/vhnehru) if you have questions regarding how to set this setup in Eclipse.



## Contributing

ToDo

## Maintainers

* **Vignesh Neru** - *Initial work* - [vhnehru](https://github.skillsoft.com/vhnehru)

See also the list of [contributors](https://github.skillsoft.com/paris-squad/qa-ui-automation/contributors) who participate in this project.

## Continuous integration (Jenkins)

ToDo

### Scheduling target

1. `--tags @ENDTOEND`
Twice a day against DEV. (front develop)
Once a day in QA? (front develop)
Once a week INT (Wednesday night EST)

2. `--tags LPSEARCH, LPASSESSMENTS, LPFEATURESET2, LPCONTENTBROWSE, LPGOALS, LPHOMEPAGE, LPCOMPLETIONSTATUS, LPUSERAUTHENTICATION, LPFEATURESET1, LPCERTIFICATION, LPBOOKROYALTY, RASREPORTS, STAGING, USERMANAGEMENT, AUDIENCEMANAGEMENT, GOALSMANAGEMENT, LPMANAGMENT` --
Once day in DEV.

3. Check-in code: @ENDTOEND in DEV. (normally once a day)

4. Tag QA automation developers PR check (run against develop env): @ENDTOEND (6-10 min)


## Current Tags and what they do
**@SINGLE**
Cick [here](src/test/resources/features/legacy/8_singletest.feature) to see the code

**@ENDTOEND**
Cick [here](src/test/resources/features/EndtoEndSmokeTestSuite/2_LPLearnerInitialExperience.feature) and  [here](src/test/resources/features/EndtoEndSmokeTestSuite/4_UCMRoleStatusUpdate.feature) and [here](src/test/resources/features/EndtoEndSmokeTestSuite/1_UCMAdminExperience.feature) to see the code

**@LPSEARCH**
Cick [here](src/test/resources/features/LPRegressionSuite/10_LPSearch.feature) to see the code

**@LPASSESSMENTS**
Cick [here](src/test/resources/features/LPRegressionSuite/13_LPAssesements.feature) to see the code

**@LPFEATURESET2**
Cick [here](src/test/resources/features/LPRegressionSuite/14_LPFeatureSet2.feature) to see the code

**@LPCONTENTBROWSE**
Cick [here](src/test/resources/features/LPRegressionSuite/11_ContentBrowse.feature) to see the code

**@LPGOALS**
Cick [here](src/test/resources/features/LPRegressionSuite/12_LPGoals.feature) to see the code

**@LPHOMEPAGE**
Cick [here](src/test/resources/features/LPRegressionSuite/9_LPHomePage.feature) to see the code

**@LPCOMPLETIONSTATUS**
Cick [here](src/test/resources/features/LPRegressionSuite/17_LPCompletionStatus.feature) to see the code

**@LPUSERAUTHENTICATION**
Cick [here](src/test/resources/features/LPRegressionSuite/21_LPUserAuthentication.feature) to see the code

**@LPFEATURESET1**
Cick [here](src/test/resources/features/LPRegressionSuite/22_LPFeatureSet1.feature) to see the code

**@LPCERTIFICATION**
Cick [here](src/test/resources/features/LPRegressionSuite/25_LPCertifications.feature) to see the code

**@LPBOOKROYALTY**
Cick [here](src/test/resources/features/LPRoyalty/LPRoyalty.feature) to see the code

**@RASREPORTS**
Cick [here](src/test/resources/features/RASRegressionSuite/RASPagination.feature) to see the code

**@STAGING**
Cick [here](src/test/resources/features/Stage/UCMStaging.feature) to see the code

**@USERMANAGEMENT**
Cick [here](src/test/resources/features/UCMRegressionSuite/5_UserManagement.feature) to see the code

**@AUDIENCEMANAGEMENT**
Cick [here](src/test/resources/features/UCMRegressionSuite/6_AudienceManagement.feature) to see the code

**@GOALSMANAGEMENT**
Cick [here](src/test/resources/features/UCMRegressionSuite/7_AssignmentManagement.feature) to see the code

**@LPMANAGMENT**
Cick [here](src/test/resources/features/UCMRegressionSuite/8_LicenseManagement.feature) to see the code

**@COMPLIANCE**
Cick [here](src/test/resources/features/UCMRegressionSuite/26_Compliance.feature) to see the code


