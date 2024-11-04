package j$.adapter;

import android.os.StrictMode;
import j$.nio.file.spi.d;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.spi.FileSystemProvider;

/* loaded from: classes2.dex */
public abstract class c {
    private static final d a;

    static {
        d a2;
        FileSystem fileSystem;
        FileSystemProvider provider;
        if (a.b) {
            fileSystem = FileSystems.getDefault();
            provider = fileSystem.provider();
            a2 = j$.nio.file.spi.b.B(provider);
        } else {
            if (a.c) {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(StrictMode.getThreadPolicy()).permitDiskReads().build());
            }
            a2 = j$.desugar.sun.nio.fs.d.a();
        }
        a = a2;
        a2.j(URI.create("file:///"));
    }

    public static d a() {
        return a;
    }
}
