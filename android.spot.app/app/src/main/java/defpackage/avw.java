package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class avw implements axc, awj {
    final /* synthetic */ awd a;
    private final /* synthetic */ avy b;

    public avw(awd awdVar) {
        this.a = awdVar;
        this.b = awdVar.g;
    }

    @Override // defpackage.ble
    public final float a() {
        return this.b.b;
    }

    @Override // defpackage.blj
    public final float b() {
        return this.b.c;
    }

    @Override // defpackage.blj
    public final float cc(long j) {
        return bbp.e(this.b, j);
    }

    @Override // defpackage.awj
    public final awi cd(int i, int i2, Map map, moh mohVar) {
        return nq.h(this.b, i, i2, map, mohVar);
    }

    @Override // defpackage.ble
    public final float cf(float f) {
        return bbc.b(this.b, f);
    }

    @Override // defpackage.ble
    public final float cg(int i) {
        return bbc.c(this.b, i);
    }

    @Override // defpackage.ble
    public final float ch(long j) {
        return bbc.d(this.b, j);
    }

    @Override // defpackage.ble
    public final float ci(float f) {
        return bbc.e(this.b, f);
    }

    @Override // defpackage.ble
    public final int cj(float f) {
        return bbc.f(this.b, f);
    }

    @Override // defpackage.ble
    public final long ck(long j) {
        return bbc.g(this.b, j);
    }

    @Override // defpackage.blj
    public final long cl(float f) {
        return bbp.f(this.b, f);
    }

    @Override // defpackage.ble
    public final long cm(float f) {
        return bbc.h(this.b, f);
    }

    @Override // defpackage.avr
    public final bln m() {
        return this.b.a;
    }

    @Override // defpackage.avr
    public final boolean n() {
        return this.b.n();
    }

    @Override // defpackage.awj
    public final awi o(int i, int i2, Map map, moh mohVar) {
        return this.b.o(i, i2, map, mohVar);
    }

    @Override // defpackage.axc
    public final List p(Object obj, mol molVar) {
        List list;
        Object awcVar;
        ayr ayrVar = (ayr) this.a.f.get(obj);
        if (ayrVar != null) {
            list = ayrVar.x();
        } else {
            list = null;
        }
        if (list != null) {
            return list;
        }
        awd awdVar = this.a;
        aiu aiuVar = awdVar.k;
        int i = aiuVar.b;
        int i2 = awdVar.d;
        if (i >= i2) {
            if (i == i2) {
                aiuVar.o(obj);
            } else {
                aiuVar.c(i2, obj);
            }
            awdVar.d++;
            if (!awdVar.i.containsKey(obj)) {
                if (!awdVar.a.ad()) {
                    awcVar = new awb();
                } else {
                    awdVar.h();
                    if (!awdVar.f.containsKey(obj)) {
                        awdVar.j.remove(obj);
                        HashMap hashMap = awdVar.i;
                        Object obj2 = hashMap.get(obj);
                        if (obj2 == null) {
                            obj2 = awdVar.e(obj);
                            if (obj2 != null) {
                                awdVar.k(awdVar.a.A().indexOf(obj2), awdVar.a.A().size());
                                awdVar.m++;
                            } else {
                                obj2 = awdVar.d(awdVar.a.A().size());
                                awdVar.m++;
                            }
                            hashMap.put(obj, obj2);
                        }
                        awdVar.j((ayr) obj2, obj, molVar);
                    }
                    awcVar = new awc(awdVar, obj);
                }
                awdVar.j.put(obj, awcVar);
                if (awdVar.a.ah() == 3) {
                    awdVar.a.S(true);
                } else {
                    ayr.ao(awdVar.a, true, 6);
                }
            }
            ayr ayrVar2 = (ayr) awdVar.i.get(obj);
            if (ayrVar2 != null) {
                List j = ayrVar2.r().j();
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((ayx) j.get(i3)).z.b = true;
                }
                return j;
            }
            return mlx.a;
        }
        throw new IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.");
    }
}
