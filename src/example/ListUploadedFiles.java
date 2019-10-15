package example;

import com.dropbox.core.DbxException;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.ListFolderResult;
import com.dropbox.core.v2.files.Metadata;

import java.io.IOException;

public class ListUploadedFiles {

    public static void main(String[] args) throws DbxException, IOException {
        DbxClientV2 client = SdkUtil.createTestDbxClientV2();

        ListFolderResult result = client.files().listFolder("");
        for (Metadata metadata : result.getEntries()) {
            System.out.println(metadata.getPathLower());
        }
    }
}
