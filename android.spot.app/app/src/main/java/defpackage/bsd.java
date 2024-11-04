package defpackage;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsd {
    public static int a(Drawable drawable) {
        int layoutDirection;
        layoutDirection = drawable.getLayoutDirection();
        return layoutDirection;
    }

    public static boolean b(Drawable drawable, int i) {
        boolean layoutDirection;
        layoutDirection = drawable.setLayoutDirection(i);
        return layoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(java.io.File r4, defpackage.moh r5, defpackage.mmx r6) {
        /*
            boolean r0 = r6 instanceof defpackage.cbt
            if (r0 == 0) goto L13
            r0 = r6
            cbt r0 = (defpackage.cbt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbt r0 = new cbt
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            mne r1 = defpackage.mne.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.a
            defpackage.mjo.o(r6)     // Catch: java.io.IOException -> L29
            goto L41
        L29:
            r5 = move-exception
            goto L42
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.mjo.o(r6)
            r0.a = r4     // Catch: java.io.IOException -> L29
            r0.c = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r6 = r5.a(r0)     // Catch: java.io.IOException -> L29
            if (r6 != r1) goto L41
            return r1
        L41:
            return r6
        L42:
            boolean r6 = r5 instanceof defpackage.cak
            if (r6 != 0) goto La8
            r4.getClass()
            java.io.File r4 = (java.io.File) r4
            boolean r6 = r4.exists()
            if (r6 == 0) goto La3
            boolean r6 = r4.isFile()
            if (r6 == 0) goto L7d
            boolean r6 = r4.canRead()
            if (r6 == 0) goto L6d
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L68
            java.io.IOException r4 = defpackage.bsc.j(r4, r5)
            goto La7
        L68:
            java.io.IOException r4 = defpackage.bsc.j(r4, r5)
            goto La7
        L6d:
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L78
            java.io.IOException r4 = defpackage.bsc.j(r4, r5)
            goto La7
        L78:
            java.io.IOException r4 = defpackage.bsc.j(r4, r5)
            goto La7
        L7d:
            boolean r6 = r4.canRead()
            if (r6 == 0) goto L93
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L8e
            java.io.IOException r4 = defpackage.bsc.j(r4, r5)
            goto La7
        L8e:
            java.io.IOException r4 = defpackage.bsc.j(r4, r5)
            goto La7
        L93:
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L9e
            java.io.IOException r4 = defpackage.bsc.j(r4, r5)
            goto La7
        L9e:
            java.io.IOException r4 = defpackage.bsc.j(r4, r5)
            goto La7
        La3:
            java.io.IOException r4 = defpackage.bsc.j(r4, r5)
        La7:
            throw r4
        La8:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsd.c(java.io.File, moh, mmx):java.lang.Object");
    }

    public static final ecy d(eda edaVar) {
        String str;
        ecx ecxVar = new ecx(null);
        ecxVar.c = (String) edaVar.c.e("");
        int i = edaVar.g;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    if (i2 == 3) {
                        ecxVar.c(R.string.stop_ring);
                        ecxVar.b(R.drawable.gs_pause_vd_theme_24);
                        ecxVar.a(false);
                    }
                } else if (edaVar.a) {
                    ecxVar.c(R.string.stop_ring);
                    ecxVar.b(R.drawable.gs_pause_vd_theme_24);
                    ecxVar.a(true);
                } else {
                    ecxVar.c(R.string.ringing);
                    ecxVar.b(R.drawable.gs_graphic_eq_vd_theme_24);
                    ecxVar.a(false);
                }
            } else {
                ecxVar.c(R.string.ring);
                ecxVar.b(R.drawable.gs_graphic_eq_vd_theme_24);
                ecxVar.a(true);
            }
            if (edaVar.e.g()) {
                ecxVar.e = jer.i(Integer.valueOf(Math.max(1, (int) Duration.ofMillis(((Long) edaVar.e.c()).longValue()).minusMillis(SystemClock.elapsedRealtime()).toMinutes())));
            }
            if (ecxVar.f == 7 && (str = ecxVar.c) != null) {
                return new ecy(ecxVar.a, ecxVar.b, str, ecxVar.d, ecxVar.e);
            }
            StringBuilder sb = new StringBuilder();
            if ((ecxVar.f & 1) == 0) {
                sb.append(" ringButtonText");
            }
            if ((ecxVar.f & 2) == 0) {
                sb.append(" ringButtonIconDrawable");
            }
            if (ecxVar.c == null) {
                sb.append(" explanationMessage");
            }
            if ((ecxVar.f & 4) == 0) {
                sb.append(" ringButtonEnabled");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        throw null;
    }

    public static /* synthetic */ String e(int i) {
        if (i != 1) {
            return "CELLULAR";
        }
        return "WIFI";
    }

    public static final int f(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr[1];
    }

    public static final void g(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }
}
