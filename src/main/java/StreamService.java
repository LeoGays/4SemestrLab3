import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class StreamService {

    public static byte[] writeToBinaryStream(final int [] arr) {

        byte[] arrByte;

        try(ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            for (int i = 0; i < arr.length; i++){
                baos.write(arr[i]);
                arrByte = baos.toByteArray();
                return arrByte;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return null;
        }
    }

    public static int[] readToBinaryStream(final byte[] arr) {

    }

}
