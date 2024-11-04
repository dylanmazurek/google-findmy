package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;
import com.google.ar.core.ImageMetadata;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nq {
    public static void a(View view, Rect rect, Rect rect2) {
        Insets of;
        WindowInsets.Builder systemWindowInsets;
        WindowInsets build;
        Insets systemWindowInsets2;
        int i;
        int i2;
        int i3;
        int i4;
        WindowInsets.Builder builder = new WindowInsets.Builder();
        of = Insets.of(rect);
        systemWindowInsets = builder.setSystemWindowInsets(of);
        build = systemWindowInsets.build();
        systemWindowInsets2 = view.computeSystemWindowInsets(build, rect2).getSystemWindowInsets();
        i = systemWindowInsets2.left;
        i2 = systemWindowInsets2.top;
        i3 = systemWindowInsets2.right;
        i4 = systemWindowInsets2.bottom;
        rect.set(i, i2, i3, i4);
    }

    public static final void b(wi wiVar, moh mohVar, aox aoxVar, uf ufVar, ug ugVar, mom momVar, abi abiVar, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i & 6;
        abi b = abiVar.b(429978603);
        if (i9 == 0) {
            if (true != b.B(wiVar)) {
                i8 = 2;
            } else {
                i8 = 4;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != b.D(mohVar)) {
                i7 = 16;
            } else {
                i7 = 32;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if (true != b.B(aoxVar)) {
                i6 = 128;
            } else {
                i6 = 256;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (true != b.B(ufVar)) {
                i5 = 1024;
            } else {
                i5 = 2048;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (true != b.B(ugVar)) {
                i4 = 8192;
            } else {
                i4 = 16384;
            }
            i2 |= i4;
        }
        if ((i & ImageMetadata.EDGE_MODE) == 0) {
            if (true != b.D(momVar)) {
                i3 = ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            } else {
                i3 = 131072;
            }
            i2 |= i3;
        }
        if ((74899 & i2) == 74898 && b.G()) {
            b.r();
        } else {
            int i10 = i2 & 112;
            boolean z2 = false;
            if (i10 == 32) {
                z = true;
            } else {
                z = false;
            }
            int i11 = i2 & 14;
            if (i11 == 4) {
                z2 = true;
            }
            abp abpVar = (abp) b;
            Object P = abpVar.P();
            if ((z | z2) || P == abh.a) {
                P = new bkl(mohVar, wiVar, 1);
                abpVar.Z(P);
            }
            int i12 = 57344 & i2;
            d(wiVar, mohVar, nk.e(aoxVar, (mom) P), ufVar, ugVar, tu.a, momVar, b, 196608 | i11 | i10 | (i2 & 7168) | i12 | ((i2 << 6) & 29360128));
        }
        afv d = b.d();
        if (d != null) {
            ((aeu) d).d = new th(wiVar, mohVar, aoxVar, ufVar, ugVar, momVar, i, 2);
        }
    }

    public static final boolean c(wi wiVar) {
        if (wiVar.d() == ub.PostExit && wiVar.e() == ub.PostExit) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(defpackage.wi r26, defpackage.moh r27, defpackage.aox r28, defpackage.uf r29, defpackage.ug r30, defpackage.mol r31, defpackage.mom r32, defpackage.abi r33, int r34) {
        /*
            Method dump skipped, instructions count: 1167
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nq.d(wi, moh, aox, uf, ug, mol, mom, abi, int):void");
    }

    public static final void e(boolean z, aox aoxVar, uf ufVar, ug ugVar, String str, mom momVar, abi abiVar, int i) {
        int i2;
        aox aoxVar2;
        String str2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i & 6;
        abi b = abiVar.b(2088733774);
        if (i7 == 0) {
            if (true != b.C(z)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        int i8 = i2 | 48;
        if ((i & 384) == 0) {
            if (true != b.B(ufVar)) {
                i5 = 128;
            } else {
                i5 = 256;
            }
            i8 |= i5;
        }
        if ((i & 3072) == 0) {
            if (true != b.B(ugVar)) {
                i4 = 1024;
            } else {
                i4 = 2048;
            }
            i8 |= i4;
        }
        int i9 = i8 | 24576;
        if ((196608 & i) == 0) {
            if (true != b.D(momVar)) {
                i3 = ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            } else {
                i3 = 131072;
            }
            i9 |= i3;
        }
        if ((74899 & i9) == 74898 && b.G()) {
            b.r();
            aoxVar2 = aoxVar;
            str2 = str;
        } else {
            aoxVar2 = aox.d;
            int i10 = i9 << 3;
            str2 = "AnimatedVisibility";
            b(wl.a(Boolean.valueOf(z), "AnimatedVisibility", b, (i9 & 14) | ((i9 >> 9) & 112)), ts.a, aoxVar2, ufVar, ugVar, momVar, b, (i9 & ImageMetadata.JPEG_GPS_COORDINATES) | (i10 & 57344) | (i10 & 896) | 48 | (i10 & 7168));
        }
        afv d = b.d();
        if (d != null) {
            ((aeu) d).d = new tt(z, aoxVar2, ufVar, ugVar, str2, momVar, i);
        }
    }

    public static final long f(float f, float f2) {
        long floatToRawIntBits = Float.floatToRawIntBits(f);
        long floatToRawIntBits2 = Float.floatToRawIntBits(f2);
        int i = aww.a;
        return (floatToRawIntBits2 & 4294967295L) | (floatToRawIntBits << 32);
    }

    public static final long g(long j, long j2) {
        return a.k(aqn.b(j) * aww.a(j2), aqn.a(j) * aww.b(j2));
    }

    public static awi h(awj awjVar, int i, int i2, Map map, moh mohVar) {
        return awjVar.o(i, i2, map, mohVar);
    }

    public static /* synthetic */ awi i(awj awjVar, int i, int i2, moh mohVar) {
        return awjVar.cd(i, i2, mly.a, mohVar);
    }

    private static final ub j(wi wiVar, moh mohVar, Object obj, abi abiVar) {
        ub ubVar;
        abiVar.t(-902048200, wiVar);
        if (wiVar.s()) {
            if (((Boolean) mohVar.a(obj)).booleanValue()) {
                ubVar = ub.Visible;
            } else if (((Boolean) mohVar.a(wiVar.d())).booleanValue()) {
                ubVar = ub.PostExit;
            } else {
                ubVar = ub.PreEnter;
            }
        } else {
            abp abpVar = (abp) abiVar;
            Object P = abpVar.P();
            if (P == abh.a) {
                aee aeeVar = new aee(false, agw.a);
                abpVar.Z(aeeVar);
                P = aeeVar;
            }
            adt adtVar = (adt) P;
            if (((Boolean) mohVar.a(wiVar.d())).booleanValue()) {
                adtVar.h(true);
            }
            if (((Boolean) mohVar.a(obj)).booleanValue()) {
                ubVar = ub.Visible;
            } else if (((Boolean) adtVar.a()).booleanValue()) {
                ubVar = ub.PostExit;
            } else {
                ubVar = ub.PreEnter;
            }
        }
        ((abp) abiVar).U();
        return ubVar;
    }
}
