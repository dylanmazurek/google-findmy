package j$.nio.file;

import java.nio.file.WatchEvent;

/* loaded from: classes2.dex */
public final /* synthetic */ class I {
    public final /* synthetic */ WatchEvent.Modifier a;

    private /* synthetic */ I(WatchEvent.Modifier modifier) {
        this.a = modifier;
    }

    public static /* synthetic */ I a(WatchEvent.Modifier modifier) {
        if (modifier == null) {
            return null;
        }
        if (!(modifier instanceof J)) {
            return new I(modifier);
        }
        throw null;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent.Modifier modifier = this.a;
        if (obj instanceof I) {
            obj = ((I) obj).a;
        }
        return modifier.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
