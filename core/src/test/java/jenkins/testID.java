package jenkins;
import jenkins.model.IdStrategy;
import org.junit.Test;

import static groovy.util.GroovyTestCase.assertEquals;

public class testID {

    @Test
    public void testIdStrategyBasic() {
        IdStrategy.CaseSensitive id = new IdStrategy.CaseSensitive();
        assertEquals(id.idFromFilename("test"),"test");
    }

    @Test
    public void testIdStrategySquiggle() {
        IdStrategy.CaseSensitive id = new IdStrategy.CaseSensitive();
        assertEquals(id.idFromFilename("te~st"),"teSt");
    }

    @Test
    public void testIdStrategySpecial() {
        IdStrategy.CaseSensitive id = new IdStrategy.CaseSensitive();
        assertEquals(id.idFromFilename("test@"),"test@");
    }

    @Test
    public void testIdStrategyNumber() {
        IdStrategy.CaseSensitive id = new IdStrategy.CaseSensitive();
        assertEquals(id.idFromFilename("test1"),"test1");
    }
}
