package j$.nio.file;

import java.io.Closeable;
import java.nio.file.WatchService;

/* loaded from: classes2.dex */
public final /* synthetic */ class M implements Closeable {
    public final /* synthetic */ WatchService a;

    private /* synthetic */ M(WatchService watchService) {
        this.a = watchService;
    }

    public static /* synthetic */ M a(WatchService watchService) {
        if (watchService == null) {
            return null;
        }
        if (!(watchService instanceof N)) {
            return new M(watchService);
        }
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchService watchService = this.a;
        if (obj instanceof M) {
            obj = ((M) obj).a;
        }
        return watchService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
