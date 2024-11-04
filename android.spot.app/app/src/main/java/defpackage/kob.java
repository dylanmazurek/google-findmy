package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kob {
    public final boolean a;
    private final kon b;

    public kob(kon konVar, boolean z) {
        this.b = konVar;
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kob) {
            kob kobVar = (kob) obj;
            if (kobVar.b.equals(this.b) && kobVar.a == this.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.a).hashCode();
    }
}
