package defpackage;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgp {
    public static final BoringLayout.Metrics a(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        BoringLayout.Metrics isBoring;
        isBoring = BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
        return isBoring;
    }

    public static final BoringLayout b(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, float f, float f2, BoringLayout.Metrics metrics, boolean z, boolean z2, TextUtils.TruncateAt truncateAt, int i2) {
        return new BoringLayout(charSequence, textPaint, i, alignment, f, f2, metrics, z, truncateAt, i2, z2);
    }

    public static final boolean c(BoringLayout boringLayout) {
        boolean isFallbackLineSpacingEnabled;
        isFallbackLineSpacingEnabled = boringLayout.isFallbackLineSpacingEnabled();
        return isFallbackLineSpacingEnabled;
    }

    public static final bgm d(bgm bgmVar, bln blnVar) {
        long j;
        long j2;
        String str;
        int i;
        int i2;
        long j3;
        int i3;
        int i4;
        bgh bghVar = bgmVar.b;
        bky d = bghVar.a.d(bcf.k);
        if (bef.l(bghVar.b)) {
            j = bgi.a;
        } else {
            j = bghVar.b;
        }
        long j4 = j;
        biz bizVar = bghVar.c;
        if (bizVar == null) {
            bizVar = biz.d;
        }
        biz bizVar2 = bizVar;
        biv bivVar = new biv();
        biw biwVar = new biw();
        bip bipVar = bghVar.f;
        if (bipVar == null) {
            bipVar = bip.b;
        }
        bip bipVar2 = bipVar;
        String str2 = bghVar.g;
        if (bef.l(bghVar.h)) {
            j2 = bgi.b;
        } else {
            j2 = bghVar.h;
        }
        long j5 = j2;
        bkn bknVar = new bkn();
        bkz bkzVar = bghVar.j;
        if (bkzVar == null) {
            bkzVar = bkz.a;
        }
        bkz bkzVar2 = bkzVar;
        bjy bjyVar = bghVar.k;
        if (bjyVar == null) {
            int i5 = bjy.b;
            bjyVar = rk.c();
        }
        bjy bjyVar2 = bjyVar;
        long j6 = bghVar.l;
        if (j6 == 16) {
            j6 = bgi.c;
        }
        long j7 = j6;
        bkv bkvVar = bghVar.m;
        if (bkvVar == null) {
            bkvVar = bkv.a;
        }
        bkv bkvVar2 = bkvVar;
        arl arlVar = bghVar.n;
        if (arlVar == null) {
            arlVar = arl.a;
        }
        arl arlVar2 = arlVar;
        kv kvVar = bghVar.p;
        if (kvVar == null) {
            kvVar = asp.a;
        }
        kv kvVar2 = kvVar;
        if (str2 == null) {
            str = "";
        } else {
            str = str2;
        }
        bgh bghVar2 = new bgh(d, j4, bizVar2, bivVar, biwVar, bipVar2, str, j5, bknVar, bkzVar2, bjyVar2, j7, bkvVar2, arlVar2, kvVar2);
        bgb bgbVar = bgmVar.c;
        if (a.m(bgbVar.a, Integer.MIN_VALUE)) {
            i = 5;
        } else {
            i = bgbVar.a;
        }
        int i6 = bgbVar.b;
        if (a.m(i6, 3)) {
            int ordinal = blnVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    i2 = 5;
                } else {
                    throw new mku();
                }
            } else {
                i2 = 4;
            }
        } else if (a.m(i6, Integer.MIN_VALUE)) {
            int ordinal2 = blnVar.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    i2 = 2;
                } else {
                    throw new mku();
                }
            } else {
                i2 = 1;
            }
        } else {
            i2 = i6;
        }
        if (bef.l(bgbVar.c)) {
            j3 = bgc.a;
        } else {
            j3 = bgbVar.c;
        }
        bla blaVar = bgbVar.d;
        if (blaVar == null) {
            blaVar = bla.a;
        }
        bge bgeVar = bgbVar.e;
        bkt bktVar = bgbVar.f;
        int i7 = bgbVar.g;
        if (true == a.m(i7, 0)) {
            i3 = 66305;
        } else {
            i3 = i7;
        }
        int i8 = bgbVar.h;
        if (true == a.m(i8, Integer.MIN_VALUE)) {
            i4 = 1;
        } else {
            i4 = i8;
        }
        blb blbVar = bgbVar.i;
        if (blbVar == null) {
            blbVar = blb.a;
        }
        return new bgm(bghVar2, new bgb(i, i2, j3, blaVar, bgeVar, bktVar, i3, i4, blbVar), bgmVar.d);
    }
}
