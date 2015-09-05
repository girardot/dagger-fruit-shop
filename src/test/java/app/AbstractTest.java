package app;

import dagger.ObjectGraph;
import org.junit.Before;

public class AbstractTest {

    @Before
    public void setUp() {
        ObjectGraph.create(new TestModule()).inject(this);
    }

}
