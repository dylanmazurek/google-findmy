package j$.nio.file;

import j$.nio.file.attribute.O;
import java.nio.file.FileSystem;
import java.nio.file.PathMatcher;
import java.nio.file.WatchService;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

/* renamed from: j$.nio.file.g */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0024g extends AbstractC0026i {
    public final /* synthetic */ FileSystem a;

    private C0024g(FileSystem fileSystem) {
        this.a = fileSystem;
    }

    public static /* synthetic */ AbstractC0026i k(FileSystem fileSystem) {
        if (fileSystem == null) {
            return null;
        }
        return fileSystem instanceof C0025h ? ((C0025h) fileSystem).a : new C0024g(fileSystem);
    }

    @Override // j$.nio.file.AbstractC0026i
    public final /* synthetic */ Iterable a() {
        Iterable fileStores;
        fileStores = this.a.getFileStores();
        return fileStores;
    }

    @Override // j$.nio.file.AbstractC0026i
    public final /* synthetic */ Path b(String str, String[] strArr) {
        java.nio.file.Path path;
        path = this.a.getPath(str, strArr);
        return t.k(path);
    }

    @Override // j$.nio.file.AbstractC0026i
    public final /* synthetic */ C c(String str) {
        PathMatcher pathMatcher;
        pathMatcher = this.a.getPathMatcher(str);
        return A.b(pathMatcher);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.nio.file.AbstractC0026i
    public final Iterable d() {
        Iterable rootDirectories;
        rootDirectories = this.a.getRootDirectories();
        return new y(rootDirectories);
    }

    @Override // j$.nio.file.AbstractC0026i
    public final /* synthetic */ String e() {
        String separator;
        separator = this.a.getSeparator();
        return separator;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystem fileSystem = this.a;
        if (obj instanceof C0024g) {
            obj = ((C0024g) obj).a;
        }
        return fileSystem.equals(obj);
    }

    @Override // j$.nio.file.AbstractC0026i
    public final /* synthetic */ O f() {
        UserPrincipalLookupService userPrincipalLookupService;
        userPrincipalLookupService = this.a.getUserPrincipalLookupService();
        return O.a(userPrincipalLookupService);
    }

    @Override // j$.nio.file.AbstractC0026i
    public final /* synthetic */ boolean g() {
        boolean isReadOnly;
        isReadOnly = this.a.isReadOnly();
        return isReadOnly;
    }

    @Override // j$.nio.file.AbstractC0026i
    public final /* synthetic */ M h() {
        WatchService newWatchService;
        newWatchService = this.a.newWatchService();
        return M.a(newWatchService);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.AbstractC0026i
    public final /* synthetic */ j$.nio.file.spi.d i() {
        FileSystemProvider provider;
        provider = this.a.provider();
        return j$.nio.file.spi.b.B(provider);
    }

    @Override // j$.nio.file.AbstractC0026i
    public final /* synthetic */ boolean isOpen() {
        boolean isOpen;
        isOpen = this.a.isOpen();
        return isOpen;
    }

    @Override // j$.nio.file.AbstractC0026i
    public final /* synthetic */ Set j() {
        Set supportedFileAttributeViews;
        supportedFileAttributeViews = this.a.supportedFileAttributeViews();
        return supportedFileAttributeViews;
    }
}
