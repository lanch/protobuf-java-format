package unknown;

import com.google.protobuf.InvalidProtocolBufferException;
import com.googlecode.protobuf.format.JsonFormat;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Weiliang Shuai
 * @version 1.0
 */
public class UnknownTest {

    @Test
    public void testUnknownField() throws InvalidProtocolBufferException {
        byte[] bytes =
                More.Mo.newBuilder().setSite(More.Site.newBuilder().setName("site").setUrl("demo.com")).build().toByteArray();

       Assert.assertEquals("{\"3\": [\"\\n\\u0004site\\u0012\\bdemo.com\"]}", JsonFormat.printToString(Less.Le.newBuilder().mergeFrom(bytes).build()));
    }

}
