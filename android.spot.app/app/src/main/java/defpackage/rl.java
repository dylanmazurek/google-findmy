package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rl {
    public rl() {
        ccy ccyVar = ccy.a;
    }

    public static String a() {
        LocaleList adjustedDefault;
        int size;
        Locale locale;
        adjustedDefault = LocaleList.getAdjustedDefault();
        size = adjustedDefault.size();
        if (size <= 0) {
            return null;
        }
        locale = adjustedDefault.get(0);
        return locale.toLanguageTag();
    }

    public static final void b(aox aoxVar, aon aonVar, mom momVar, abi abiVar, int i) {
        int i2;
        int i3 = i & 3072;
        int i4 = i | 438;
        abi b = abiVar.b(1781813501);
        boolean z = true;
        if (i3 == 0) {
            if (true != b.D(momVar)) {
                i2 = 1024;
            } else {
                i2 = 2048;
            }
            i4 |= i2;
        }
        if ((i4 & 1171) == 1170 && b.G()) {
            b.r();
        } else {
            aoxVar = aox.d;
            int i5 = aon.a;
            aonVar = aom.a;
            awh d = xt.d(aonVar);
            if ((i4 & 7168) != 2048) {
                z = false;
            }
            boolean B = b.B(d) | z;
            abp abpVar = (abp) b;
            Object P = abpVar.P();
            if (B || P == abh.a) {
                P = new xx(d, momVar, 0);
                abpVar.Z(P);
            }
            awz.a(aoxVar, (mol) P, b, i4 & 14);
        }
        aox aoxVar2 = aoxVar;
        aon aonVar2 = aonVar;
        afv d2 = b.d();
        if (d2 != null) {
            ((aeu) d2).d = new awy(aoxVar2, aonVar2, momVar, i, 1);
        }
    }

    public static final boolean c(bgm bgmVar) {
        bfu bfuVar;
        if (bgmVar.d != null) {
            bfuVar = new bfu();
        } else {
            bfuVar = null;
        }
        if (bfuVar == null || !a.m(0, 1)) {
            return true;
        }
        return false;
    }
}
