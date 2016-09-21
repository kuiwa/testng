package mje;

import org.testng.annotations.Test;

import com.ericsson.commonlibrary.resourcemanager.Rbs;
import com.ericsson.commonlibrary.resourcemanager.Rm;
import com.ericsson.commonlibrary.resourcemanager.interfaces.RestartRank;
import com.ericsson.msran.actions.api.NodeId;
import com.ericsson.msran.g2.testhelpers.domain.RbsTestBaseSystemConcreteDomain;
import com.ericsson.msran.g2.testhelpers.mo.RbsTestBaseRbs;
import com.ericsson.msran.helpers.Helpers;
import com.ericsson.msran.jcat.TestBase;

public class MjeTest extends TestBase{

    private Rbs rbs = Rm.getG2RbsList().get(0);


    @Test(enabled=false)
    public void testRM() {
        rbs = Rm.getG2RbsList().get(0);
    }

    @Test(enabled=false)
    public void testAction() {
        Helpers.util().skipHelper().skipIfTrue("No RBS in STP", Rm.getRbsList().isEmpty());
        actions().cliSendMoshellCommand().byNodeId(NodeId.forResource(rbs)).commands("version").perform();
    }

    @Test(enabled=true)
    public void testHelpers() {
        System.out.println(Helpers.time().nodeTimeHelper(rbs).getNodeTime().toString());
    }

    @Test(enabled=false)
    public void testRbsTeestBase() {
        RestartRank restartRank = RestartRank.COLD;
        for (RbsTestBaseRbs rbs : RbsTestBaseSystemConcreteDomain.getAllRbs()) {
            rbs.restartNoWait(restartRank);
        }
    }

//    @Test(enabled=true)
//    public void testCommonLibrary() {
//        com.ericsson.commonlibrary.moshell.Moshell.send("");
//    }
}

