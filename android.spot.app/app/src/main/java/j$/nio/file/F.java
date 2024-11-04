package j$.nio.file;

import java.nio.file.WatchEvent;

/* loaded from: classes2.dex */
public final /* synthetic */ class F implements H {
    public final /* synthetic */ WatchEvent.Kind a;

    private /* synthetic */ F(WatchEvent.Kind kind) {
        this.a = kind;
    }

    public static /* synthetic */ H a(WatchEvent.Kind kind) {
        if (kind == null) {
            return null;
        }
        return kind instanceof G ? ((G) kind).a : new F(kind);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent.Kind kind = this.a;
        if (obj instanceof F) {
            obj = ((F) obj).a;
        }
        return kind.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.H
    public final /* synthetic */ String name() {
        String name;
        name = this.a.name();
        return name;
    }

    @Override // j$.nio.file.H
    public final /* synthetic */ Class type() {
        Class type;
        type = this.a.type();
        return type;
    }
}
