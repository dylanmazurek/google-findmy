package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awz {
    public static final awx a = new awx();

    public static final void a(aox aoxVar, mol molVar, abi abiVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 6;
        abi b = abiVar.b(-1298353104);
        if (i5 == 0) {
            if (true != b.B(aoxVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != b.D(molVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && b.G()) {
            b.r();
        } else {
            abp abpVar = (abp) b;
            Object P = abpVar.P();
            if (P == abh.a) {
                P = new axb();
                abpVar.Z(P);
            }
            b((axb) P, aoxVar, molVar, b, (i2 << 3) & 1008);
        }
        afv d = b.d();
        if (d != null) {
            ((aeu) d).d = new xb(aoxVar, molVar, i, 3);
        }
    }

    public static final void b(axb axbVar, aox aoxVar, mol molVar, abi abiVar, int i) {
        int i2;
        abj abjVar;
        int i3;
        int i4;
        int i5;
        int i6 = i & 6;
        abi b = abiVar.b(-511989831);
        if (i6 == 0) {
            if (true != b.D(axbVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != b.B(aoxVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (true != b.D(molVar)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && b.G()) {
            b.r();
        } else {
            int a2 = abd.a(b);
            abp abpVar = (abp) b;
            abpVar.Y(206, abr.e);
            if (abpVar.x) {
                agb.Y(abpVar.s);
            }
            Object O = abpVar.O();
            if (O instanceof abj) {
                abjVar = (abj) O;
            } else {
                abjVar = null;
            }
            if (abjVar == null) {
                abjVar = new abj(new abk(abpVar, abpVar.y, abpVar.h, abpVar.o));
                abpVar.ab(abjVar);
            }
            abjVar.a.b.h(abpVar.L());
            abpVar.U();
            aox e = de.e(b, aoxVar);
            aek L = abpVar.L();
            mnw mnwVar = ayr.b;
            b.v();
            if (abpVar.x) {
                b.k(new xr(4));
            } else {
                b.x();
            }
            abk abkVar = abjVar.a;
            agx.a(b, axbVar, axbVar.b);
            agx.a(b, abkVar, axbVar.c);
            agx.a(b, molVar, axbVar.d);
            agx.a(b, L, axt.c);
            agx.a(b, e, axt.b);
            mol molVar2 = axt.e;
            if (abpVar.x || !amr.i(abpVar.P(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                abpVar.Z(valueOf);
                b.i(valueOf, molVar2);
            }
            b.n();
            if (!b.G()) {
                boolean D = b.D(axbVar);
                Object P = abpVar.P();
                if (D || P == abh.a) {
                    P = new ob(axbVar, 14);
                    abpVar.Z(P);
                }
                act.f((mnw) P, b);
            }
        }
        afv d = b.d();
        if (d != null) {
            ((aeu) d).d = new awy(axbVar, aoxVar, molVar, i, 0);
        }
    }
}
