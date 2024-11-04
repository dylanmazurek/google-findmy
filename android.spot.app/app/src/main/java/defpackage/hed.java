package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hed extends hek {
    private final jer a;
    private final jis b;
    private final jer c;

    public hed() {
        throw null;
    }

    @Override // defpackage.hek
    public final jer a() {
        return jer.i(new frx());
    }

    @Override // defpackage.hek
    public final jis b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hed) {
            hed hedVar = (hed) obj;
            if (this.a.equals(hedVar.a) && hzc.L(this.b, hedVar.b) && this.c.equals(hedVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 2097800333) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        jer jerVar = this.c;
        jis jisVar = this.b;
        return "CollapsibleAccountManagementFeatureImpl{commonCards=" + String.valueOf(this.a) + ", flavorCustomActions=" + String.valueOf(jisVar) + ", dynamicCards=" + String.valueOf(jerVar) + "}";
    }

    public hed(jer jerVar, jis jisVar, jer jerVar2) {
        this.a = jerVar;
        this.b = jisVar;
        this.c = jerVar2;
    }

    @Override // defpackage.hek
    public final void c() {
    }

    @Override // defpackage.hek
    public final void d() {
    }
}
