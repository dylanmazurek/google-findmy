package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class giy implements git {
    private static final joo b = joo.m("GnpSdk");
    public final giw a;
    private final gpx c;
    private final gja d;
    private final gjd e;

    public giy(gpx gpxVar, giw giwVar, gja gjaVar, gjd gjdVar) {
        this.c = gpxVar;
        this.a = giwVar;
        this.d = gjaVar;
        this.e = gjdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c3, code lost:            if (((defpackage.gna) defpackage.jyr.b(((defpackage.hri) r8.d.a()).y(r8.f, r2, r5, java.lang.Long.valueOf(r0 + 6000)), java.lang.Exception.class)).g() != false) goto L33;     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a4 A[Catch: ExecutionException -> 0x0241, TimeoutException -> 0x0243, InterruptedException -> 0x0266, TryCatch #7 {InterruptedException -> 0x0266, ExecutionException -> 0x0241, TimeoutException -> 0x0243, blocks: (B:36:0x0154, B:38:0x01a4, B:42:0x01ae, B:44:0x01c0, B:52:0x01f8, B:57:0x021a, B:61:0x0221), top: B:35:0x0154 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v31, types: [msw, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d(final defpackage.goa r22, final java.util.List r23, final defpackage.gnd r24, final defpackage.ghh r25, final boolean r26, final boolean r27, final boolean r28) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.giy.d(goa, java.util.List, gnd, ghh, boolean, boolean, boolean):void");
    }

    @Override // defpackage.git
    public final void a(goa goaVar, List list, gnd gndVar, ghh ghhVar, boolean z, boolean z2) {
        d(goaVar, list, gndVar, ghhVar, z, false, z2);
    }

    @Override // defpackage.git
    public final void b(ghp ghpVar) {
        if (!ghpVar.d.isEmpty()) {
            gjd gjdVar = this.e;
            if (ghpVar.j == 1) {
                if (((Map) gjdVar.e.a()).containsKey(Integer.valueOf(ghpVar.a))) {
                    ((glt) ((Map) gjdVar.e.a()).get(Integer.valueOf(ghpVar.a))).a(ghpVar);
                } else {
                    ((jol) gjd.a.k().j("com/google/android/libraries/notifications/internal/receiver/impl/ThreadUpdateHandler", "updateThreads", 57, "ThreadUpdateHandler.java")).s("No handler installed for system tray events of type %s", ghpVar.a);
                }
            }
            ArrayList arrayList = new ArrayList(ghpVar.d.size());
            for (int i = 0; i < ghpVar.d.size(); i++) {
                arrayList.add(((ggk) ghpVar.d.get(i)).a);
            }
            goa goaVar = ghpVar.c;
            gjdVar.d.b(goaVar, arrayList, ghpVar.e, ghpVar.j, ghpVar.i);
            if (!lgz.f.equals(ghpVar.e)) {
                if (ghpVar.c == null) {
                    for (ggk ggkVar : ghpVar.d) {
                        if (!TextUtils.isEmpty(ggkVar.i)) {
                            gjdVar.b.i(ggkVar.i, ghpVar.e);
                        }
                    }
                    return;
                }
                gjdVar.c.b(goaVar, ghpVar.e, ghpVar.b, ghpVar.j, ghpVar.i, ggk.b(ghpVar.d));
            }
        }
    }

    @Override // defpackage.git
    public final void c(goa goaVar, List list, gnd gndVar, ghh ghhVar) {
        d(goaVar, list, gndVar, ghhVar, false, true, false);
    }
}
