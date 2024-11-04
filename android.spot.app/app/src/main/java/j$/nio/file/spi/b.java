package j$.nio.file.spi;

import j$.nio.file.AbstractC0026i;
import j$.nio.file.AbstractC0029l;
import j$.nio.file.C0020c;
import j$.nio.file.C0021d;
import j$.nio.file.C0024g;
import j$.nio.file.CopyOption;
import j$.nio.file.EnumC0002a;
import j$.nio.file.EnumC0030m;
import j$.nio.file.Path;
import j$.nio.file.attribute.C0009g;
import j$.nio.file.attribute.InterfaceC0011i;
import j$.nio.file.attribute.InterfaceC0018p;
import j$.nio.file.attribute.t;
import j$.nio.file.attribute.v;
import j$.nio.file.o;
import j$.nio.file.p;
import j$.nio.file.u;
import j$.nio.file.x;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessMode;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.OpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final /* synthetic */ class b extends d {
    public final /* synthetic */ FileSystemProvider b;

    private /* synthetic */ b(FileSystemProvider fileSystemProvider) {
        this.b = fileSystemProvider;
    }

    public static /* synthetic */ d B(FileSystemProvider fileSystemProvider) {
        if (fileSystemProvider == null) {
            return null;
        }
        return fileSystemProvider instanceof c ? ((c) fileSystemProvider).a : new b(fileSystemProvider);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void A(Path path, String str, Object obj, EnumC0030m[] enumC0030mArr) {
        this.b.setAttribute(u.k(path), str, AbstractC0029l.g(obj), AbstractC0029l.m(enumC0030mArr));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void a(Path path, EnumC0002a[] enumC0002aArr) {
        AccessMode accessMode;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path k = u.k(path);
        AccessMode[] accessModeArr = null;
        if (enumC0002aArr != null) {
            int length = enumC0002aArr.length;
            AccessMode[] accessModeArr2 = new AccessMode[length];
            for (int i = 0; i < length; i++) {
                EnumC0002a enumC0002a = enumC0002aArr[i];
                if (enumC0002a == null) {
                    accessMode = null;
                } else if (enumC0002a == EnumC0002a.READ) {
                    accessMode = AccessMode.READ;
                } else {
                    accessMode = enumC0002a == EnumC0002a.WRITE ? AccessMode.WRITE : AccessMode.EXECUTE;
                }
                accessModeArr2[i] = accessMode;
            }
            accessModeArr = accessModeArr2;
        }
        fileSystemProvider.checkAccess(k, accessModeArr);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void b(Path path, Path path2, CopyOption[] copyOptionArr) {
        java.nio.file.CopyOption[] copyOptionArr2;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path k = u.k(path);
        java.nio.file.Path k2 = u.k(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            java.nio.file.CopyOption[] copyOptionArr3 = new java.nio.file.CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr3[i] = C0020c.a(copyOptionArr[i]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        fileSystemProvider.copy(k, k2, copyOptionArr2);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void c(Path path, InterfaceC0018p[] interfaceC0018pArr) {
        this.b.createDirectory(u.k(path), j$.lang.a.f(interfaceC0018pArr));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void d(Path path, Path path2) {
        this.b.createLink(u.k(path), u.k(path2));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void e(Path path, Path path2, InterfaceC0018p[] interfaceC0018pArr) {
        this.b.createSymbolicLink(u.k(path), u.k(path2), j$.lang.a.f(interfaceC0018pArr));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystemProvider fileSystemProvider = this.b;
        if (obj instanceof b) {
            obj = ((b) obj).b;
        }
        return fileSystemProvider.equals(obj);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void f(Path path) {
        this.b.delete(u.k(path));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ boolean g(Path path) {
        boolean deleteIfExists;
        deleteIfExists = this.b.deleteIfExists(u.k(path));
        return deleteIfExists;
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ v h(Path path, Class cls, EnumC0030m[] enumC0030mArr) {
        FileAttributeView fileAttributeView;
        fileAttributeView = this.b.getFileAttributeView(u.k(path), AbstractC0029l.d(cls), AbstractC0029l.m(enumC0030mArr));
        return t.c(fileAttributeView);
    }

    public final /* synthetic */ int hashCode() {
        return this.b.hashCode();
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ C0021d i(Path path) {
        FileStore fileStore;
        fileStore = this.b.getFileStore(u.k(path));
        return C0021d.a(fileStore);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ AbstractC0026i j(URI uri) {
        FileSystem fileSystem;
        fileSystem = this.b.getFileSystem(uri);
        return C0024g.k(fileSystem);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ Path k(URI uri) {
        java.nio.file.Path path;
        path = this.b.getPath(uri);
        return j$.nio.file.t.k(path);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ String l() {
        String scheme;
        scheme = this.b.getScheme();
        return scheme;
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ boolean m(Path path) {
        boolean isHidden;
        isHidden = this.b.isHidden(u.k(path));
        return isHidden;
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ boolean n(Path path, Path path2) {
        boolean isSameFile;
        isSameFile = this.b.isSameFile(u.k(path), u.k(path2));
        return isSameFile;
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void o(Path path, Path path2, CopyOption[] copyOptionArr) {
        java.nio.file.CopyOption[] copyOptionArr2;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path k = u.k(path);
        java.nio.file.Path k2 = u.k(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            java.nio.file.CopyOption[] copyOptionArr3 = new java.nio.file.CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr3[i] = C0020c.a(copyOptionArr[i]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        fileSystemProvider.move(k, k2, copyOptionArr2);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ j$.nio.channels.a p(Path path, Set set, ExecutorService executorService, InterfaceC0018p[] interfaceC0018pArr) {
        AsynchronousFileChannel newAsynchronousFileChannel;
        newAsynchronousFileChannel = this.b.newAsynchronousFileChannel(u.k(path), AbstractC0029l.h(set), executorService, j$.lang.a.f(interfaceC0018pArr));
        return j$.nio.channels.a.a(newAsynchronousFileChannel);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ SeekableByteChannel q(Path path, Set set, InterfaceC0018p[] interfaceC0018pArr) {
        SeekableByteChannel newByteChannel;
        newByteChannel = this.b.newByteChannel(u.k(path), AbstractC0029l.h(set), j$.lang.a.f(interfaceC0018pArr));
        return newByteChannel;
    }

    @Override // j$.nio.file.spi.d
    public final DirectoryStream r(Path path, j$.nio.file.v vVar) {
        DirectoryStream newDirectoryStream;
        newDirectoryStream = this.b.newDirectoryStream(u.k(path), new j$.nio.file.v(vVar));
        return new x(newDirectoryStream);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ FileChannel s(Path path, Set set, InterfaceC0018p[] interfaceC0018pArr) {
        FileChannel newFileChannel;
        newFileChannel = this.b.newFileChannel(u.k(path), AbstractC0029l.h(set), j$.lang.a.f(interfaceC0018pArr));
        return newFileChannel;
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ AbstractC0026i t(Path path, Map map) {
        FileSystem newFileSystem;
        newFileSystem = this.b.newFileSystem(u.k(path), (Map<String, ?>) map);
        return C0024g.k(newFileSystem);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ AbstractC0026i u(URI uri, Map map) {
        FileSystem newFileSystem;
        newFileSystem = this.b.newFileSystem(uri, (Map<String, ?>) map);
        return C0024g.k(newFileSystem);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ InputStream v(Path path, p[] pVarArr) {
        OpenOption[] openOptionArr;
        InputStream newInputStream;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path k = u.k(path);
        if (pVarArr == null) {
            openOptionArr = null;
        } else {
            int length = pVarArr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr2[i] = o.a(pVarArr[i]);
            }
            openOptionArr = openOptionArr2;
        }
        newInputStream = fileSystemProvider.newInputStream(k, openOptionArr);
        return newInputStream;
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ OutputStream w(Path path, p[] pVarArr) {
        OpenOption[] openOptionArr;
        OutputStream newOutputStream;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path k = u.k(path);
        if (pVarArr == null) {
            openOptionArr = null;
        } else {
            int length = pVarArr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr2[i] = o.a(pVarArr[i]);
            }
            openOptionArr = openOptionArr2;
        }
        newOutputStream = fileSystemProvider.newOutputStream(k, openOptionArr);
        return newOutputStream;
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ InterfaceC0011i x(Path path, Class cls, EnumC0030m[] enumC0030mArr) {
        BasicFileAttributes readAttributes;
        readAttributes = this.b.readAttributes(u.k(path), (Class<BasicFileAttributes>) AbstractC0029l.e(cls), AbstractC0029l.m(enumC0030mArr));
        return C0009g.a(readAttributes);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ Map y(Path path, String str, EnumC0030m[] enumC0030mArr) {
        Map readAttributes;
        readAttributes = this.b.readAttributes(u.k(path), str, AbstractC0029l.m(enumC0030mArr));
        return AbstractC0029l.f(readAttributes);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ Path z(Path path) {
        java.nio.file.Path readSymbolicLink;
        readSymbolicLink = this.b.readSymbolicLink(u.k(path));
        return j$.nio.file.t.k(readSymbolicLink);
    }
}
