import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class StreamReader {
    public static void main(String[] args) throws IOException {
        // Read file from disk location
        File dir = new File("<location>");
        File[] files = dir.listFiles();
        if (files != null && files.length == 0) {
            System.out.println("There are no files in this folder");
            return;
        }
        assert files != null;
        for (File file: files) {
            if (file.getName().contains(".DS_Store")) {
                continue;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bytes = fileInputStream.readAllBytes();
            String orderInfo = new String(bytes);
            System.out.println("FileInfo: "+orderInfo);
        }
    }
}
