package j$.nio.file;

import j$.util.AbstractC0118y;
import j$.util.List;
import j$.util.O;
import j$.util.Spliterators;
import java.io.File;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class u implements java.nio.file.Path {
    public final /* synthetic */ Path a;

    private /* synthetic */ u(Path path) {
        this.a = path;
    }

    public static /* synthetic */ java.nio.file.Path k(Path path) {
        if (path == null) {
            return null;
        }
        return path instanceof t ? ((t) path).a : new u(path);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.nio.file.Path path) {
        return this.a.compareTo(AbstractC0029l.c(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean endsWith(String str) {
        return this.a.endsWith(str);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean equals(Object obj) {
        Path path = this.a;
        if (obj instanceof u) {
            obj = ((u) obj).a;
        }
        return path.equals(obj);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(Consumer<? super java.nio.file.Path> consumer) {
        j$.lang.a.c(this.a, consumer);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getFileName() {
        return k(this.a.getFileName());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ FileSystem getFileSystem() {
        return C0025h.a(this.a.getFileSystem());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getName(int i) {
        return k(this.a.getName(i));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ int getNameCount() {
        return this.a.getNameCount();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getParent() {
        return k(this.a.getParent());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getRoot() {
        return k(this.a.getRoot());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean isAbsolute() {
        return this.a.isAbsolute();
    }

    @Override // java.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new z(this.a.iterator());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path normalize() {
        return k(this.a.normalize());
    }

    @Override // java.nio.file.Path, java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr) {
        K H = this.a.H(M.a(watchService), AbstractC0029l.l(kindArr));
        if (H == null) {
            return null;
        }
        return H.a;
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path relativize(java.nio.file.Path path) {
        return k(this.a.P(t.k(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolve(String str) {
        return k(this.a.resolve(str));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolveSibling(String str) {
        return k(this.a.resolveSibling(str));
    }

    @Override // java.lang.Iterable
    public final Spliterator<java.nio.file.Path> spliterator() {
        j$.util.Spliterator spliterator;
        Iterable iterable = this.a;
        if (iterable instanceof j$.lang.b) {
            spliterator = ((j$.lang.b) iterable).spliterator();
        } else if (iterable instanceof LinkedHashSet) {
            spliterator = Spliterators.spliterator((LinkedHashSet) iterable, 17);
        } else if (iterable instanceof SortedSet) {
            spliterator = AbstractC0118y.e((SortedSet) iterable);
        } else if (iterable instanceof Set) {
            spliterator = Spliterators.spliterator((Set) iterable, 1);
        } else if (iterable instanceof List) {
            spliterator = List.CC.$default$spliterator((java.util.List) iterable);
        } else {
            spliterator = iterable instanceof Collection ? Spliterators.spliterator((Collection) iterable, 0) : Spliterators.j(iterable.iterator());
        }
        return O.a(spliterator);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean startsWith(String str) {
        return this.a.startsWith(str);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path subpath(int i, int i2) {
        return k(this.a.subpath(i, i2));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path toAbsolutePath() {
        return k(this.a.toAbsolutePath());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ File toFile() {
        return this.a.toFile();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path toRealPath(LinkOption[] linkOptionArr) {
        return k(this.a.p(AbstractC0029l.k(linkOptionArr)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ String toString() {
        return this.a.toString();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ URI toUri() {
        return this.a.toUri();
    }

    @Override // java.nio.file.Path
    /* renamed from: compareTo */
    public final /* synthetic */ int compareTo2(java.nio.file.Path path) {
        return this.a.compareTo(t.k(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean endsWith(java.nio.file.Path path) {
        return this.a.C(t.k(path));
    }

    @Override // java.nio.file.Path, java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr, WatchEvent.Modifier[] modifierArr) {
        I[] iArr;
        Path path = this.a;
        M a = M.a(watchService);
        H[] l = AbstractC0029l.l(kindArr);
        if (modifierArr == null) {
            iArr = null;
        } else {
            int length = modifierArr.length;
            iArr = new I[length];
            for (int i = 0; i < length; i++) {
                iArr[i] = I.a(modifierArr[i]);
            }
        }
        K m = path.m(a, l, iArr);
        if (m == null) {
            return null;
        }
        return m.a;
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolve(java.nio.file.Path path) {
        return k(this.a.o(t.k(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolveSibling(java.nio.file.Path path) {
        return k(this.a.G(t.k(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean startsWith(java.nio.file.Path path) {
        return this.a.y(t.k(path));
    }
}
