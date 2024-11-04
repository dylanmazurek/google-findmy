package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwr {
    private static final jnk b = jnk.l("com/google/android/apps/adm/betterbug/BetterBugLauncherImpl");
    public final Context a;
    private final Set c;

    public dwr(Set set, Context context) {
        this.c = set;
        this.a = context;
    }

    public final Intent a() {
        Intent flags = new Intent("com.google.android.apps.betterbug.intent.FILE_BUG_DEEPLINK").putExtra("EXTRA_DEEPLINK", true).putExtra("EXTRA_REQUIRE_BUGREPORT", true).putExtra("EXTRA_TARGET_PACKAGE", this.a.getPackageName()).setFlags(268435456);
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            jer a = ((dwq) it.next()).a();
            if (a.g()) {
                dwp dwpVar = (dwp) a.c();
                flags.putExtra("EXTRA_ISSUE_TITLE", (String) ((jeu) dwpVar.a).a);
                flags.putExtra("EXTRA_HOTLIST_ID_LIST", new long[]{((Long) ((jeu) dwpVar.b).a).longValue()});
                break;
            }
        }
        return flags;
    }

    public final void b() {
        try {
            this.a.startActivity(a());
        } catch (ActivityNotFoundException e) {
            ((jni) ((jni) ((jni) b.f().h(jop.a, "BetterBugLauncher")).i(e)).j("com/google/android/apps/adm/betterbug/BetterBugLauncherImpl", "launchBetterBug", '2', "BetterBugLauncherImpl.java")).r("Failed starting the better bug activity");
        }
    }
}
