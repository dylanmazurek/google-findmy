package j$.nio.file;

import java.nio.file.WatchKey;

/* loaded from: classes2.dex */
public final /* synthetic */ class K {
    public final /* synthetic */ WatchKey a;

    private /* synthetic */ K(WatchKey watchKey) {
        this.a = watchKey;
    }

    public static /* synthetic */ K a(WatchKey watchKey) {
        if (watchKey == null) {
            return null;
        }
        if (!(watchKey instanceof L)) {
            return new K(watchKey);
        }
        throw null;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchKey watchKey = this.a;
        if (obj instanceof K) {
            obj = ((K) obj).a;
        }
        return watchKey.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
