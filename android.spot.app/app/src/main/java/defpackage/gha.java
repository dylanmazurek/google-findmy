package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Process;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gha implements ggy {
    public static final joo a = joo.m("GnpSdk");
    public final lqz b;
    public final lqz c;
    public final lqz d;
    public final ddg e;
    private final lqz f;
    private final gwb g;

    public gha(lqz lqzVar, lqz lqzVar2, lqz lqzVar3, lqz lqzVar4, gwb gwbVar, ddg ddgVar) {
        this.f = lqzVar;
        this.b = lqzVar2;
        this.c = lqzVar3;
        this.d = lqzVar4;
        this.g = gwbVar;
        this.e = ddgVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(Intent intent) {
        if (glx.c(intent) != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ggy
    public final void a(Context context, final Intent intent) {
        if (!b(intent)) {
            ((jol) a.k().j("com/google/android/libraries/notifications/entrypoints/systemtray/ThreadUpdateActivityIntentHandlerImpl", "handleIntent", 71, "ThreadUpdateActivityIntentHandlerImpl.java")).r("Intent is null or have null action.");
            return;
        }
        if (!intent.getBooleanExtra("com.google.android.libraries.notifications.UPDATE_HANDLED", false)) {
            intent.putExtra("com.google.android.libraries.notifications.UPDATE_HANDLED", true);
            this.g.a(context.getApplicationContext());
            final String e = glx.e(intent);
            final String d = glx.d(intent);
            final lgz b = glx.b(intent);
            final lct a2 = glx.a(intent);
            if (e != null || d != null) {
                final int f = glx.f(intent);
                String c = glx.c(intent);
                if (c != null && c.startsWith("com.google.android.libraries.notifications.ACTION_ID:")) {
                    c = c.replaceFirst("com.google.android.libraries.notifications.ACTION_ID:", "");
                }
                final String str = c;
                ((gpx) this.f.a()).b(new Runnable() { // from class: ggz
                    @Override // java.lang.Runnable
                    public final void run() {
                        jer jerVar;
                        jis t;
                        int threadPriority = Process.getThreadPriority(0);
                        lct lctVar = a2;
                        lgz lgzVar = b;
                        String str2 = str;
                        int i = f;
                        String str3 = d;
                        Intent intent2 = intent;
                        gha ghaVar = gha.this;
                        try {
                            Process.setThreadPriority(10);
                            gna r = ghaVar.e.r(intent2);
                            if (r.e()) {
                                ((jol) ((jol) ((jol) gha.a.f()).i(r.d())).j("com/google/android/libraries/notifications/entrypoints/systemtray/ThreadUpdateActivityIntentHandlerImpl", "getAccount", (char) 157, "ThreadUpdateActivityIntentHandlerImpl.java")).r("Failed to update notification - account not found.");
                                jerVar = jdl.a;
                            } else {
                                jerVar = (jer) r.c();
                            }
                            if (jerVar.g()) {
                                goa goaVar = (goa) jerVar.c();
                                String str4 = e;
                                if (str4 != null) {
                                    t = ((ddg) ghaVar.b.a()).u(goaVar, str4);
                                } else {
                                    t = ((ddg) ghaVar.b.a()).t(goaVar, str3);
                                }
                                for (gxb gxbVar : (Set) ghaVar.d.a()) {
                                    jis.o(t);
                                    gxbVar.f();
                                }
                                git gitVar = (git) ghaVar.c.a();
                                gho a3 = ghp.a();
                                a3.g();
                                a3.f(i);
                                a3.a = str2;
                                a3.b = goaVar;
                                a3.b(t);
                                a3.e(lgzVar);
                                a3.d = intent2;
                                gji gjiVar = new gji();
                                gjiVar.d(lctVar);
                                a3.f = gjiVar.c();
                                a3.c(true);
                                gitVar.b(a3.a());
                            }
                        } finally {
                            Process.setThreadPriority(threadPriority);
                        }
                    }
                });
                ((jol) a.k().j("com/google/android/libraries/notifications/entrypoints/systemtray/ThreadUpdateActivityIntentHandlerImpl", "handleThreadUpdate", 151, "ThreadUpdateActivityIntentHandlerImpl.java")).r("Scheduled job to handle thread update.");
            }
            ((jol) a.k().j("com/google/android/libraries/notifications/entrypoints/systemtray/ThreadUpdateActivityIntentHandlerImpl", "handleIntent", 78, "ThreadUpdateActivityIntentHandlerImpl.java")).r("Marking thread update as handled.");
        }
    }
}
