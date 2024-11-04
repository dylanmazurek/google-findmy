package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import android.view.KeyEvent;
import androidx.core.graphics.drawable.IconCompat;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bse {
    public static Drawable a(Icon icon, Context context) {
        Drawable loadDrawable;
        loadDrawable = icon.loadDrawable(context);
        return loadDrawable;
    }

    public static Icon b(IconCompat iconCompat, Context context) {
        Icon createWithBitmap;
        switch (iconCompat.b) {
            case -1:
                return fr$$ExternalSyntheticApiModelOutline0.m102m(iconCompat.c);
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.c);
                break;
            case 2:
                createWithBitmap = Icon.createWithResource(iconCompat.l(), iconCompat.f);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) iconCompat.c, iconCompat.f, iconCompat.g);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) iconCompat.c);
                break;
            case 5:
                if (Build.VERSION.SDK_INT < 26) {
                    createWithBitmap = Icon.createWithBitmap(IconCompat.d((Bitmap) iconCompat.c, false));
                    break;
                } else {
                    createWithBitmap = bsf.b((Bitmap) iconCompat.c);
                    break;
                }
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    createWithBitmap = bsh.a(iconCompat.g());
                    break;
                } else if (context != null) {
                    InputStream k = iconCompat.k(context);
                    if (k != null) {
                        if (Build.VERSION.SDK_INT < 26) {
                            createWithBitmap = Icon.createWithBitmap(IconCompat.d(BitmapFactory.decodeStream(k), false));
                            break;
                        } else {
                            createWithBitmap = bsf.b(BitmapFactory.decodeStream(k));
                            break;
                        }
                    } else {
                        Uri g = iconCompat.g();
                        Objects.toString(g);
                        throw new IllegalStateException("Cannot load adaptive icon from uri: ".concat(String.valueOf(g)));
                    }
                } else {
                    Uri g2 = iconCompat.g();
                    Objects.toString(g2);
                    throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: ".concat(String.valueOf(g2)));
                }
        }
        ColorStateList colorStateList = iconCompat.h;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.i;
        if (mode != IconCompat.a) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public static Uri c(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return bsg.c(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        }
    }

    public static boolean d(Editable editable, KeyEvent keyEvent, boolean z) {
        ccz[] cczVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (!j(selectionStart, selectionEnd) && (cczVarArr = (ccz[]) editable.getSpans(selectionStart, selectionEnd, ccz.class)) != null && (cczVarArr.length) > 0) {
                for (ccz cczVar : cczVarArr) {
                    int spanStart = editable.getSpanStart(cczVar);
                    int spanEnd = editable.getSpanEnd(cczVar);
                    if (z) {
                        if (spanStart == selectionStart) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                        if (selectionStart <= spanStart && selectionStart < spanEnd) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                    } else {
                        if (spanEnd == selectionStart) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                        if (selectionStart <= spanStart) {
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0041, code lost:            if (java.lang.Character.isHighSurrogate(r5) != false) goto L128;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x007c, code lost:            if (java.lang.Character.isLowSurrogate(r5) != false) goto L153;     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x006f, code lost:            if (r11 != false) goto L162;     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x009f, code lost:            if (r10 != (-1)) goto L167;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean e(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bse.e(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public static final lqc f(lqc lqcVar) {
        if (lqcVar != null && lqcVar.b == 10) {
            return lqcVar;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0065, code lost:            if (r1.b != 0) goto L99;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.lps g(defpackage.eeb r8) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bse.g(eeb):lps");
    }

    public static final String h(long j) {
        String format = DateFormat.getTimeInstance(3).format(Long.valueOf((j / 1000) * 1000));
        format.getClass();
        return format;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object i(defpackage.lqc r5, defpackage.kuv r6, defpackage.mmx r7) {
        /*
            boolean r0 = r7 instanceof defpackage.edq
            if (r0 == 0) goto L13
            r0 = r7
            edq r0 = (defpackage.edq) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            edq r0 = new edq
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.a
            mne r1 = defpackage.mne.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.mjo.o(r7)
            goto L81
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.mjo.o(r7)
            lqd r7 = r5.d
            if (r7 != 0) goto L38
            lqd r7 = defpackage.lqd.d
        L38:
            int r2 = r7.a
            r4 = 5
            if (r2 != r4) goto L42
            java.lang.Object r7 = r7.b
            lql r7 = (defpackage.lql) r7
            goto L44
        L42:
            lql r7 = defpackage.lql.c
        L44:
            int r7 = r7.a
            int r7 = defpackage.hzc.aj(r7)
            r2 = 0
            if (r7 == 0) goto Laa
            int r7 = r7 + (-1)
            if (r7 == 0) goto L8c
            if (r7 == r3) goto L55
            r1 = r2
            goto La9
        L55:
            int r7 = r5.b
            r2 = 10
            if (r7 != r2) goto L60
            java.lang.Object r5 = r5.c
            lpw r5 = (defpackage.lpw) r5
            goto L62
        L60:
            lpw r5 = defpackage.lpw.i
        L62:
            lpz r5 = r5.h
            if (r5 != 0) goto L68
            lpz r5 = defpackage.lpz.e
        L68:
            kyf r5 = r5.b
            if (r5 != 0) goto L6e
            kyf r5 = defpackage.kyf.r
        L6e:
            kyq r5 = r5.f
            if (r5 != 0) goto L74
            kyq r5 = defpackage.kyq.g
        L74:
            jyz r5 = r6.s(r5)
            r0.b = r3
            java.lang.Object r7 = defpackage.mpd.p(r5, r0)
            if (r7 != r1) goto L81
            goto La9
        L81:
            iiy r7 = (defpackage.iiy) r7
            jer r5 = r7.b
            java.lang.Object r5 = r5.f()
            lim r5 = (defpackage.lim) r5
            return r5
        L8c:
            lqd r5 = r5.d
            if (r5 != 0) goto L92
            lqd r5 = defpackage.lqd.d
        L92:
            int r6 = r5.a
            if (r6 != r4) goto L9b
            java.lang.Object r5 = r5.b
            lql r5 = (defpackage.lql) r5
            goto L9d
        L9b:
            lql r5 = defpackage.lql.c
        L9d:
            int r6 = r5.a
            if (r6 != r3) goto La7
            java.lang.Object r5 = r5.b
            r1 = r5
            lim r1 = (defpackage.lim) r1
            goto La9
        La7:
            lim r1 = defpackage.lim.b
        La9:
            return r1
        Laa:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bse.i(lqc, kuv, mmx):java.lang.Object");
    }

    private static boolean j(int i, int i2) {
        if (i != -1 && i2 != -1 && i == i2) {
            return false;
        }
        return true;
    }
}
