package persistance;

import org.junit.Assert;
import org.junit.Test;
import eu.siacs.conversations.persistance.FileBackend;
import eu.siacs.conversations.services.XmppConnectionService;

public class FileBackendTest {
    private final XmppConnectionService service = new XmppConnectionService();
    private final FileBackend fileBackend = new FileBackend(service);
    private final String avatar = "avatar.png";
    private final String deleted_avatar = null;

    @Test
    public void deleteAndisAvatarCached() {

        Assert.assertTrue(fileBackend.isAvatarCached(avatar));

        fileBackend.delete(avatar);

        Assert.assertFalse(fileBackend.isAvatarCached(avatar));

    }

}