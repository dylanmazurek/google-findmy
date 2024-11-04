package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evd extends evf {
    private final String a;

    public evd(String str) {
        this.a = str;
    }

    @Override // defpackage.evi
    public final int a() {
        return 3;
    }

    @Override // defpackage.evf, defpackage.evi
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof evi) {
            evi eviVar = (evi) obj;
            if (eviVar.a() == 3 && this.a.equals(eviVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Action{learnMore=" + this.a + "}";
    }
}
