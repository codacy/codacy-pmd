Since: PMD 6.25.0

Problem: Use of [FileItem.get()](https://commons.apache.org/proper/commons-fileupload/apidocs/org/apache/commons/fileupload/FileItem.html#get--)
and [FileItem.getString()](https://commons.apache.org/proper/commons-fileupload/apidocs/org/apache/commons/fileupload/FileItem.html#getString--)
could exhaust memory since they load the entire file into memory.

Solution: Use [FileItem.getInputStream()](https://commons.apache.org/proper/commons-fileupload/apidocs/org/apache/commons/fileupload/FileItem.html#getInputStream--)
and buffering.

Example(s):
```
import org.apache.commons.fileupload.FileItem;

public class FileStuff {
   private String bad(FileItem fileItem) {
        return fileItem.getString();
   }

   private InputStream good(FileItem fileItem) {
        return fileItem.getInputStream();
   }
}
```
