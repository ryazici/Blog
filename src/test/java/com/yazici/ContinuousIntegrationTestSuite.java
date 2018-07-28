package com.yazici;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.yazici.smoke.DatastoreSystemsHealthTest;

@RunWith(Suite.class)
@Suite.SuiteClasses ({ DatastoreSystemsHealthTest.class, 
	AddCategoryFeatureTestSuite.class })

public class ContinuousIntegrationTestSuite {

}
