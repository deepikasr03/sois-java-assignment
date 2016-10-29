File dir = new File("directoryName");
    String[] children = dir.list();
    if (children == null) {
        // Either dir does not exist or is not a directory
    } else {
        for (int i=0; i < children.length; i++) {
            // Get filename of file or directory
            String filename = children[i];
        }
    }

    // It is also possible to filter the list of returned files.
    // This example does not return any files that start with `.'.
    FilenameFilter filter = new FilenameFilter() {
        public boolean accept(File dir, String name) {
            return !name.startsWith(".");
        }
    };
    children = dir.list(filter);

    // The list of files can also be retrieved as File objects
    File[] files = dir.listFiles();

    // This filter only returns directories
    FileFilter fileFilter = new FileFilter() {
        public boolean accept(File file) {
            return file.isDirectory();
        }
    };
    files = dir.listFiles(fileFilter);
[/code]


15. Creating ZIP and JAR Files in Java

import java.util.zip.*;
import java.io.*;
public class ZipIt {
    public static void main(String args[]) throws IOException {
        if (args.length < 2) {
            System.err.println("usage: java ZipIt Zip.zip file1 file2 file3");
            System.exit(-1);
        }
        File zipFile = new File(args[0]);
        if (zipFile.exists()) {
            System.err.println("Zip file already exists, please try another");
            System.exit(-2);
        }
        FileOutputStream fos = new FileOutputStream(zipFile);
        ZipOutputStream zos = new ZipOutputStream(fos);
        int bytesRead;
        byte[] buffer = new byte[1024];
        CRC32 crc = new CRC32();
        for (int i=1, n=args.length; i < n; i++) {
            String name = args[i];
            File file = new File(name);
            if (!file.exists()) {
                System.err.println("Skipping: " + name);
                continue;
            }
            BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream(file));
            crc.reset();
            while ((bytesRead = bis.read(buffer)) != -1) {
                crc.update(buffer, 0, bytesRead);
            }
            bis.close();
            // Reset to beginning of input stream
            bis = new BufferedInputStream(
                new FileInputStream(file));
            ZipEntry entry = new ZipEntry(name);
            entry.setMethod(ZipEntry.STORED);
            entry.setCompressedSize(file.length());
            entry.setSize(file.length());
            entry.setCrc(crc.getValue());
            zos.putNextEntry(entry);
            while ((bytesRead = bis.read(buffer)) != -1) {
                zos.write(buffer, 0, bytesRead);
            }
            bis.close();
        }
        zos.close();
    }
}