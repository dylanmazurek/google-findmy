package j$.nio.file;

import j$.nio.file.attribute.O;
import j$.nio.file.attribute.P;
import java.nio.file.FileSystem;
import java.nio.file.PathMatcher;
import java.nio.file.WatchService;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

/* renamed from: j$.nio.file.h */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0025h extends FileSystem {
    public final /* synthetic */ AbstractC0026i a;

    private /* synthetic */ C0025h(AbstractC0026i abstractC0026i) {
        this.a = abstractC0026i;
    }

    public static /* synthetic */ FileSystem a(AbstractC0026i abstractC0026i) {
        if (abstractC0026i == null) {
            return null;
        }
        return abstractC0026i instanceof C0024g ? ((C0024g) abstractC0026i).a : new C0025h(abstractC0026i);
    }

    @Override // java.nio.file.FileSystem, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC0026i abstractC0026i = this.a;
        if (obj instanceof C0025h) {
            obj = ((C0025h) obj).a;
        }
        return abstractC0026i.equals(obj);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Iterable getFileStores() {
        return this.a.a();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ java.nio.file.Path getPath(String str, String[] strArr) {
        return u.k(this.a.b(str, strArr));
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ PathMatcher getPathMatcher(String str) {
        return B.a(this.a.c(str));
    }

    @Override // java.nio.file.FileSystem
    public final Iterable getRootDirectories() {
        return new y(this.a.d());
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ String getSeparator() {
        return this.a.e();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ UserPrincipalLookupService getUserPrincipalLookupService() {
        O f = this.a.f();
        int i = P.a;
        if (f == null) {
            return null;
        }
        return f.a;
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isReadOnly() {
        return this.a.g();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ WatchService newWatchService() {
        M h = this.a.h();
        if (h == null) {
            return null;
        }
        return h.a;
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ FileSystemProvider provider() {
        return j$.nio.file.spi.c.a(this.a.i());
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Set supportedFileAttributeViews() {
        return this.a.j();
    }
}
