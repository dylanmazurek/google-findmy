package j$.nio.file;

import java.nio.file.FileStore;

/* renamed from: j$.nio.file.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0021d {
    public final /* synthetic */ FileStore a;

    private C0021d(FileStore fileStore) {
        this.a = fileStore;
    }

    public static /* synthetic */ C0021d a(FileStore fileStore) {
        if (fileStore == null) {
            return null;
        }
        return new C0021d(fileStore);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileStore fileStore = this.a;
        if (obj instanceof C0021d) {
            obj = ((C0021d) obj).a;
        }
        return fileStore.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
