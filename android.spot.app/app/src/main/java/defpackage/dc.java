package defpackage;

import android.R;
import android.content.Context;
import android.os.PowerManager;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(Locale locale) {
        return locale.toLanguageTag();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(PowerManager powerManager) {
        return powerManager.isPowerSaveMode();
    }

    public static final long c(long j, float f) {
        boolean z;
        double pow;
        int round;
        double d = f;
        boolean z2 = true;
        if (d < 1.0E-4d) {
            z = true;
        } else {
            z = false;
        }
        if (d <= 99.9999d) {
            z2 = false;
        }
        if (z | z2) {
            float f2 = (f + 16.0f) / 116.0f;
            float f3 = f2 * f2 * f2;
            if (f3 <= 0.008856452f) {
                f3 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
            }
            double d2 = (f3 * 100.0f) / 100.0f;
            if (d2 <= 0.0031308d) {
                pow = d2 * 12.92d;
            } else {
                pow = (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d;
            }
            double d3 = pow * 255.0d;
            if (!Double.isNaN(d3)) {
                if (d3 > 2.147483647E9d) {
                    round = Integer.MAX_VALUE;
                } else if (d3 < -2.147483648E9d) {
                    round = Integer.MIN_VALUE;
                } else {
                    round = (int) Math.round(d3);
                }
                int e = bpv.e(round, 0, 255);
                return jw.j(e, e, e);
            }
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        float[] fArr = aru.a;
        long e2 = aqx.e(j, aru.d);
        return aqx.e(jw.i(f, aqx.c(e2), aqx.b(e2), 0.0f, aru.d, 8), aru.c);
    }

    public static final aai d(Context context) {
        zv.a.a(context, R.color.Blue_700);
        zv.a.a(context, R.color.Blue_800);
        c(zv.a.a(context, R.color.Purple_800), 98.0f);
        c(zv.a.a(context, R.color.Purple_800), 96.0f);
        zv.a.a(context, R.color.GM2_grey_800);
        c(zv.a.a(context, R.color.Purple_800), 94.0f);
        c(zv.a.a(context, R.color.Purple_800), 92.0f);
        zv.a.a(context, R.color.Indigo_700);
        c(zv.a.a(context, R.color.Purple_800), 87.0f);
        zv.a.a(context, R.color.Indigo_800);
        zv.a.a(context, R.color.Pink_700);
        zv.a.a(context, R.color.Pink_800);
        zv.a.a(context, R.color.Purple_700);
        zv.a.a(context, R.color.Purple_800);
        zv.a.a(context, R.color.Red_700);
        c(zv.a.a(context, R.color.Purple_800), 24.0f);
        c(zv.a.a(context, R.color.Purple_800), 22.0f);
        zv.a.a(context, R.color.Red_800);
        c(zv.a.a(context, R.color.Purple_800), 17.0f);
        c(zv.a.a(context, R.color.Purple_800), 12.0f);
        zv.a.a(context, R.color.Teal_700);
        c(zv.a.a(context, R.color.Purple_800), 6.0f);
        c(zv.a.a(context, R.color.Purple_800), 4.0f);
        zv.a.a(context, R.color.Teal_800);
        long a = zv.a.a(context, R.color.accent_device_default);
        zv.a.a(context, R.color.accent_device_default_50);
        long c = c(zv.a.a(context, R.color.accessibility_focus_highlight), 98.0f);
        long c2 = c(zv.a.a(context, R.color.accessibility_focus_highlight), 96.0f);
        long a2 = zv.a.a(context, R.color.accent_device_default_700);
        long c3 = c(zv.a.a(context, R.color.accessibility_focus_highlight), 94.0f);
        long c4 = c(zv.a.a(context, R.color.accessibility_focus_highlight), 92.0f);
        long a3 = zv.a.a(context, R.color.accent_device_default_dark);
        long c5 = c(zv.a.a(context, R.color.accessibility_focus_highlight), 87.0f);
        long a4 = zv.a.a(context, R.color.accent_device_default_dark_60_percent_opacity);
        zv.a.a(context, R.color.accent_device_default_light);
        long a5 = zv.a.a(context, R.color.accent_material_dark);
        long a6 = zv.a.a(context, R.color.accent_material_light);
        zv.a.a(context, R.color.accessibility_focus_highlight);
        long a7 = zv.a.a(context, R.color.autofill_background_material_dark);
        long c6 = c(zv.a.a(context, R.color.accessibility_focus_highlight), 24.0f);
        long c7 = c(zv.a.a(context, R.color.accessibility_focus_highlight), 22.0f);
        long a8 = zv.a.a(context, R.color.autofill_background_material_light);
        long c8 = c(zv.a.a(context, R.color.accessibility_focus_highlight), 17.0f);
        long c9 = c(zv.a.a(context, R.color.accessibility_focus_highlight), 12.0f);
        long a9 = zv.a.a(context, R.color.autofilled_highlight);
        long c10 = c(zv.a.a(context, R.color.accessibility_focus_highlight), 6.0f);
        long c11 = c(zv.a.a(context, R.color.accessibility_focus_highlight), 4.0f);
        long a10 = zv.a.a(context, R.color.background_cache_hint_selector_device_default);
        long a11 = zv.a.a(context, R.color.background_cache_hint_selector_holo_dark);
        zv.a.a(context, R.color.background_cache_hint_selector_holo_light);
        zv.a.a(context, R.color.background_cache_hint_selector_material_dark);
        long a12 = zv.a.a(context, R.color.background_cache_hint_selector_material_light);
        long a13 = zv.a.a(context, R.color.background_device_default_dark);
        zv.a.a(context, R.color.background_device_default_light);
        zv.a.a(context, R.color.background_floating_device_default_dark);
        zv.a.a(context, R.color.background_floating_device_default_light);
        long a14 = zv.a.a(context, R.color.background_floating_material_dark);
        long a15 = zv.a.a(context, R.color.background_floating_material_light);
        long a16 = zv.a.a(context, R.color.background_holo_dark);
        long a17 = zv.a.a(context, R.color.background_holo_light);
        zv.a.a(context, R.color.background_leanback_dark);
        long a18 = zv.a.a(context, R.color.background_leanback_light);
        zv.a.a(context, R.color.background_material_dark);
        zv.a.a(context, R.color.background_material_light);
        long a19 = zv.a.a(context, R.color.bright_foreground_dark);
        long a20 = zv.a.a(context, R.color.bright_foreground_dark_disabled);
        zv.a.a(context, R.color.bright_foreground_dark_inverse);
        zv.a.a(context, R.color.bright_foreground_disabled_holo_dark);
        zv.a.a(context, R.color.bright_foreground_disabled_holo_light);
        long a21 = zv.a.a(context, R.color.bright_foreground_holo_dark);
        long a22 = zv.a.a(context, R.color.bright_foreground_holo_light);
        long a23 = zv.a.a(context, R.color.bright_foreground_inverse_holo_dark);
        long a24 = zv.a.a(context, R.color.bright_foreground_inverse_holo_light);
        zv.a.a(context, R.color.bright_foreground_light);
        long a25 = zv.a.a(context, R.color.bright_foreground_light_disabled);
        zv.a.a(context, R.color.bright_foreground_light_inverse);
        zv.a.a(context, R.color.btn_colored_background_material);
        long a26 = zv.a.a(context, R.color.btn_colored_borderless_text_material);
        long a27 = zv.a.a(context, R.color.btn_colored_text_material);
        zv.a.a(context, R.color.btn_default_material_dark);
        zv.a.a(context, R.color.btn_default_material_light);
        zv.a.a(context, R.color.btn_watch_default_dark);
        long a28 = zv.a.a(context, R.color.button_material_dark);
        long a29 = zv.a.a(context, R.color.button_material_light);
        long a30 = zv.a.a(context, R.color.button_normal_device_default_dark);
        long a31 = zv.a.a(context, R.color.car_accent);
        zv.a.a(context, R.color.car_accent_dark);
        return new aai(a, c, c2, a2, c3, c4, a3, c5, a4, a5, a6, a7, c6, c7, a8, c8, c9, a9, c10, c11, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, a29, a30, a31);
    }

    public static final boolean e(auf aufVar) {
        List list = aufVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!a.m(((aum) list.get(i)).i, 2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:10:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(defpackage.auy r7, defpackage.mmx r8) {
        /*
            boolean r0 = r8 instanceof defpackage.zi
            if (r0 == 0) goto L13
            r0 = r8
            zi r0 = (defpackage.zi) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            zi r0 = new zi
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.a
            mne r1 = defpackage.mne.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            auy r7 = r0.c
            defpackage.mjo.o(r8)
            goto L40
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.mjo.o(r8)
        L34:
            r0.c = r7
            r0.b = r3
            r8 = 2
            java.lang.Object r8 = r7.q(r8, r0)
            if (r8 != r1) goto L40
            return r1
        L40:
            auf r8 = (defpackage.auf) r8
            java.util.List r2 = r8.a
            int r4 = r2.size()
            r5 = 0
        L49:
            if (r5 >= r4) goto L5b
            java.lang.Object r6 = r2.get(r5)
            aum r6 = (defpackage.aum) r6
            boolean r6 = defpackage.lb.f(r6)
            if (r6 != 0) goto L58
            goto L34
        L58:
            int r5 = r5 + 1
            goto L49
        L5b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dc.f(auy, mmx):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c8 A[Catch: CancellationException -> 0x002f, TryCatch #0 {CancellationException -> 0x002f, blocks: (B:12:0x002a, B:13:0x00c0, B:15:0x00c8, B:17:0x00d5, B:19:0x00e1, B:21:0x00e4, B:24:0x00e7, B:26:0x00f1, B:30:0x00f7, B:34:0x0040, B:35:0x0064, B:37:0x0068, B:39:0x0080, B:41:0x008a, B:44:0x00a8, B:48:0x0093, B:49:0x009a, B:51:0x00a4, B:53:0x0047), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f7 A[Catch: CancellationException -> 0x002f, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x002f, blocks: (B:12:0x002a, B:13:0x00c0, B:15:0x00c8, B:17:0x00d5, B:19:0x00e1, B:21:0x00e4, B:24:0x00e7, B:26:0x00f1, B:30:0x00f7, B:34:0x0040, B:35:0x0064, B:37:0x0068, B:39:0x0080, B:41:0x008a, B:44:0x00a8, B:48:0x0093, B:49:0x009a, B:51:0x00a4, B:53:0x0047), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a A[Catch: CancellationException -> 0x002f, TryCatch #0 {CancellationException -> 0x002f, blocks: (B:12:0x002a, B:13:0x00c0, B:15:0x00c8, B:17:0x00d5, B:19:0x00e1, B:21:0x00e4, B:24:0x00e7, B:26:0x00f1, B:30:0x00f7, B:34:0x0040, B:35:0x0064, B:37:0x0068, B:39:0x0080, B:41:0x008a, B:44:0x00a8, B:48:0x0093, B:49:0x009a, B:51:0x00a4, B:53:0x0047), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a4 A[Catch: CancellationException -> 0x002f, TryCatch #0 {CancellationException -> 0x002f, blocks: (B:12:0x002a, B:13:0x00c0, B:15:0x00c8, B:17:0x00d5, B:19:0x00e1, B:21:0x00e4, B:24:0x00e7, B:26:0x00f1, B:30:0x00f7, B:34:0x0040, B:35:0x0064, B:37:0x0068, B:39:0x0080, B:41:0x008a, B:44:0x00a8, B:48:0x0093, B:49:0x009a, B:51:0x00a4, B:53:0x0047), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, avs] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(defpackage.auy r9, defpackage.yw r10, defpackage.auf r11, defpackage.mmx r12) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dc.g(auy, yw, auf, mmx):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, avs] */
    /* JADX WARN: Type inference failed for: r8v1, types: [bdi, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(defpackage.auy r11, defpackage.yx r12, defpackage.mjp r13, defpackage.auf r14, defpackage.mmx r15) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dc.h(auy, yx, mjp, auf, mmx):java.lang.Object");
    }
}
