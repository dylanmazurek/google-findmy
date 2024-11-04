package defpackage;

import java.security.spec.ECPoint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kkj extends kln {
    public final kkh a;
    public final ECPoint b;
    public final knb c;

    public kkj(kkh kkhVar, ECPoint eCPoint, knb knbVar) {
        this.a = kkhVar;
        this.b = eCPoint;
        this.c = knbVar;
    }

    @Override // defpackage.kln
    public final knb V() {
        return this.c;
    }
}
