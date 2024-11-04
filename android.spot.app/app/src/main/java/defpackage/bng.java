package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bng extends bns {
    ArrayList a;
    private int b;

    public bng(bmw bmwVar, int i) {
        super(bmwVar);
        bmw bmwVar2;
        int i2;
        this.a = new ArrayList();
        this.g = i;
        bmw bmwVar3 = this.d;
        bmw n = bmwVar3.n(i);
        while (true) {
            bmw bmwVar4 = n;
            bmwVar2 = bmwVar3;
            bmwVar3 = bmwVar4;
            if (bmwVar3 == null) {
                break;
            } else {
                n = bmwVar3.n(this.g);
            }
        }
        this.d = bmwVar2;
        this.a.add(bmwVar2.o(this.g));
        bmw m = bmwVar2.m(this.g);
        while (m != null) {
            this.a.add(m.o(this.g));
            m = m.m(this.g);
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            bns bnsVar = (bns) arrayList.get(i3);
            int i4 = this.g;
            if (i4 == 0) {
                bnsVar.d.f = this;
            } else if (i4 == 1) {
                bnsVar.d.g = this;
            }
        }
        if (this.g == 0 && ((bmx) this.d.V).c && this.a.size() > 1) {
            this.d = ((bns) this.a.get(r6.size() - 1)).d;
        }
        if (this.g == 0) {
            i2 = this.d.ak;
        } else {
            i2 = this.d.al;
        }
        this.b = i2;
    }

    private final bmw g() {
        for (int i = 0; i < this.a.size(); i++) {
            bmw bmwVar = ((bns) this.a.get(i)).d;
            if (bmwVar.ai != 8) {
                return bmwVar;
            }
        }
        return null;
    }

    private final bmw n() {
        bmw bmwVar;
        int size = this.a.size();
        do {
            size--;
            if (size >= 0) {
                bmwVar = ((bns) this.a.get(size)).d;
            } else {
                return null;
            }
        } while (bmwVar.ai == 8);
        return bmwVar;
    }

    @Override // defpackage.bns
    public final long a() {
        int size = this.a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = j + r4.i.e + ((bns) this.a.get(i)).a() + r4.j.e;
        }
        return j;
    }

    @Override // defpackage.bns
    public final void b() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bns) arrayList.get(i)).b();
        }
        int size2 = this.a.size();
        if (size2 <= 0) {
            return;
        }
        bmw bmwVar = ((bns) this.a.get(0)).d;
        bmw bmwVar2 = ((bns) this.a.get(size2 - 1)).d;
        if (this.g == 0) {
            bmv bmvVar = bmwVar.K;
            bmv bmvVar2 = bmwVar2.M;
            bnj l = l(bmvVar, 0);
            int b = bmvVar.b();
            bmw g = g();
            if (g != null) {
                b = g.K.b();
            }
            if (l != null) {
                j(this.i, l, b);
            }
            bnj l2 = l(bmvVar2, 0);
            int b2 = bmvVar2.b();
            bmw n = n();
            if (n != null) {
                b2 = n.M.b();
            }
            if (l2 != null) {
                j(this.j, l2, -b2);
            }
        } else {
            bmv bmvVar3 = bmwVar.L;
            bmv bmvVar4 = bmwVar2.N;
            bnj l3 = l(bmvVar3, 1);
            int b3 = bmvVar3.b();
            bmw g2 = g();
            if (g2 != null) {
                b3 = g2.L.b();
            }
            if (l3 != null) {
                j(this.i, l3, b3);
            }
            bnj l4 = l(bmvVar4, 1);
            int b4 = bmvVar4.b();
            bmw n2 = n();
            if (n2 != null) {
                b4 = n2.N.b();
            }
            if (l4 != null) {
                j(this.j, l4, -b4);
            }
        }
        this.i.a = this;
        this.j.a = this;
    }

    @Override // defpackage.bns
    public final void c() {
        for (int i = 0; i < this.a.size(); i++) {
            ((bns) this.a.get(i)).c();
        }
    }

    @Override // defpackage.bns
    public final void d() {
        this.e = null;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bns) arrayList.get(i)).d();
        }
    }

    @Override // defpackage.bns
    public final boolean e() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (!((bns) this.a.get(i)).e()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x03c6, code lost:            r10 = r10 - r11;     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d1  */
    @Override // defpackage.bns, defpackage.bnh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 1004
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bng.f():void");
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ChainRun ");
        if (this.g == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb.append(str);
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bns bnsVar = (bns) arrayList.get(i);
            sb.append("<");
            sb.append(bnsVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
