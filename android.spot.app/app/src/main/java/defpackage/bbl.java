package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bbl implements ViewTranslationCallback {
    public static final bbl a = new bbl();

    private bbl() {
    }

    @Override // android.view.translation.ViewTranslationCallback
    public final boolean onClearTranslation(View view) {
        int i;
        view.getClass();
        apk apkVar = ((baw) view).i;
        apkVar.f = 1;
        se g = apkVar.g();
        Object[] objArr = g.c;
        long[] jArr = g.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            bfe bfeVar = ((bfh) ((bfi) objArr[(i2 << 3) + i4]).a).c;
                            bfn bfnVar = bfj.a;
                            if (bej.b(bfeVar, bfj.u) != null) {
                                bfn bfnVar2 = bfd.a;
                                bev bevVar = (bev) bej.b(bfeVar, bfd.k);
                                if (bevVar != null) {
                                }
                            }
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return true;
    }

    @Override // android.view.translation.ViewTranslationCallback
    public final boolean onHideTranslation(View view) {
        int i;
        view.getClass();
        apk apkVar = ((baw) view).i;
        apkVar.f = 1;
        se g = apkVar.g();
        Object[] objArr = g.c;
        long[] jArr = g.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            bfe bfeVar = ((bfh) ((bfi) objArr[(i2 << 3) + i4]).a).c;
                            bfn bfnVar = bfj.a;
                            if (amr.i(bej.b(bfeVar, bfj.u), true)) {
                                bfn bfnVar2 = bfd.a;
                                bev bevVar = (bev) bej.b(bfeVar, bfd.j);
                                if (bevVar != null) {
                                }
                            }
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return true;
    }

    @Override // android.view.translation.ViewTranslationCallback
    public final boolean onShowTranslation(View view) {
        int i;
        view.getClass();
        apk apkVar = ((baw) view).i;
        apkVar.f = 2;
        se g = apkVar.g();
        Object[] objArr = g.c;
        long[] jArr = g.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            bfe bfeVar = ((bfh) ((bfi) objArr[(i2 << 3) + i4]).a).c;
                            bfn bfnVar = bfj.a;
                            if (amr.i(bej.b(bfeVar, bfj.u), false)) {
                                bfn bfnVar2 = bfd.a;
                                bev bevVar = (bev) bej.b(bfeVar, bfd.j);
                                if (bevVar != null) {
                                }
                            }
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return true;
    }
}
