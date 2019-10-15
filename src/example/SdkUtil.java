package example;

import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;

public final class SdkUtil {

    private static final String ACCESS_TOKEN = "xgFFLalTs7AAAAAAAAAAHwe0TM3oQBQz8gttcb8eBymhrjIsHdxf5jUn0ZSPMU84";
    private static final String TEST_CLIENT_IDENTIFIER = "test";

    private SdkUtil() {

    }

    public static DbxClientV2 createTestDbxClientV2() {
        DbxRequestConfig config = DbxRequestConfig.newBuilder(TEST_CLIENT_IDENTIFIER).build();
        return new DbxClientV2(config, ACCESS_TOKEN);
    }
}
