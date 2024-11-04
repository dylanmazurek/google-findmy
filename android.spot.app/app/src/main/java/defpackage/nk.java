package defpackage;

import android.view.View;
import androidx.compose.ui.layout.LayoutElement;
import com.google.ar.core.ImageMetadata;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ba, code lost:            if (r2 == defpackage.abh.a) goto L60;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(defpackage.wi r22, defpackage.aox r23, defpackage.moh r24, defpackage.aon r25, defpackage.moh r26, defpackage.mon r27, defpackage.abi r28, int r29) {
        /*
            Method dump skipped, instructions count: 865
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk.b(wi, aox, moh, aon, moh, mon, abi, int):void");
    }

    public static final void c(Object obj, aox aoxVar, moh mohVar, aon aonVar, moh mohVar2, mon monVar, abi abiVar, int i) {
        int i2;
        aox aoxVar2;
        aon aonVar2;
        moh mohVar3;
        int i3;
        int i4;
        int i5;
        boolean D;
        int i6;
        int i7 = i & 6;
        abi b = abiVar.b(2132720749);
        if (i7 == 0) {
            if ((i & 8) == 0) {
                D = b.B(obj);
            } else {
                D = b.D(obj);
            }
            if (true != D) {
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
            if (true != b.D(mohVar)) {
                i5 = 128;
            } else {
                i5 = 256;
            }
            i8 |= i5;
        }
        int i9 = i8 | 3072;
        if ((i & 24576) == 0) {
            if (true != b.B("statusTextContent")) {
                i4 = 8192;
            } else {
                i4 = 16384;
            }
            i9 |= i4;
        }
        int i10 = 1572864 & i;
        int i11 = i9 | ImageMetadata.EDGE_MODE;
        if (i10 == 0) {
            if (true != b.D(monVar)) {
                i3 = ImageMetadata.LENS_APERTURE;
            } else {
                i3 = ImageMetadata.SHADING_MODE;
            }
            i11 |= i3;
        }
        if ((599187 & i11) == 599186 && b.G()) {
            b.r();
            aoxVar2 = aoxVar;
            aonVar2 = aonVar;
            mohVar3 = mohVar2;
        } else {
            aoxVar2 = aox.d;
            int i12 = aon.a;
            aonVar2 = aom.a;
            mohVar3 = mxb.b;
            int i13 = i11 >> 3;
            b(wl.a(obj, "statusTextContent", b, ((i11 >> 9) & 112) | (i11 & 14)), aoxVar2, mohVar, aonVar2, mohVar3, monVar, b, (i11 & 8176) | (57344 & i13) | (i13 & ImageMetadata.JPEG_GPS_COORDINATES));
        }
        afv d = b.d();
        if (d != null) {
            ((aeu) d).d = new th(obj, aoxVar2, mohVar, aonVar2, mohVar3, monVar, i, 1);
        }
    }

    public static final azd d(azd azdVar) {
        ayr ayrVar;
        ayr y = azdVar.y();
        while (true) {
            ayr o = y.o();
            ayr ayrVar2 = null;
            if (o != null) {
                ayrVar = o.e;
            } else {
                ayrVar = null;
            }
            if (ayrVar != null) {
                ayr o2 = y.o();
                if (o2 != null) {
                    ayrVar2 = o2.e;
                }
                ayrVar2.getClass();
                ayr o3 = y.o();
                o3.getClass();
                y = o3.e;
                y.getClass();
            } else {
                azd w = y.t().w();
                w.getClass();
                return w;
            }
        }
    }

    public static final aox e(aox aoxVar, mom momVar) {
        return aoxVar.a(new LayoutElement(momVar));
    }
}
