package example;

import com.dropbox.core.DbxException;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.FileMetadata;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UploadFileExample {

    public static void main(String[] args) throws DbxException, IOException {
        DbxClientV2 client = SdkUtil.createTestDbxClientV2();

        InputStream in1 = new FileInputStream("test1.txt");
        InputStream in2 = new FileInputStream("test2.txt");
        InputStream in3 = new FileInputStream("test3.txt");

        FileMetadata metadata1 = client.files().uploadBuilder("/test1.txt")
                .uploadAndFinish(in1);
        FileMetadata metadata2 = client.files().uploadBuilder("/test2.txt")
                .uploadAndFinish(in2);
        FileMetadata metadata3 = client.files().uploadBuilder("/test3.txt")
                .uploadAndFinish(in3);

        System.out.println(metadata1);
        System.out.println(metadata2);
        System.out.println(metadata3);
    }
}
