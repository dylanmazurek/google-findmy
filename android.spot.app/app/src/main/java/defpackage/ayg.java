package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayg extends azd {
    public ayg(ayh ayhVar) {
        super(ayhVar);
    }

    @Override // defpackage.awg
    public final awr l(long j) {
        t(j);
        aiu n = y().n();
        int i = n.b;
        if (i > 0) {
            Object[] objArr = n.a;
            int i2 = 0;
            do {
                ayw q = ((ayr) objArr[i2]).q();
                q.getClass();
                q.v = 3;
                i2++;
            } while (i2 < i);
        }
        super.A(y().h.a(this, y().w(), j));
        return this;
    }

    @Override // defpackage.azc
    public final int u(avc avcVar) {
        int i;
        ayw aywVar = (ayw) x();
        ayz ayzVar = aywVar.u;
        if (ayzVar.u == 2) {
            axm axmVar = aywVar.n;
            axmVar.d = true;
            if (axmVar.b) {
                ayzVar.e();
            }
        } else {
            aywVar.n.e = true;
        }
        azd azdVar = ((ayh) aywVar.d()).g;
        if (azdVar != null) {
            azdVar.j = true;
        }
        aywVar.f();
        azd azdVar2 = ((ayh) aywVar.d()).g;
        if (azdVar2 != null) {
            azdVar2.j = false;
        }
        Integer num = (Integer) aywVar.n.f.get(avcVar);
        if (num != null) {
            i = num.intValue();
        } else {
            i = Integer.MIN_VALUE;
        }
        this.m.put(avcVar, Integer.valueOf(i));
        return i;
    }

    @Override // defpackage.azd
    protected final void v() {
        ayw q = y().q();
        q.getClass();
        q.m();
    }
}
