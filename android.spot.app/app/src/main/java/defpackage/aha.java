package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aha {
    public agz a;
    public boolean b;
    public int e;
    public int h;
    private final abp i;
    private int j;
    public final acy c = new acy();
    public boolean d = true;
    private final ags k = new ags();
    private int l = -1;
    public int f = -1;
    public int g = -1;

    public aha(abp abpVar, agz agzVar) {
        this.i = abpVar;
        this.a = agzVar;
    }

    public final afw a() {
        return this.i.q;
    }

    public final void b() {
        if (this.b) {
            j(false);
            j(false);
            this.a.c();
            this.b = false;
        }
    }

    public final void c(agz agzVar, ali aliVar) {
        agz agzVar2 = this.a;
        if (agzVar.e()) {
            aip aipVar = agzVar2.a;
            ahe aheVar = ahe.a;
            aipVar.e(aheVar);
            aio.b(aipVar, 0, agzVar);
            aio.b(aipVar, 1, aliVar);
            if (aipVar.g != aip.h(aheVar.b) || aipVar.h != aip.h(aheVar.c)) {
                StringBuilder sb = new StringBuilder();
                int i = aheVar.b;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    if (((1 << i3) & aipVar.g) != 0) {
                        if (i2 > 0) {
                            sb.append(", ");
                        }
                        sb.append(aheVar.a(i3));
                        i2++;
                    }
                }
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                int i4 = aheVar.c;
                int i5 = 0;
                for (int i6 = 0; i6 < i4; i6++) {
                    if (((1 << i6) & aipVar.h) != 0) {
                        if (i2 > 0) {
                            sb3.append(", ");
                        }
                        sb3.append(aheVar.c(i6));
                        i5++;
                    }
                }
                ael.b(a.al(new StringBuilder(), sb3.toString(), i5, sb2, i2, aheVar));
            }
        }
    }

    public final void d(Object obj) {
        i();
        this.k.f(obj);
    }

    public final void e(int i) {
        this.e += i - a().e;
    }

    public final void f() {
        i();
        if (this.k.e()) {
            this.k.b();
        } else {
            this.j++;
        }
    }

    public final void g() {
        int i = this.j;
        if (i > 0) {
            aip aipVar = this.a.a;
            aih aihVar = aih.a;
            aipVar.e(aihVar);
            aio.a(aipVar, 0, i);
            if (aipVar.g != aip.h(aihVar.b) || aipVar.h != aip.h(aihVar.c)) {
                StringBuilder sb = new StringBuilder();
                int i2 = aihVar.b;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    if (((1 << i4) & aipVar.g) != 0) {
                        if (i3 > 0) {
                            sb.append(", ");
                        }
                        sb.append(aihVar.a(i4));
                        i3++;
                    }
                }
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                int i5 = aihVar.c;
                int i6 = 0;
                for (int i7 = 0; i7 < i5; i7++) {
                    if (((1 << i7) & aipVar.h) != 0) {
                        if (i3 > 0) {
                            sb3.append(", ");
                        }
                        sb3.append(aihVar.c(i7));
                        i6++;
                    }
                }
                ael.b(a.al(new StringBuilder(), sb3.toString(), i6, sb2, i3, aihVar));
            }
            this.j = 0;
        }
        if (this.k.e()) {
            agz agzVar = this.a;
            ags agsVar = this.k;
            int size = agsVar.a.size();
            Object[] objArr = new Object[size];
            for (int i8 = 0; i8 < size; i8++) {
                objArr[i8] = agsVar.a.get(i8);
            }
            if (size != 0) {
                aip aipVar2 = agzVar.a;
                ahj ahjVar = ahj.a;
                aipVar2.e(ahjVar);
                aio.b(aipVar2, 0, objArr);
                if (aipVar2.g != aip.h(ahjVar.b) || aipVar2.h != aip.h(ahjVar.c)) {
                    StringBuilder sb4 = new StringBuilder();
                    int i9 = ahjVar.b;
                    int i10 = 0;
                    for (int i11 = 0; i11 < i9; i11++) {
                        if (((1 << i11) & aipVar2.g) != 0) {
                            if (i10 > 0) {
                                sb4.append(", ");
                            }
                            sb4.append(ahjVar.a(i11));
                            i10++;
                        }
                    }
                    String sb5 = sb4.toString();
                    StringBuilder sb6 = new StringBuilder();
                    int i12 = ahjVar.c;
                    int i13 = 0;
                    for (int i14 = 0; i14 < i12; i14++) {
                        if (((1 << i14) & aipVar2.h) != 0) {
                            if (i10 > 0) {
                                sb6.append(", ");
                            }
                            sb6.append(ahjVar.c(i14));
                            i13++;
                        }
                    }
                    ael.b(a.al(new StringBuilder(), sb6.toString(), i13, sb5, i10, ahjVar));
                }
            }
            this.k.c();
        }
    }

    public final void h() {
        j(false);
        k();
    }

    public final void i() {
        int i = this.h;
        if (i > 0) {
            int i2 = this.l;
            if (i2 >= 0) {
                g();
                aip aipVar = this.a.a;
                ahy ahyVar = ahy.a;
                aipVar.e(ahyVar);
                aio.a(aipVar, 0, i2);
                aio.a(aipVar, 1, i);
                if (aipVar.g != aip.h(ahyVar.b) || aipVar.h != aip.h(ahyVar.c)) {
                    StringBuilder sb = new StringBuilder();
                    int i3 = ahyVar.b;
                    int i4 = 0;
                    for (int i5 = 0; i5 < i3; i5++) {
                        if (((1 << i5) & aipVar.g) != 0) {
                            if (i4 > 0) {
                                sb.append(", ");
                            }
                            sb.append(ahyVar.a(i5));
                            i4++;
                        }
                    }
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder();
                    int i6 = ahyVar.c;
                    int i7 = 0;
                    for (int i8 = 0; i8 < i6; i8++) {
                        if (((1 << i8) & aipVar.h) != 0) {
                            if (i4 > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(ahyVar.c(i8));
                            i7++;
                        }
                    }
                    ael.b(a.al(new StringBuilder(), sb3.toString(), i7, sb2, i4, ahyVar));
                }
                this.l = -1;
            } else {
                int i9 = this.g;
                int i10 = this.f;
                g();
                aip aipVar2 = this.a.a;
                aht ahtVar = aht.a;
                aipVar2.e(ahtVar);
                aio.a(aipVar2, 1, i9);
                aio.a(aipVar2, 0, i10);
                aio.a(aipVar2, 2, i);
                if (aipVar2.g != aip.h(ahtVar.b) || aipVar2.h != aip.h(ahtVar.c)) {
                    StringBuilder sb4 = new StringBuilder();
                    int i11 = ahtVar.b;
                    int i12 = 0;
                    for (int i13 = 0; i13 < i11; i13++) {
                        if (((1 << i13) & aipVar2.g) != 0) {
                            if (i12 > 0) {
                                sb4.append(", ");
                            }
                            sb4.append(ahtVar.a(i13));
                            i12++;
                        }
                    }
                    String sb5 = sb4.toString();
                    StringBuilder sb6 = new StringBuilder();
                    int i14 = ahtVar.c;
                    int i15 = 0;
                    for (int i16 = 0; i16 < i14; i16++) {
                        if (((1 << i16) & aipVar2.h) != 0) {
                            if (i12 > 0) {
                                sb6.append(", ");
                            }
                            sb6.append(ahtVar.c(i16));
                            i15++;
                        }
                    }
                    ael.b(a.al(new StringBuilder(), sb6.toString(), i15, sb5, i12, ahtVar));
                }
                this.f = -1;
                this.g = -1;
            }
            this.h = 0;
        }
    }

    public final void j(boolean z) {
        int i;
        if (z) {
            i = a().g;
        } else {
            i = a().e;
        }
        int i2 = i - this.e;
        if (i2 < 0) {
            abr.i("Tried to seek backward");
        }
        if (i2 > 0) {
            aip aipVar = this.a.a;
            ahc ahcVar = ahc.a;
            aipVar.e(ahcVar);
            aio.a(aipVar, 0, i2);
            if (aipVar.g != aip.h(ahcVar.b) || aipVar.h != aip.h(ahcVar.c)) {
                StringBuilder sb = new StringBuilder();
                int i3 = ahcVar.b;
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    if (((1 << i5) & aipVar.g) != 0) {
                        if (i4 > 0) {
                            sb.append(", ");
                        }
                        sb.append(ahcVar.a(i5));
                        i4++;
                    }
                }
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                int i6 = ahcVar.c;
                int i7 = 0;
                for (int i8 = 0; i8 < i6; i8++) {
                    if (((1 << i8) & aipVar.h) != 0) {
                        if (i4 > 0) {
                            sb3.append(", ");
                        }
                        sb3.append(ahcVar.c(i8));
                        i7++;
                    }
                }
                ael.b(a.al(new StringBuilder(), sb3.toString(), i7, sb2, i4, ahcVar));
            }
            this.e = i;
        }
    }

    public final void k() {
        afw a;
        int i;
        if (a().c > 0 && this.c.b(-2) != (i = (a = a()).g)) {
            if (!this.b && this.d) {
                j(false);
                this.a.a.d(aho.a);
                this.b = true;
            }
            if (i > 0) {
                aav g = a.g(i);
                this.c.e(i);
                j(false);
                aip aipVar = this.a.a;
                ahn ahnVar = ahn.a;
                aipVar.e(ahnVar);
                aio.b(aipVar, 0, g);
                if (aipVar.g != aip.h(ahnVar.b) || aipVar.h != aip.h(ahnVar.c)) {
                    StringBuilder sb = new StringBuilder();
                    int i2 = ahnVar.b;
                    int i3 = 0;
                    for (int i4 = 0; i4 < i2; i4++) {
                        if (((1 << i4) & aipVar.g) != 0) {
                            if (i3 > 0) {
                                sb.append(", ");
                            }
                            sb.append(ahnVar.a(i4));
                            i3++;
                        }
                    }
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder();
                    int i5 = ahnVar.c;
                    int i6 = 0;
                    for (int i7 = 0; i7 < i5; i7++) {
                        if (((1 << i7) & aipVar.h) != 0) {
                            if (i3 > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(ahnVar.c(i7));
                            i6++;
                        }
                    }
                    ael.b(a.al(new StringBuilder(), sb3.toString(), i6, sb2, i3, ahnVar));
                }
                this.b = true;
            }
        }
    }

    public final void l(int i, int i2) {
        if (i2 > 0) {
            if (i < 0) {
                abr.i(a.ae(i, "Invalid remove index "));
            }
            if (this.l == i) {
                this.h += i2;
                return;
            }
            i();
            this.l = i;
            this.h = i2;
        }
    }

    public final void m() {
        this.a.a.d(aib.a);
    }
}
