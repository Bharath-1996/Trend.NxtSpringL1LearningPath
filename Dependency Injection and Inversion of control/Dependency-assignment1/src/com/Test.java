package com;

public class Test {
String testId;
String testName;
int testMarks;
public String getTestId() {
	return testId;
}
public void setTestId(String testId) {
	this.testId = testId;
}
public String getTestName() {
	return testName;
}
public void setTestName(String testName) {
	this.testName = testName;
}
public int getTestMarks() {
	return testMarks;
}
public void setTestMarks(int testMarks) {
	this.testMarks = testMarks;
}
@Override
public String toString() {
	return "TestId=" + testId + " TestName=" + testName + " TestMarks=" + testMarks ;
}


}
