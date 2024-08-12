Since: PMD 6.25.0

Problem: Use of [FileItem.get()](https://javadoc.io/static/commons-fileupload/commons-fileupload/1.5/org/apache/commons/fileupload/FileItem.html#get--)
and [FileItem.getString()](https://javadoc.io/static/commons-fileupload/commons-fileupload/1.5/org/apache/commons/fileupload/FileItem.html#getString--)
could exhaust memory since they load the entire file into memory.

Solution: Use [FileItem.getInputStream()](https://javadoc.io/static/commons-fileupload/commons-fileupload/1.5/org/apache/commons/fileupload/FileItem.html#getInputStream--)
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
