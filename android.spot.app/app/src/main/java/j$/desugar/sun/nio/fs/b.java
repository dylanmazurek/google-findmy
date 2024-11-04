package j$.desugar.sun.nio.fs;

import j$.nio.file.EnumC0002a;
import j$.nio.file.Path;
import j$.nio.file.attribute.B;
import j$.nio.file.attribute.InterfaceC0008f;
import j$.nio.file.attribute.InterfaceC0011i;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class b implements InterfaceC0008f {
    static final HashSet b;
    private final Path a;

    static {
        String[] strArr = {"size", "creationTime", "lastAccessTime", "lastModifiedTime", "fileKey", "isDirectory", "isRegularFile", "isSymbolicLink", "isOther"};
        int i = q.b;
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < 9; i2++) {
            hashSet.add(strArr[i2]);
        }
        b = hashSet;
    }

    public b(Path path) {
        this.a = path;
    }

    @Override // j$.nio.file.attribute.InterfaceC0008f
    public final void a(B b2, B b3, B b4) {
        if (b2 == null && b3 == null) {
            return;
        }
        Path path = this.a;
        path.getFileSystem().i().a(path, EnumC0002a.WRITE);
        if (path.toFile().setLastModified(b2.B(TimeUnit.MILLISECONDS))) {
        } else {
            throw new IOException("File.setLastModified did not succeed on ".concat(String.valueOf(path)));
        }
    }

    @Override // j$.nio.file.attribute.v
    public final String name() {
        return "basic";
    }

    @Override // j$.nio.file.attribute.InterfaceC0008f
    public final InterfaceC0011i readAttributes() {
        boolean z;
        boolean z2;
        File file;
        Path path = this.a;
        path.getFileSystem().i().a(path, new EnumC0002a[0]);
        File file2 = path.toFile();
        B q = B.q(file2.lastModified(), TimeUnit.MILLISECONDS);
        boolean isFile = file2.isFile();
        boolean isDirectory = file2.isDirectory();
        try {
            if (file2.getParent() == null) {
                file = file2;
            } else {
                file = new File(file2.getParentFile().getCanonicalFile(), file2.getName());
            }
            z = !file.getCanonicalFile().equals(file.getAbsoluteFile());
        } catch (IOException unused) {
            z = false;
        }
        if (!isFile && !isDirectory && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new c(q, q, q, isFile, isDirectory, z, z2, file2.length(), Integer.valueOf(file2.hashCode()));
    }
}
