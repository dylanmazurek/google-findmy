package j$.nio.file;

import java.nio.file.WatchEvent;

/* loaded from: classes2.dex */
public final /* synthetic */ class G implements WatchEvent.Kind {
    public final /* synthetic */ H a;

    private /* synthetic */ G(H h) {
        this.a = h;
    }

    public static /* synthetic */ WatchEvent.Kind a(H h) {
        if (h == null) {
            return null;
        }
        return h instanceof F ? ((F) h).a : new G(h);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        H h = this.a;
        if (obj instanceof G) {
            obj = ((G) obj).a;
        }
        return h.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchEvent.Kind
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.WatchEvent.Kind
    public final /* synthetic */ Class type() {
        return this.a.type();
    }
}
