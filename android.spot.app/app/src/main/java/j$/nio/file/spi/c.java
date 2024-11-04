package j$.nio.file.spi;

import j$.nio.file.AbstractC0022e;
import j$.nio.file.AbstractC0029l;
import j$.nio.file.C0019b;
import j$.nio.file.C0021d;
import j$.nio.file.C0025h;
import j$.nio.file.C0031n;
import j$.nio.file.EnumC0002a;
import j$.nio.file.attribute.C0010h;
import j$.nio.file.attribute.u;
import j$.nio.file.p;
import j$.nio.file.t;
import j$.nio.file.v;
import j$.nio.file.x;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessMode;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final /* synthetic */ class c extends FileSystemProvider {
    public final /* synthetic */ d a;

    private /* synthetic */ c(d dVar) {
        this.a = dVar;
    }

    public static /* synthetic */ FileSystemProvider a(d dVar) {
        if (dVar == null) {
            return null;
        }
        return dVar instanceof b ? ((b) dVar).b : new c(dVar);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void checkAccess(Path path, AccessMode[] accessModeArr) {
        AccessMode accessMode;
        AccessMode accessMode2;
        EnumC0002a enumC0002a;
        d dVar = this.a;
        j$.nio.file.Path k = t.k(path);
        EnumC0002a[] enumC0002aArr = null;
        if (accessModeArr != null) {
            int length = accessModeArr.length;
            EnumC0002a[] enumC0002aArr2 = new EnumC0002a[length];
            for (int i = 0; i < length; i++) {
                AccessMode accessMode3 = accessModeArr[i];
                if (accessMode3 != null) {
                    accessMode = AccessMode.READ;
                    if (accessMode3 != accessMode) {
                        accessMode2 = AccessMode.WRITE;
                        if (accessMode3 == accessMode2) {
                            enumC0002a = EnumC0002a.WRITE;
                        } else {
                            enumC0002a = EnumC0002a.EXECUTE;
                        }
                    } else {
                        enumC0002a = EnumC0002a.READ;
                    }
                } else {
                    enumC0002a = null;
                }
                enumC0002aArr2[i] = enumC0002a;
            }
            enumC0002aArr = enumC0002aArr2;
        }
        dVar.a(k, enumC0002aArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void copy(Path path, Path path2, CopyOption[] copyOptionArr) {
        j$.nio.file.CopyOption[] copyOptionArr2;
        d dVar = this.a;
        j$.nio.file.Path k = t.k(path);
        j$.nio.file.Path k2 = t.k(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            j$.nio.file.CopyOption[] copyOptionArr3 = new j$.nio.file.CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr3[i] = C0019b.a(copyOptionArr[i]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        dVar.b(k, k2, copyOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createDirectory(Path path, FileAttribute[] fileAttributeArr) {
        this.a.c(t.k(path), j$.lang.a.e(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createLink(Path path, Path path2) {
        this.a.d(t.k(path), t.k(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createSymbolicLink(Path path, Path path2, FileAttribute[] fileAttributeArr) {
        this.a.e(t.k(path), t.k(path2), j$.lang.a.e(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void delete(Path path) {
        this.a.f(t.k(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean deleteIfExists(Path path) {
        return this.a.g(t.k(path));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        d dVar = this.a;
        if (obj instanceof c) {
            obj = ((c) obj).a;
        }
        return dVar.equals(obj);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileAttributeView getFileAttributeView(Path path, Class cls, LinkOption[] linkOptionArr) {
        return u.a(this.a.h(t.k(path), AbstractC0029l.d(cls), AbstractC0029l.k(linkOptionArr)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileStore getFileStore(Path path) {
        C0021d i = this.a.i(t.k(path));
        int i2 = AbstractC0022e.a;
        if (i == null) {
            return null;
        }
        return i.a;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem getFileSystem(URI uri) {
        return C0025h.a(this.a.j(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path getPath(URI uri) {
        return j$.nio.file.u.k(this.a.k(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ String getScheme() {
        return this.a.l();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isHidden(Path path) {
        return this.a.m(t.k(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isSameFile(Path path, Path path2) {
        return this.a.n(t.k(path), t.k(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void move(Path path, Path path2, CopyOption[] copyOptionArr) {
        j$.nio.file.CopyOption[] copyOptionArr2;
        d dVar = this.a;
        j$.nio.file.Path k = t.k(path);
        j$.nio.file.Path k2 = t.k(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            j$.nio.file.CopyOption[] copyOptionArr3 = new j$.nio.file.CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr3[i] = C0019b.a(copyOptionArr[i]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        dVar.o(k, k2, copyOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ AsynchronousFileChannel newAsynchronousFileChannel(Path path, Set set, ExecutorService executorService, FileAttribute[] fileAttributeArr) {
        j$.nio.channels.a p = this.a.p(t.k(path), AbstractC0029l.h(set), executorService, j$.lang.a.e(fileAttributeArr));
        int i = j$.nio.channels.b.a;
        if (p == null) {
            return null;
        }
        return p.a;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ SeekableByteChannel newByteChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.a.q(t.k(path), AbstractC0029l.h(set), j$.lang.a.e(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final DirectoryStream newDirectoryStream(Path path, DirectoryStream.Filter filter) {
        return new x(this.a.r(t.k(path), new v(filter)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileChannel newFileChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.a.s(t.k(path), AbstractC0029l.h(set), j$.lang.a.e(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(URI uri, Map map) {
        return C0025h.a(this.a.u(uri, map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ InputStream newInputStream(Path path, OpenOption[] openOptionArr) {
        p[] pVarArr;
        d dVar = this.a;
        j$.nio.file.Path k = t.k(path);
        if (openOptionArr == null) {
            pVarArr = null;
        } else {
            int length = openOptionArr.length;
            p[] pVarArr2 = new p[length];
            for (int i = 0; i < length; i++) {
                pVarArr2[i] = C0031n.a(openOptionArr[i]);
            }
            pVarArr = pVarArr2;
        }
        return dVar.v(k, pVarArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ OutputStream newOutputStream(Path path, OpenOption[] openOptionArr) {
        p[] pVarArr;
        d dVar = this.a;
        j$.nio.file.Path k = t.k(path);
        if (openOptionArr == null) {
            pVarArr = null;
        } else {
            int length = openOptionArr.length;
            p[] pVarArr2 = new p[length];
            for (int i = 0; i < length; i++) {
                pVarArr2[i] = C0031n.a(openOptionArr[i]);
            }
            pVarArr = pVarArr2;
        }
        return dVar.w(k, pVarArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ BasicFileAttributes readAttributes(Path path, Class cls, LinkOption[] linkOptionArr) {
        return C0010h.a(this.a.x(t.k(path), AbstractC0029l.e(cls), AbstractC0029l.k(linkOptionArr)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path readSymbolicLink(Path path) {
        return j$.nio.file.u.k(this.a.z(t.k(path)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void setAttribute(Path path, String str, Object obj, LinkOption[] linkOptionArr) {
        this.a.A(t.k(path), str, AbstractC0029l.g(obj), AbstractC0029l.k(linkOptionArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(Path path, Map map) {
        return C0025h.a(this.a.t(t.k(path), map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Map readAttributes(Path path, String str, LinkOption[] linkOptionArr) {
        return AbstractC0029l.f(this.a.y(t.k(path), str, AbstractC0029l.k(linkOptionArr)));
    }
}
