package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static bsy a(Configuration configuration) {
        LocaleList locales;
        String languageTags;
        locales = configuration.getLocales();
        languageTags = locales.toLanguageTags();
        return bsy.c(languageTags);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales;
        LocaleList locales2;
        boolean equals;
        locales = configuration.getLocales();
        locales2 = configuration2.getLocales();
        equals = locales.equals(locales2);
        if (!equals) {
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    public static void c(bsy bsyVar) {
        LocaleList forLanguageTags;
        forLanguageTags = LocaleList.forLanguageTags(bsyVar.e());
        LocaleList.setDefault(forLanguageTags);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(Configuration configuration, bsy bsyVar) {
        LocaleList forLanguageTags;
        forLanguageTags = LocaleList.forLanguageTags(bsyVar.e());
        configuration.setLocales(forLanguageTags);
    }

    public static final int e(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i <= 600) {
            if (i < 500) {
                if (i <= 480 || i2 <= 640) {
                    if (i >= 360) {
                        return 3;
                    }
                    return 2;
                }
                return 4;
            }
            return 4;
        }
        return 5;
    }

    public static final void f(Context context) {
        context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
    }

    public static final void g(zw zwVar, aae aaeVar, aaj aajVar, mol molVar, abi abiVar, int i) {
        int i2;
        Object aacVar;
        long g;
        int i3;
        int i4;
        int i5;
        int i6;
        abi b = abiVar.b(-2127166334);
        if ((i & 6) == 0) {
            if (true != b.B(zwVar)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != b.B(aaeVar)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (true != b.B(aajVar)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (true != b.D(molVar)) {
                i3 = 1024;
            } else {
                i3 = 2048;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) == 1170 && b.G()) {
            b.r();
        } else {
            b.s();
            if ((i & 1) != 0 && !b.E()) {
                b.r();
            }
            b.m();
            aep aepVar = aab.a;
            long j = aqx.e;
            b.u(-1280635353);
            if (((Boolean) b.f(aab.a)).booleanValue()) {
                int i7 = zt.a;
                agt a = agq.a(new aqx(j), b);
                boolean C = b.C(true) | b.y(Float.NaN);
                abp abpVar = (abp) b;
                Object P = abpVar.P();
                if (C || P == abh.a) {
                    P = new zs(a);
                    abpVar.Z(P);
                }
                aacVar = (zs) P;
            } else if (blh.b(Float.NaN, Float.NaN) && a.n(j, aqx.e)) {
                aacVar = aab.b;
            } else {
                aacVar = new aac(j);
            }
            abp abpVar2 = (abp) b;
            abpVar2.U();
            long j2 = zwVar.a;
            boolean A = b.A(j2);
            Object P2 = abpVar2.P();
            if (A || P2 == abh.a) {
                g = jw.g(aqx.d(j2), aqx.c(j2), aqx.b(j2), 0.4f, aqx.f(j2));
                P2 = new zp(j2, g);
                abpVar2.Z(P2);
            }
            acb.b(new aeq[]{zx.a.b(zwVar), xd.a.b(aacVar), zu.a.b(zy.a), aaf.a.b(aaeVar), zq.a.b((zp) P2), aak.a.b(aajVar)}, alg.e(-1066563262, new xx(aajVar, molVar, 2), b), b, 56);
        }
        afv d = b.d();
        if (d != null) {
            ((aeu) d).d = new aaa(zwVar, aaeVar, aajVar, molVar, i, 0);
        }
    }

    public static final zw h(abi abiVar) {
        return (zw) abiVar.f(zx.a);
    }
}
