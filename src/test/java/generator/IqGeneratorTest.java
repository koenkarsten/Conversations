package generator;

import org.junit.Assert;
import org.junit.Test;
import eu.siacs.conversations.generator.IqGenerator;
import eu.siacs.conversations.services.XmppConnectionService;
import eu.siacs.conversations.xmpp.pep.Avatar;
import eu.siacs.conversations.xmpp.stanzas.IqPacket;

public class IqGeneratorTest {
    private final XmppConnectionService service = new XmppConnectionService();
    private final IqGenerator iqGenerator = new IqGenerator(service);
    private final Avatar avatar = null;

    @Test
    public void test_publishAvatarMetadata() {

        IqPacket result = iqGenerator.publishAvatarMetadata(avatar);
        Assert.assertNull(result.findChild("pubsub").findChild("publish").getChildren());

    }
}