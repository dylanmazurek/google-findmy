package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bns implements bnh {
    public int c;
    public bmw d;
    bnp e;
    protected int k;
    public final bnk f = new bnk(this);
    public int g = 0;
    public boolean h = false;
    public final bnj i = new bnj(this);
    public final bnj j = new bnj(this);
    protected int l = 1;

    public bns(bmw bmwVar) {
        this.d = bmwVar;
    }

    public static final void j(bnj bnjVar, bnj bnjVar2, int i) {
        bnjVar.k.add(bnjVar2);
        bnjVar.e = i;
        bnjVar2.j.add(bnjVar);
    }

    public static final bnj k(bmv bmvVar) {
        bmv bmvVar2 = bmvVar.e;
        if (bmvVar2 != null) {
            int i = bmvVar2.i;
            bmw bmwVar = bmvVar2.d;
            int i2 = i - 1;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                return null;
                            }
                            return bmwVar.i.a;
                        }
                        return bmwVar.i.j;
                    }
                    return bmwVar.h.j;
                }
                return bmwVar.i.i;
            }
            return bmwVar.h.i;
        }
        return null;
    }

    public static final bnj l(bmv bmvVar, int i) {
        bns bnsVar;
        bmv bmvVar2 = bmvVar.e;
        if (bmvVar2 != null) {
            bmw bmwVar = bmvVar2.d;
            if (i == 0) {
                bnsVar = bmwVar.h;
            } else {
                bnsVar = bmwVar.i;
            }
            int i2 = bmvVar2.i - 1;
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3 && i2 != 4) {
                    return null;
                }
                return bnsVar.j;
            }
            return bnsVar.i;
        }
        return null;
    }

    public long a() {
        if (this.f.i) {
            return r0.f;
        }
        return 0L;
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract boolean e();

    @Override // defpackage.bnh
    public void f() {
        throw null;
    }

    public final int h(int i, int i2) {
        if (i2 == 0) {
            bmw bmwVar = this.d;
            int i3 = bmwVar.x;
            int max = Math.max(bmwVar.w, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max != i) {
                return max;
            }
            return i;
        }
        bmw bmwVar2 = this.d;
        int i4 = bmwVar2.A;
        int max2 = Math.max(bmwVar2.z, i);
        if (i4 > 0) {
            max2 = Math.min(i4, i);
        }
        if (max2 == i) {
            return i;
        }
        return max2;
    }

    public final void i(bnj bnjVar, bnj bnjVar2, int i, bnk bnkVar) {
        bnjVar.k.add(bnjVar2);
        bnjVar.k.add(this.f);
        bnjVar.g = i;
        bnjVar.h = bnkVar;
        bnjVar2.j.add(bnjVar);
        bnkVar.j.add(bnjVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:            if (r10.c == 3) goto L118;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(defpackage.bmv r13, defpackage.bmv r14, int r15) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bns.m(bmv, bmv, int):void");
    }
}
