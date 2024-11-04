package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class giq extends gis {
    private final goa a;

    public giq(goa goaVar) {
        this.a = goaVar;
    }

    @Override // defpackage.gis, defpackage.giu
    public final goa a() {
        return this.a;
    }

    @Override // defpackage.giu
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof giu) {
            giu giuVar = (giu) obj;
            if (giuVar.b() == 1 && this.a.equals(giuVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NotificationTarget{account=" + this.a.toString() + "}";
    }
}
