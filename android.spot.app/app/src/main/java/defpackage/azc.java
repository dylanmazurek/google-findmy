package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class azc extends awr implements awj, ayb {
    public boolean i;
    public boolean j;
    public final awq k = new awe(this);

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void L(azq azqVar) {
        ayr ayrVar;
        axm axmVar;
        azq azqVar2 = azqVar.t;
        if (azqVar2 != null) {
            ayrVar = azqVar2.q;
        } else {
            ayrVar = null;
        }
        if (!amr.i(ayrVar, azqVar.q)) {
            ((ayx) azqVar.T()).r.e();
            return;
        }
        axn b = azqVar.T().b();
        if (b != null && (axmVar = ((ayx) b).r) != null) {
            axmVar.e();
        }
    }

    public final int D(avc avcVar) {
        int u;
        int b;
        if (!K() || (u = u(avcVar)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = avcVar instanceof axe;
        long j = this.e;
        if (z) {
            b = blk.a(j);
        } else {
            b = blk.b(j);
        }
        return u + b;
    }

    public abstract long E();

    public abstract avs F();

    public abstract awi G();

    public abstract azc H();

    public final void I(awi awiVar) {
        azy azyVar = new azy(awiVar, this);
        if (this.j) {
            return;
        }
        azyVar.a.e();
    }

    public abstract void J();

    public abstract boolean K();

    @Override // defpackage.blj
    public final /* synthetic */ float cc(long j) {
        return bbp.e(this, j);
    }

    @Override // defpackage.awj
    public final /* synthetic */ awi cd(int i, int i2, Map map, moh mohVar) {
        return nq.h(this, i, i2, map, mohVar);
    }

    @Override // defpackage.ble
    public final /* synthetic */ float cf(float f) {
        return bbc.b(this, f);
    }

    @Override // defpackage.ble
    public final /* synthetic */ float cg(int i) {
        return bbc.c(this, i);
    }

    @Override // defpackage.ble
    public final /* synthetic */ float ch(long j) {
        return bbc.d(this, j);
    }

    @Override // defpackage.ble
    public final /* synthetic */ float ci(float f) {
        return bbc.e(this, f);
    }

    @Override // defpackage.ble
    public final /* synthetic */ int cj(float f) {
        return bbc.f(this, f);
    }

    @Override // defpackage.ble
    public final /* synthetic */ long ck(long j) {
        return bbc.g(this, j);
    }

    @Override // defpackage.blj
    public final /* synthetic */ long cl(float f) {
        return bbp.f(this, f);
    }

    @Override // defpackage.ble
    public final /* synthetic */ long cm(float f) {
        return bbc.h(this, f);
    }

    @Override // defpackage.avr
    public boolean n() {
        return false;
    }

    @Override // defpackage.awj
    public final awi o(int i, int i2, Map map, moh mohVar) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            ll.g(a.aj(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new azb(i, i2, map, mohVar, this);
    }

    public abstract int u(avc avcVar);

    @Override // defpackage.ayb
    public final void p() {
    }
}
