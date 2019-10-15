package example;

import com.dropbox.core.DbxException;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.users.FullAccount;

import java.io.IOException;

public class SimpleConnectionExample {

    public static void main(String[] args) throws DbxException, IOException {
        DbxClientV2 client = SdkUtil.createTestDbxClientV2();

        FullAccount account = client.users().getCurrentAccount();
        System.out.println(account.getName().getDisplayName());
    }
}

