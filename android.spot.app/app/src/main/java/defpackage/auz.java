package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class auz extends aow implements ble, azz {
    public Object a;
    public Object b;
    public mol c;
    private muf g;
    private auf i;
    public auf d = auv.a;
    public final aiu e = new aiu(new auy[16]);
    private final aiu h = new aiu(new auy[16]);
    public long f = 0;

    public auz(Object obj, Object obj2, mol molVar) {
        this.a = obj;
        this.b = obj2;
        this.c = molVar;
    }

    private final void w(auf aufVar, int i) {
        synchronized (this.e) {
            aiu aiuVar = this.h;
            aiuVar.p(aiuVar.b, this.e);
        }
        int i2 = i - 1;
        try {
            if (i2 != 0 && i2 != 2) {
                aiu aiuVar2 = this.h;
                int i3 = aiuVar2.b;
                if (i3 > 0) {
                    int i4 = i3 - 1;
                    Object[] objArr = aiuVar2.a;
                    do {
                        ((auy) objArr[i4]).r(aufVar, i);
                        i4--;
                    } while (i4 >= 0);
                }
            } else {
                aiu aiuVar3 = this.h;
                int i5 = aiuVar3.b;
                if (i5 > 0) {
                    Object[] objArr2 = aiuVar3.a;
                    int i6 = 0;
                    do {
                        ((auy) objArr2[i6]).r(aufVar, i);
                        i6++;
                    } while (i6 < i5);
                }
            }
        } finally {
            this.h.f();
        }
    }

    @Override // defpackage.ble
    public final float a() {
        return qg.f(this).i.a();
    }

    @Override // defpackage.blj
    public final float b() {
        return qg.f(this).i.b();
    }

    @Override // defpackage.azz
    public final void bR() {
        auf aufVar = this.i;
        if (aufVar != null) {
            List list = aufVar.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((aum) list.get(i)).d) {
                    List list2 = aufVar.a;
                    ArrayList arrayList = new ArrayList(list2.size());
                    int size2 = list2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        aum aumVar = (aum) list2.get(i2);
                        long j = aumVar.a;
                        long j2 = aumVar.c;
                        long j3 = aumVar.b;
                        float f = aumVar.e;
                        boolean z = aumVar.d;
                        arrayList.add(new aum(j, j3, j2, false, f, j3, j2, z, z, 1, 0L));
                    }
                    auf aufVar2 = new auf(arrayList);
                    this.d = aufVar2;
                    w(aufVar2, 1);
                    w(aufVar2, 2);
                    w(aufVar2, 3);
                    this.i = null;
                    return;
                }
            }
        }
    }

    @Override // defpackage.azz
    public final void bS() {
        v();
    }

    @Override // defpackage.azz
    public final void bT() {
        v();
    }

    @Override // defpackage.azz
    public final void bU(auf aufVar, int i, long j) {
        this.f = j;
        if (i == 1) {
            this.d = aufVar;
        }
        if (this.g == null) {
            this.g = mpp.q(bY(), null, 4, new bea(this, (mmx) null, 1), 1);
        }
        w(aufVar, i);
        List list = aufVar.a;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (!lb.h((aum) list.get(i2))) {
                    break;
                } else {
                    i2++;
                }
            } else {
                aufVar = null;
                break;
            }
        }
        this.i = aufVar;
    }

    @Override // defpackage.blj
    public final /* synthetic */ float cc(long j) {
        return bbp.e(this, j);
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
        throw null;
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

    @Override // defpackage.aow
    public final void n() {
        v();
    }

    public final bdi u() {
        return qg.f(this).k;
    }

    public final void v() {
        muf mufVar = this.g;
        if (mufVar != null) {
            mufVar.s(new aur());
            this.g = null;
        }
    }

    @Override // defpackage.azz
    public final /* synthetic */ void bV() {
    }

    @Override // defpackage.azz
    public final /* synthetic */ void bW() {
    }
}
