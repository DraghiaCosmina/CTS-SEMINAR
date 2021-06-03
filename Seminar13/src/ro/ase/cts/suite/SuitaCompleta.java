package ro.ase.cts.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.test.GrupaTest;
import ro.ase.cts.test.GrupaTestSetUp;
import ro.ase.cts.test.GrupaTestWithDummy;
import ro.ase.cts.test.GrupaTestWithFake;
import ro.ase.cts.test.GrupaTestWithStub;

@RunWith(Suite.class)
@SuiteClasses({GrupaTest.class,GrupaTestSetUp.class,GrupaTestWithDummy.class,GrupaTestWithFake.class, GrupaTestWithStub.class})
public class SuitaCompleta {

}
