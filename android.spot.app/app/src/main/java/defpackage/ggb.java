package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggb {
    public final long a;
    public final Map b;

    public ggb(long j, Map map) {
        this.a = j;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggb)) {
            return false;
        }
        ggb ggbVar = (ggb) obj;
        if (this.a == ggbVar.a && amr.i(this.b, ggbVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (a.l(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "NotificationsCount(count=" + this.a + ", taggedNotificationsCounts=" + this.b + ")";
    }
}
