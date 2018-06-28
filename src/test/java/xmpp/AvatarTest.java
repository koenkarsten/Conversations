package xmpp;

import org.junit.Assert;
import org.junit.Test;
import eu.siacs.conversations.xml.Element;
import eu.siacs.conversations.xmpp.pep.Avatar;

public class AvatarTest {
    private final Element item = new Element("avatar");
    private final Avatar avatar = new Avatar();

    @Test
    public void test_isAvatarDisableRequest() {

        item.addChild("item");
        item.addChild("metadata");

        Assert.assertFalse(Avatar.isAvatarDisableRequest(item));

    }

}