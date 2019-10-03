package retryanalyzer.retrylogic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class retrylogic {
@Test
public void retry1() {
	Assert.assertEquals(false, true);
}
@Test
public void retry2() {
	Assert.assertEquals(false, true);
}

}
