package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class act {
    public static final acq a = new acq();

    public static final msw a(mnb mnbVar, abi abiVar) {
        mnbVar.get(muf.c);
        mnb h = abiVar.h();
        return msz.m(h.plus(new mui((muf) h.get(muf.c))).plus(mnbVar));
    }

    public static final void b(Object obj, Object obj2, moh mohVar, abi abiVar) {
        boolean B = abiVar.B(obj) | abiVar.B(obj2);
        Object g = abiVar.g();
        if (B || g == abh.a) {
            g = new aco(mohVar);
            abiVar.w(g);
        }
    }

    public static final void c(Object obj, moh mohVar, abi abiVar) {
        boolean B = abiVar.B(obj);
        Object g = abiVar.g();
        if (B || g == abh.a) {
            g = new aco(mohVar);
            abiVar.w(g);
        }
    }

    public static final void d(Object obj, Object obj2, mol molVar, abi abiVar) {
        mnb h = abiVar.h();
        boolean B = abiVar.B(obj) | abiVar.B(obj2);
        abp abpVar = (abp) abiVar;
        Object P = abpVar.P();
        if (B || P == abh.a) {
            P = new adf(h, molVar);
            abpVar.Z(P);
        }
    }

    public static final void e(Object obj, mol molVar, abi abiVar) {
        mnb h = abiVar.h();
        boolean B = abiVar.B(obj);
        Object g = abiVar.g();
        if (B || g == abh.a) {
            g = new adf(h, molVar);
            abiVar.w(g);
        }
    }

    public static final void f(mnw mnwVar, abi abiVar) {
        aip aipVar = ((abp) abiVar).w.a.a;
        aia aiaVar = aia.a;
        aipVar.e(aiaVar);
        aio.b(aipVar, 0, mnwVar);
        if (aipVar.g == aip.h(aiaVar.b) && aipVar.h == aip.h(aiaVar.c)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i = aiaVar.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (((1 << i3) & aipVar.g) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(aiaVar.a(i3));
                i2++;
            }
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        int i4 = aiaVar.c;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            if (((1 << i6) & aipVar.h) != 0) {
                if (i2 > 0) {
                    sb3.append(", ");
                }
                sb3.append(aiaVar.c(i6));
                i5++;
            }
        }
        ael.b(a.al(new StringBuilder(), sb3.toString(), i5, sb2, i2, aiaVar));
    }
}
