package entities;

import org.junit.Test;
import eu.siacs.conversations.entities.Account;
import rocks.xmpp.addr.Jid;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class AccountTest {
    private final Jid jid = Jid.of("someJID");
    private final String password = "";
    private final String avatar = "new_avatar.png";
    private final Account account = new Account(jid, password);

    @Test
    public void removeAvatar() {

        // Set avatar, and check if it is set
        account.setAvatar(avatar);
        assertEquals(account.getAvatar(), avatar);

        // Remove avatar, and validate it is deleted
        account.removeAvatar();
        assertNull(account.getAvatar());

    }
}