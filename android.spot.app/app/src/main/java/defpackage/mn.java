package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import com.google.android.apps.adm.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mn {
    private static mn b;
    private WeakHashMap c;
    private ta d;
    private tb e;
    private final WeakHashMap f = new WeakHashMap(0);
    private TypedValue g;
    private boolean h;
    private apv j;
    private static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static final sn i = new sn(6);

    public static synchronized PorterDuffColorFilter b(int i2, PorterDuff.Mode mode) {
        synchronized (mn.class) {
            sn snVar = i;
            PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) snVar.b(Integer.valueOf(sn.e(i2, mode)));
            if (porterDuffColorFilter == null) {
                PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i2, mode);
                return porterDuffColorFilter2;
            }
            return porterDuffColorFilter;
        }
    }

    public static synchronized mn e() {
        mn mnVar;
        synchronized (mn.class) {
            if (b == null) {
                mn mnVar2 = new mn();
                b = mnVar2;
                if (Build.VERSION.SDK_INT < 24) {
                    mnVar2.k("vector", new ml(2));
                    mnVar2.k("animated-vector", new ml(1));
                    mnVar2.k("animated-selector", new mk());
                    mnVar2.k("drawable", new ml(0));
                }
            }
            mnVar = b;
        }
        return mnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(android.graphics.drawable.Drawable r4, defpackage.na r5, int[] r6) {
        /*
            int[] r0 = r4.getState()
            android.graphics.drawable.Drawable r1 = r4.mutate()
            if (r1 != r4) goto L50
            boolean r1 = r4 instanceof android.graphics.drawable.LayerDrawable
            r2 = 0
            if (r1 == 0) goto L1d
            boolean r1 = r4.isStateful()
            if (r1 == 0) goto L1d
            int[] r1 = new int[r2]
            r4.setState(r1)
            r4.setState(r0)
        L1d:
            boolean r0 = r5.d
            r1 = 0
            if (r0 != 0) goto L2c
            boolean r0 = r5.c
            if (r0 == 0) goto L28
            r0 = r1
            goto L2e
        L28:
            r4.clearColorFilter()
            goto L47
        L2c:
            android.content.res.ColorStateList r0 = r5.a
        L2e:
            boolean r3 = r5.c
            if (r3 == 0) goto L35
            android.graphics.PorterDuff$Mode r5 = r5.b
            goto L37
        L35:
            android.graphics.PorterDuff$Mode r5 = defpackage.mn.a
        L37:
            if (r0 == 0) goto L44
            if (r5 != 0) goto L3c
            goto L44
        L3c:
            int r6 = r0.getColorForState(r6, r2)
            android.graphics.PorterDuffColorFilter r1 = b(r6, r5)
        L44:
            r4.setColorFilter(r1)
        L47:
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 23
            if (r5 > r6) goto L50
            r4.invalidateSelf()
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mn.g(android.graphics.drawable.Drawable, na, int[]):void");
    }

    private static long i(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private final synchronized Drawable j(Context context, long j) {
        WeakReference weakReference;
        sl slVar = (sl) this.f.get(context);
        if (slVar != null && (weakReference = (WeakReference) slVar.e(j)) != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            slVar.k(j);
        }
        return null;
    }

    private final void k(String str, mm mmVar) {
        if (this.d == null) {
            this.d = new ta();
        }
        this.d.put(str, mmVar);
    }

    private final synchronized void l(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            sl slVar = (sl) this.f.get(context);
            if (slVar == null) {
                slVar = new sl();
                this.f.put(context, slVar);
            }
            slVar.j(j, new WeakReference(constantState));
        }
    }

    public final synchronized ColorStateList a(Context context, int i2) {
        ColorStateList colorStateList;
        tb tbVar;
        WeakHashMap weakHashMap = this.c;
        ColorStateList colorStateList2 = null;
        if (weakHashMap != null && (tbVar = (tb) weakHashMap.get(context)) != null) {
            colorStateList = (ColorStateList) tc.a(tbVar, i2);
        } else {
            colorStateList = null;
        }
        if (colorStateList == null) {
            apv apvVar = this.j;
            if (apvVar != null) {
                if (i2 == R.drawable.abc_edit_text_material) {
                    colorStateList2 = bqx.e(context, R.color.abc_tint_edittext);
                } else if (i2 == R.drawable.abc_switch_track_mtrl_alpha) {
                    colorStateList2 = bqx.e(context, R.color.abc_tint_switch_track);
                } else if (i2 == R.drawable.abc_switch_thumb_material) {
                    int[][] iArr = new int[3];
                    int[] iArr2 = new int[3];
                    ColorStateList c = mx.c(context, R.attr.colorSwitchThumbNormal);
                    if (c != null && c.isStateful()) {
                        int[] iArr3 = mx.a;
                        iArr[0] = iArr3;
                        iArr2[0] = c.getColorForState(iArr3, 0);
                        iArr[1] = mx.d;
                        iArr2[1] = mx.b(context, R.attr.colorControlActivated);
                        iArr[2] = mx.e;
                        iArr2[2] = c.getDefaultColor();
                    } else {
                        iArr[0] = mx.a;
                        iArr2[0] = mx.a(context, R.attr.colorSwitchThumbNormal);
                        iArr[1] = mx.d;
                        iArr2[1] = mx.b(context, R.attr.colorControlActivated);
                        iArr[2] = mx.e;
                        iArr2[2] = mx.b(context, R.attr.colorSwitchThumbNormal);
                    }
                    colorStateList2 = new ColorStateList(iArr, iArr2);
                } else if (i2 == R.drawable.abc_btn_default_mtrl_shape) {
                    colorStateList2 = apv.d(context, mx.b(context, R.attr.colorButtonNormal));
                } else if (i2 == R.drawable.abc_btn_borderless_material) {
                    colorStateList2 = apv.d(context, 0);
                } else if (i2 == R.drawable.abc_btn_colored_material) {
                    colorStateList2 = apv.d(context, mx.b(context, R.attr.colorAccent));
                } else {
                    if (i2 != R.drawable.abc_spinner_mtrl_am_alpha && i2 != R.drawable.abc_spinner_textfield_background_material) {
                        if (apv.c((int[]) apvVar.b, i2)) {
                            colorStateList2 = mx.c(context, R.attr.colorControlNormal);
                        } else if (apv.c((int[]) apvVar.a, i2)) {
                            colorStateList2 = bqx.e(context, R.color.abc_tint_default);
                        } else if (apv.c((int[]) apvVar.f, i2)) {
                            colorStateList2 = bqx.e(context, R.color.abc_tint_btn_checkable);
                        } else if (i2 == R.drawable.abc_seekbar_thumb_material) {
                            colorStateList2 = bqx.e(context, R.color.abc_tint_seek_thumb);
                            i2 = R.drawable.abc_seekbar_thumb_material;
                        }
                    }
                    colorStateList2 = bqx.e(context, R.color.abc_tint_spinner);
                }
            }
            if (colorStateList2 != null) {
                if (this.c == null) {
                    this.c = new WeakHashMap();
                }
                tb tbVar2 = (tb) this.c.get(context);
                if (tbVar2 == null) {
                    tbVar2 = new tb();
                    this.c.put(context, tbVar2);
                }
                tbVar2.f(i2, colorStateList2);
                return colorStateList2;
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final synchronized Drawable c(Context context, int i2) {
        return d(context, i2, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0185, code lost:            defpackage.bsc.h(r0, r7);     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ec A[Catch: all -> 0x027f, TryCatch #1 {, blocks: (B:4:0x0007, B:7:0x002d, B:9:0x0033, B:11:0x0039, B:13:0x003d, B:16:0x004d, B:19:0x005e, B:21:0x0062, B:22:0x0069, B:27:0x00ec, B:29:0x00f0, B:30:0x00f7, B:33:0x010c, B:37:0x0155, B:41:0x0117, B:43:0x0134, B:45:0x013e, B:47:0x0148, B:49:0x0160, B:51:0x0166, B:53:0x016c, B:57:0x0185, B:60:0x0270, B:66:0x0181, B:67:0x018b, B:71:0x01a2, B:75:0x01d4, B:77:0x0202, B:81:0x0255, B:83:0x0266, B:84:0x0215, B:87:0x0225, B:89:0x0232, B:93:0x023c, B:101:0x007d, B:103:0x0081, B:106:0x008f, B:107:0x0097, B:112:0x00a0, B:113:0x00a7, B:115:0x00a8, B:117:0x00bb, B:119:0x00c5, B:121:0x00cf, B:123:0x00d8, B:124:0x0057, B:126:0x000e, B:128:0x0019, B:130:0x001d, B:132:0x0275, B:133:0x027e), top: B:3:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0155 A[Catch: all -> 0x027f, TryCatch #1 {, blocks: (B:4:0x0007, B:7:0x002d, B:9:0x0033, B:11:0x0039, B:13:0x003d, B:16:0x004d, B:19:0x005e, B:21:0x0062, B:22:0x0069, B:27:0x00ec, B:29:0x00f0, B:30:0x00f7, B:33:0x010c, B:37:0x0155, B:41:0x0117, B:43:0x0134, B:45:0x013e, B:47:0x0148, B:49:0x0160, B:51:0x0166, B:53:0x016c, B:57:0x0185, B:60:0x0270, B:66:0x0181, B:67:0x018b, B:71:0x01a2, B:75:0x01d4, B:77:0x0202, B:81:0x0255, B:83:0x0266, B:84:0x0215, B:87:0x0225, B:89:0x0232, B:93:0x023c, B:101:0x007d, B:103:0x0081, B:106:0x008f, B:107:0x0097, B:112:0x00a0, B:113:0x00a7, B:115:0x00a8, B:117:0x00bb, B:119:0x00c5, B:121:0x00cf, B:123:0x00d8, B:124:0x0057, B:126:0x000e, B:128:0x0019, B:130:0x001d, B:132:0x0275, B:133:0x027e), top: B:3:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0160 A[Catch: all -> 0x027f, TryCatch #1 {, blocks: (B:4:0x0007, B:7:0x002d, B:9:0x0033, B:11:0x0039, B:13:0x003d, B:16:0x004d, B:19:0x005e, B:21:0x0062, B:22:0x0069, B:27:0x00ec, B:29:0x00f0, B:30:0x00f7, B:33:0x010c, B:37:0x0155, B:41:0x0117, B:43:0x0134, B:45:0x013e, B:47:0x0148, B:49:0x0160, B:51:0x0166, B:53:0x016c, B:57:0x0185, B:60:0x0270, B:66:0x0181, B:67:0x018b, B:71:0x01a2, B:75:0x01d4, B:77:0x0202, B:81:0x0255, B:83:0x0266, B:84:0x0215, B:87:0x0225, B:89:0x0232, B:93:0x023c, B:101:0x007d, B:103:0x0081, B:106:0x008f, B:107:0x0097, B:112:0x00a0, B:113:0x00a7, B:115:0x00a8, B:117:0x00bb, B:119:0x00c5, B:121:0x00cf, B:123:0x00d8, B:124:0x0057, B:126:0x000e, B:128:0x0019, B:130:0x001d, B:132:0x0275, B:133:0x027e), top: B:3:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0166 A[Catch: all -> 0x027f, TryCatch #1 {, blocks: (B:4:0x0007, B:7:0x002d, B:9:0x0033, B:11:0x0039, B:13:0x003d, B:16:0x004d, B:19:0x005e, B:21:0x0062, B:22:0x0069, B:27:0x00ec, B:29:0x00f0, B:30:0x00f7, B:33:0x010c, B:37:0x0155, B:41:0x0117, B:43:0x0134, B:45:0x013e, B:47:0x0148, B:49:0x0160, B:51:0x0166, B:53:0x016c, B:57:0x0185, B:60:0x0270, B:66:0x0181, B:67:0x018b, B:71:0x01a2, B:75:0x01d4, B:77:0x0202, B:81:0x0255, B:83:0x0266, B:84:0x0215, B:87:0x0225, B:89:0x0232, B:93:0x023c, B:101:0x007d, B:103:0x0081, B:106:0x008f, B:107:0x0097, B:112:0x00a0, B:113:0x00a7, B:115:0x00a8, B:117:0x00bb, B:119:0x00c5, B:121:0x00cf, B:123:0x00d8, B:124:0x0057, B:126:0x000e, B:128:0x0019, B:130:0x001d, B:132:0x0275, B:133:0x027e), top: B:3:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0270 A[Catch: all -> 0x027f, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0007, B:7:0x002d, B:9:0x0033, B:11:0x0039, B:13:0x003d, B:16:0x004d, B:19:0x005e, B:21:0x0062, B:22:0x0069, B:27:0x00ec, B:29:0x00f0, B:30:0x00f7, B:33:0x010c, B:37:0x0155, B:41:0x0117, B:43:0x0134, B:45:0x013e, B:47:0x0148, B:49:0x0160, B:51:0x0166, B:53:0x016c, B:57:0x0185, B:60:0x0270, B:66:0x0181, B:67:0x018b, B:71:0x01a2, B:75:0x01d4, B:77:0x0202, B:81:0x0255, B:83:0x0266, B:84:0x0215, B:87:0x0225, B:89:0x0232, B:93:0x023c, B:101:0x007d, B:103:0x0081, B:106:0x008f, B:107:0x0097, B:112:0x00a0, B:113:0x00a7, B:115:0x00a8, B:117:0x00bb, B:119:0x00c5, B:121:0x00cf, B:123:0x00d8, B:124:0x0057, B:126:0x000e, B:128:0x0019, B:130:0x001d, B:132:0x0275, B:133:0x027e), top: B:3:0x0007, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.graphics.drawable.Drawable d(android.content.Context r17, int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mn.d(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized void f(Context context) {
        sl slVar = (sl) this.f.get(context);
        if (slVar != null) {
            slVar.i();
        }
    }

    public final synchronized void h(apv apvVar) {
        this.j = apvVar;
    }
}
