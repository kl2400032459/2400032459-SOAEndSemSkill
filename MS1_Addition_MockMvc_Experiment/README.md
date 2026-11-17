# MS1 Addition MockMvc Experiment

## Requirement
- JDK 17 or later
- STS 4 / Eclipse with Maven support

## Import into STS 4 / Eclipse
1. Extract `MS1_Addition_MockMvc_Experiment.zip`.
2. Open STS 4 / Eclipse.
3. Select **File → Import → Maven → Existing Maven Projects**.
4. Browse to the extracted `MS1_Addition_MockMvc_Experiment` folder.
5. Select the project and click **Finish**.
6. If dependencies do not load, right-click the project → **Maven → Update Project**.

## Run the JUnit test
1. Expand `src/test/java`.
2. Open `Ms1ControllerTest.java`.
3. Right-click the file → **Run As → JUnit Test**.
4. Confirm the JUnit view shows a green bar and **1/1 tests passed**.

The test sends:
`GET /ms1/add?a=-5&b=5`

Expected:
- HTTP status: `200 OK`
- Plain text body: `MS1.1-Additions =0`

You can also run it from the project folder with:
`mvn test`
