package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbv implements dcc {
    public final List a;

    public dbv(List list) {
        this.a = list;
    }

    @Override // defpackage.dcc
    public final czw a() {
        if (((dfc) this.a.get(0)).e()) {
            return new dag(this.a);
        }
        return new daf(this.a);
    }

    @Override // defpackage.dcc
    public final List b() {
        return this.a;
    }

    @Override // defpackage.dcc
    public final boolean c() {
        if (this.a.size() != 1 || !((dfc) this.a.get(0)).e()) {
            return false;
        }
        return true;
    }
}
