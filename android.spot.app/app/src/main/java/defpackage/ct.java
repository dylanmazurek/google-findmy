package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcelable;
import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import com.google.ar.core.ImageMetadata;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ct {
    public static LocaleList a(String str) {
        LocaleList forLanguageTags;
        forLanguageTags = LocaleList.forLanguageTags(str);
        return forLanguageTags;
    }

    public static Object b(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ce.c(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final int c(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static final void d(String str, aox aoxVar, bgm bgmVar, int i, boolean z, int i2, int i3, abi abiVar, int i4) {
        int i5;
        int i6;
        int i7;
        abp abpVar;
        abi abiVar2;
        int i8;
        aox a;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = i4 & 6;
        abi b = abiVar.b(-1186827822);
        if (i17 == 0) {
            if (true != b.B(str)) {
                i16 = 2;
            } else {
                i16 = 4;
            }
            i5 = i16 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (true != b.B(aoxVar)) {
                i15 = 16;
            } else {
                i15 = 32;
            }
            i5 |= i15;
        }
        if ((i4 & 384) == 0) {
            if (true != b.B(bgmVar)) {
                i14 = 128;
            } else {
                i14 = 256;
            }
            i5 |= i14;
        }
        yv yvVar = null;
        if ((i4 & 3072) == 0) {
            if (true != b.D(null)) {
                i13 = 1024;
            } else {
                i13 = 2048;
            }
            i5 |= i13;
        }
        if ((i4 & 24576) == 0) {
            if (true != b.z(i)) {
                i12 = 8192;
            } else {
                i12 = 16384;
            }
            i5 |= i12;
        }
        if ((196608 & i4) == 0) {
            if (true != b.C(z)) {
                i11 = ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            } else {
                i11 = 131072;
            }
            i5 |= i11;
        }
        if ((1572864 & i4) == 0) {
            if (true != b.z(i2)) {
                i10 = ImageMetadata.LENS_APERTURE;
            } else {
                i10 = ImageMetadata.SHADING_MODE;
            }
            i5 |= i10;
        }
        if ((12582912 & i4) == 0) {
            if (true != b.z(i3)) {
                i9 = 4194304;
            } else {
                i9 = 8388608;
            }
            i5 |= i9;
        }
        if (((i5 | 100663296) & 38347923) == 38347922 && b.G()) {
            b.r();
            abiVar2 = b;
            i8 = i3;
        } else {
            if (i3 > 0) {
                i7 = 0;
                if (i2 > 0) {
                    zn znVar = (zn) b.f(zo.a);
                    b.u(-328360224);
                    if (znVar != null) {
                        long j = ((zp) b.f(zq.a)).a;
                        Object[] objArr = {znVar};
                        amk amkVar = new amk(new yj(znVar, 2), wo.k);
                        boolean D = b.D(znVar);
                        abp abpVar2 = (abp) b;
                        Object P = abpVar2.P();
                        if (D || P == abh.a) {
                            P = new ob(znVar, 9);
                            abpVar2.Z(P);
                        }
                        long longValue = ((Number) aly.b(objArr, amkVar, (mnw) P, b, 0, 4)).longValue();
                        boolean A = b.A(longValue) | b.B(znVar) | b.A(j);
                        Object P2 = abpVar2.P();
                        if (A || P2 == abh.a) {
                            P2 = new yv(longValue, znVar, yy.a);
                            abpVar2.Z(P2);
                        }
                        yvVar = (yv) P2;
                    }
                    abp abpVar3 = (abp) b;
                    abpVar3.U();
                    if (yvVar == null) {
                        b.u(-1587866335);
                        a = jw.c(aoxVar, 0.0f, 0.0f, 0.0f, false, 131071).a(new TextStringSimpleElement(str, bgmVar, (dkr) b.f(bcg.b), i, z, i2));
                        abpVar3.U();
                        abpVar = abpVar3;
                        abiVar2 = b;
                        i8 = i3;
                    } else {
                        b.u(-1588564052);
                        abpVar = abpVar3;
                        abiVar2 = b;
                        i8 = i3;
                        a = jw.c(aoxVar, 0.0f, 0.0f, 0.0f, false, 131071).a(yvVar.d).a(new SelectableTextAnnotatedStringElement(new bfs(str), bgmVar, (dkr) b.f(bcg.b), i, z, i2, yvVar));
                        abpVar.U();
                    }
                    yp ypVar = yp.a;
                    int a2 = abd.a(abiVar2);
                    aox e = de.e(abiVar2, a);
                    aek L = abpVar.L();
                    int i18 = axu.a;
                    abiVar2.v();
                    if (abpVar.x) {
                        abiVar2.k(new xr(3));
                    } else {
                        abiVar2.x();
                    }
                    agx.a(abiVar2, ypVar, axt.d);
                    agx.a(abiVar2, L, axt.c);
                    agx.a(abiVar2, e, axt.b);
                    mol molVar = axt.e;
                    if (abpVar.x || !amr.i(abpVar.P(), Integer.valueOf(a2))) {
                        Integer valueOf = Integer.valueOf(a2);
                        abpVar.Z(valueOf);
                        abiVar2.i(valueOf, molVar);
                    }
                    abiVar2.n();
                } else {
                    i6 = i3;
                }
            } else {
                i6 = i3;
                i7 = i2;
            }
            throw new IllegalArgumentException(a.aj(i7, i6, "both minLines ", " and maxLines ", " must be greater than zero"));
        }
        afv d = abiVar2.d();
        if (d != null) {
            ((aeu) d).d = new yo(str, aoxVar, bgmVar, i, z, i2, i3, i4);
        }
    }
}
