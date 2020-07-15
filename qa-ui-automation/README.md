# Web UI Automation Suite

-> Project description goes here

## Getting Started


### Mac:
1. Install java: http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
2. Install maven: https://maven.apache.org/install.html
3. Install Git for Mac https://git-scm.com/download/mac 
4. Homebrew installation for Mac via terminal https://brew.sh/

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
├── browserstack_webdriver.conf -future if required
├── environment_urls.conf
└── general_settings.conf
```
When adding a new environment, simply add the URL to the list in environment_urls.
If you need to add a new driver, add it to the folder keeping the format and filename (`drivername_webdriver.conf`), and add it to the python script. You can ask @goperez if you're unsure how add this to the python code.

general_settings will be applied to **all** config files. Add common serenity parameters in here.

When you want to test the serenity.properties that Jenkins will use:


### Maven command line to run the tests
Wether you are in your laptop or a container, run the tests like this if you want to run all the scripts: `mvn clean verify serenity:aggregate`
The reports will be generated in `target/site/serenity`
Run the tests like this 

clean verify -Dcucumber.options="--tags @FOBSMOKETESTSUITE”


### Run tests manually (or using Eclipse)

The code is run using:
`clean verify -Dcucumber.options="--tags @FOBSMOKETESTSUITE”



Ask vignesh nehru(nvignesh1234 - git member) if you have questions regarding how to set this setup in Eclipse.



## Contributing

ToDo

## Maintainers

#any one like to contribute to repo your ready to go :)

* **Vignesh Neru** - *Initial work* 

## Continuous integration (Jenkins)

ToDo

### Scheduling planned target for jenkins 

1. `--tags @FOBSMOKETESTSUITE`

Daily 

4. Tag QA automation developers PR check .(Dont commit to master branch directly - Create your own branch and submit for approval)


## Current Tags and what they do
**@SINGLE**
Cick [here](qa-ui-automation/src/test/resources/features/StagingSmokeSuite/singletest.feature) to see the code

**@FOBSMOKETESTSUITE**
Cick [here](qa-ui-automation/src/test/resources/features/StagingSmokeSuite/FOBOrderDashBoard.feature) to see the code


