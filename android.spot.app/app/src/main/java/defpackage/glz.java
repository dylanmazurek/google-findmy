package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.Html;
import com.google.android.apps.adm.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glz {
    public static final joo a = joo.m("GnpSdk");
    public final Context b;
    public final gmc c;
    public final lqz d;
    public final gls e;
    public final gnw f;
    private final ghu g;
    private final ghf h;
    private final mko i;

    public glz(Context context, gnv gnvVar, ghu ghuVar, gmc gmcVar, lqz lqzVar, gls glsVar, ghf ghfVar, mko mkoVar) {
        this.b = context;
        this.g = ghuVar;
        this.c = gmcVar;
        this.d = lqzVar;
        this.e = glsVar;
        this.h = ghfVar;
        this.f = gnvVar.c;
        this.i = mkoVar;
    }

    public static int f(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            return -1;
        }
        if (i2 == 3) {
            return 2;
        }
        if (i2 != 4) {
            return 0;
        }
        return -2;
    }

    private final Bitmap g(lga lgaVar, List list) {
        if (!list.isEmpty()) {
            int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(R.dimen.notifications_icon_size);
            int w = a.w(lgaVar.r);
            if (w == 0) {
                w = 1;
            }
            if (w - 1 != 2) {
                return this.g.a(dimensionPixelSize, list);
            }
            return this.g.b(dimensionPixelSize, list);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, jyz] */
    private final jyz h(goa goaVar, String str, String str2, final int i, final int i2, boolean z) {
        String str3;
        final String str4;
        if (goaVar == null) {
            str3 = null;
        } else {
            str3 = goaVar.b;
        }
        final String str5 = str3;
        if (true == str2.isEmpty()) {
            str4 = str;
        } else {
            str4 = str2;
        }
        jfe jfeVar = new jfe() { // from class: gly
            @Override // defpackage.jfe
            public final Object a() {
                return ((gvy) glz.this.d.a()).a(str5, str4, i, i2);
            }
        };
        ?? a2 = jfeVar.a();
        if (!z) {
            return a2;
        }
        return jwb.h(a2, Throwable.class, new eji(jfeVar, 16), (Executor) this.i.a());
    }

    private static CharSequence i(String str) {
        if (lte.c()) {
            return btw.a(str, 63);
        }
        return str;
    }

    private final List j(goa goaVar, List list, int i, int i2, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lgh lghVar = (lgh) it.next();
            if (!lghVar.b.isEmpty() || !lghVar.c.isEmpty()) {
                arrayList.add(h(goaVar, lghVar.b, lghVar.c, i, i2, z));
                if (arrayList.size() >= 4) {
                    break;
                }
            }
        }
        return arrayList;
    }

    private static List k(List list, gnd gndVar) {
        long b;
        ArrayList arrayList = new ArrayList();
        if (gndVar.e()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    Bitmap bitmap = (Bitmap) ((Future) it.next()).get();
                    if (bitmap != null) {
                        arrayList.add(bitmap);
                    }
                } catch (InterruptedException e) {
                    ((jol) ((jol) ((jol) a.g()).i(e)).j("com/google/android/libraries/notifications/internal/systemtray/impl/NotificationBuilderHelper", "getBitmaps", (char) 861, "NotificationBuilderHelper.java")).r("Failed to download image");
                    Thread.currentThread().interrupt();
                } catch (CancellationException e2) {
                    e = e2;
                    ((jol) ((jol) ((jol) a.g()).i(e)).j("com/google/android/libraries/notifications/internal/systemtray/impl/NotificationBuilderHelper", "getBitmaps", (char) 864, "NotificationBuilderHelper.java")).r("Failed to download image.");
                } catch (ExecutionException e3) {
                    e = e3;
                    ((jol) ((jol) ((jol) a.g()).i(e)).j("com/google/android/libraries/notifications/internal/systemtray/impl/NotificationBuilderHelper", "getBitmaps", (char) 864, "NotificationBuilderHelper.java")).r("Failed to download image.");
                }
            }
        } else {
            long a2 = gndVar.a();
            if (lvj.b() == 0) {
                b = a2;
            } else {
                b = lvj.b();
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    Bitmap bitmap2 = (Bitmap) ((Future) it2.next()).get(b, TimeUnit.MILLISECONDS);
                    if (bitmap2 != null) {
                        arrayList.add(bitmap2);
                    }
                } catch (InterruptedException e4) {
                    ((jol) ((jol) ((jol) a.g()).i(e4)).j("com/google/android/libraries/notifications/internal/systemtray/impl/NotificationBuilderHelper", "getBitmaps", 880, "NotificationBuilderHelper.java")).t("Failed to download image, remaining time: %d ms.", a2);
                    Thread.currentThread().interrupt();
                } catch (CancellationException e5) {
                    e = e5;
                    ((jol) ((jol) ((jol) a.g()).i(e)).j("com/google/android/libraries/notifications/internal/systemtray/impl/NotificationBuilderHelper", "getBitmaps", 884, "NotificationBuilderHelper.java")).t("Failed to download image, remaining time: %d ms.", a2);
                } catch (ExecutionException e6) {
                    e = e6;
                    ((jol) ((jol) ((jol) a.g()).i(e)).j("com/google/android/libraries/notifications/internal/systemtray/impl/NotificationBuilderHelper", "getBitmaps", 884, "NotificationBuilderHelper.java")).t("Failed to download image, remaining time: %d ms.", a2);
                } catch (TimeoutException e7) {
                    e = e7;
                    ((jol) ((jol) ((jol) a.g()).i(e)).j("com/google/android/libraries/notifications/internal/systemtray/impl/NotificationBuilderHelper", "getBitmaps", 884, "NotificationBuilderHelper.java")).t("Failed to download image, remaining time: %d ms.", a2);
                }
            }
        }
        return arrayList;
    }

    private static final boolean l(goa goaVar) {
        if (goaVar != null && (goaVar.b() instanceof gwh)) {
            return true;
        }
        return false;
    }

    private static final boolean m(lga lgaVar) {
        if (!lvj.a.a().b() && !lgaVar.w) {
            return false;
        }
        return true;
    }

    public final Notification a(bpm bpmVar, goa goaVar, int i) {
        this.f.b.intValue();
        Context context = this.b;
        String string = context.getString(R.string.app_name);
        String quantityString = context.getResources().getQuantityString(R.plurals.public_notification_text, i, Integer.valueOf(i));
        bpm bpmVar2 = new bpm(this.b);
        bpmVar2.i(string);
        bpmVar2.h(quantityString);
        this.f.a.intValue();
        bpmVar2.m(R.drawable.gs_android_find_my_device_vd_theme_24);
        if (l(goaVar)) {
            bpmVar2.o(goaVar.b);
        }
        Notification b = bpmVar2.b();
        bpmVar.y = b;
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x032b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.gxo b(java.lang.String r23, defpackage.goa r24, defpackage.ggk r25, boolean r26, defpackage.gnd r27, defpackage.gxh r28) {
        /*
            Method dump skipped, instructions count: 1554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.glz.b(java.lang.String, goa, ggk, boolean, gnd, gxh):gxo");
    }

    public final CharSequence c(int i, String... strArr) {
        if (!lte.c()) {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                strArr[i2] = Html.escapeHtml(strArr[i2]);
            }
        }
        return btw.a(this.b.getString(i, strArr), 63);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String d(goa goaVar, List list) {
        HashSet hashSet = new HashSet();
        jmx it = ((jis) list).iterator();
        int i = 0;
        while (it.hasNext()) {
            lga lgaVar = ((ggk) it.next()).d;
            if ((lgaVar.a & 131072) != 0) {
                hashSet.add(lgaVar.t);
            } else {
                i++;
            }
        }
        if (hashSet.size() == 1 && i == 0) {
            return (String) hashSet.iterator().next();
        }
        if (l(goaVar) && this.f.f) {
            return goaVar.b;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(defpackage.bpm r3, defpackage.lga r4, boolean r5) {
        /*
            r2 = this;
            if (r5 != 0) goto L14
            gnw r0 = r2.f
            boolean r0 = r0.d
            if (r0 == 0) goto L14
            lfy r0 = r4.j
            if (r0 != 0) goto Le
            lfy r0 = defpackage.lfy.g
        Le:
            boolean r0 = r0.b
            if (r0 != 0) goto L14
            r0 = 2
            goto L19
        L14:
            r0 = 0
            r3.q(r0)
            r0 = 0
        L19:
            if (r5 != 0) goto L2d
            gnw r1 = r2.f
            boolean r1 = r1.c
            if (r1 == 0) goto L2d
            lfy r1 = r4.j
            if (r1 != 0) goto L27
            lfy r1 = defpackage.lfy.g
        L27:
            boolean r1 = r1.c
            if (r1 != 0) goto L2d
            r0 = r0 | 1
        L2d:
            if (r5 != 0) goto L41
            gnw r5 = r2.f
            boolean r5 = r5.e
            if (r5 == 0) goto L41
            lfy r4 = r4.j
            if (r4 != 0) goto L3b
            lfy r4 = defpackage.lfy.g
        L3b:
            boolean r4 = r4.d
            if (r4 != 0) goto L41
            r0 = r0 | 4
        L41:
            r3.j(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.glz.e(bpm, lga, boolean):void");
    }
}
