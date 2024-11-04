package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.compose.ui.draw.PainterElement;
import com.google.ar.core.ImageMetadata;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ri {
    public static boolean a(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.fingerprint");
    }

    public static final void b(atq atqVar, aox aoxVar, aon aonVar, avo avoVar, abi abiVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        abi b = abiVar.b(1142754848);
        if ((i & 6) == 0) {
            if (true != b.D(atqVar)) {
                i9 = 2;
            } else {
                i9 = 4;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != b.B(null)) {
                i8 = 16;
            } else {
                i8 = 32;
            }
            i2 |= i8;
        }
        if ((i & 384) == 0) {
            if (true != b.B(aoxVar)) {
                i7 = 128;
            } else {
                i7 = 256;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            if (true != b.B(aonVar)) {
                i6 = 1024;
            } else {
                i6 = 2048;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            if (true != b.B(avoVar)) {
                i5 = 8192;
            } else {
                i5 = 16384;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            if (true != b.y(1.0f)) {
                i4 = ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            } else {
                i4 = 131072;
            }
            i2 |= i4;
        }
        if ((1572864 & i) == 0) {
            if (true != b.B(null)) {
                i3 = ImageMetadata.LENS_APERTURE;
            } else {
                i3 = ImageMetadata.SHADING_MODE;
            }
            i2 |= i3;
        }
        if ((i2 & 599187) == 599186 && b.G()) {
            b.r();
        } else {
            b.u(449197769);
            aou aouVar = aox.d;
            abp abpVar = (abp) b;
            abpVar.U();
            aox a = fs.f(aoxVar.a(aouVar)).a(new PainterElement(atqVar, aonVar, avoVar));
            xs xsVar = xs.b;
            int a2 = abd.a(b);
            aox e = de.e(b, a);
            aek L = abpVar.L();
            int i10 = axu.a;
            b.v();
            if (abpVar.x) {
                b.k(new xr(1));
            } else {
                b.x();
            }
            agx.a(b, xsVar, axt.d);
            agx.a(b, L, axt.c);
            agx.a(b, e, axt.b);
            mol molVar = axt.e;
            if (abpVar.x || !amr.i(abpVar.P(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                abpVar.Z(valueOf);
                b.i(valueOf, molVar);
            }
            b.n();
        }
        afv d = b.d();
        if (d != null) {
            ((aeu) d).d = new aaa(atqVar, aoxVar, aonVar, avoVar, i, 1);
        }
    }

    public static final bip c(bio... bioVarArr) {
        return new bis(mkm.d(bioVarArr));
    }

    public static final dkr d(Context context) {
        int i;
        bym bymVar = new bym(context);
        if (Build.VERSION.SDK_INT >= 31) {
            i = context.getResources().getConfiguration().fontWeightAdjustment;
        } else {
            i = 0;
        }
        return new dkr(bymVar, new bif(i), bir.a, new biu(bir.b, 2), new bym((char[]) null));
    }
}
