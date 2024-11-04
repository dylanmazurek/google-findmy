package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsh implements hoc {
    public final jer a;
    public final jer b;
    private final int c;

    public hsh() {
        throw null;
    }

    @Override // defpackage.hoc
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.hoc
    public final boolean b() {
        if (this.c == 1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hsh)) {
            return false;
        }
        hsh hshVar = (hsh) obj;
        int i = this.c;
        int i2 = hshVar.c;
        if (i != 0) {
            if (i2 == 1 && this.a.equals(hshVar.a) && this.b.equals(hshVar.b)) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        a.N(this.c);
        return 395873938;
    }

    public final String toString() {
        jer jerVar = this.b;
        return "StartupConfigurations{enablement=" + hod.a(this.c) + ", metricExtensionProvider=" + String.valueOf(this.a) + ", customTimestampProvider=" + String.valueOf(jerVar) + "}";
    }

    public hsh(jer jerVar, jer jerVar2) {
        this.c = 1;
        this.a = jerVar;
        this.b = jerVar2;
    }
}
