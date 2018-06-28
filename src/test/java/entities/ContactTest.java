package entities;

import org.junit.Test;
import eu.siacs.conversations.entities.Contact;
import eu.siacs.conversations.xmpp.pep.Avatar;
import rocks.xmpp.addr.Jid;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ContactTest {
    private final Jid jid = Jid.of("someJID");
    private final Avatar avatar = new Avatar();
    private final Contact contact = new Contact(jid);

    @Test
    public void test_removeAvatar() {

        // Set avatar, and check if it is set
        contact.setAvatar(avatar);
        assertEquals(contact.getAvatar(), avatar.getFilename());

        // Remove avatar, and validate it is deleted
        contact.removeAvatar();
        assertNull(contact.getAvatar());

    }
}