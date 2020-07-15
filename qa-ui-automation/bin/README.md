##  UI Automation

Run the tests like this if you want to run all the scripts

```
mvn clean verify serenity:aggregate
```

The reports will be generated in `target/site/serenity`.

Run the tests like this if you want to run only the 'BETASMOKE' Tests

clean verify  -Dcucumber.options="--tags @BETASMOKE"

For example to run only the end to end tests use the following command This executed the tests as Maven

clean verify -Dcucumber.options="--tags @ENDTOEND"

The above tests could also be executed as Junit tests using the junit runner.
 
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
