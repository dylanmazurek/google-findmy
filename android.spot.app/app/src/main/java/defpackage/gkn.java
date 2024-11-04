package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gkn extends gkm {
    private static final joo c = joo.m("GnpSdk");
    private final gjk d;
    private final gkr e;

    public gkn(gjk gjkVar, gkr gkrVar) {
        this.d = gjkVar;
        this.e = gkrVar;
    }

    @Override // defpackage.gyp
    public final String c() {
        return "RPC_SET_USER_PREFERENCE";
    }

    @Override // defpackage.gkm
    public final gjj g(Bundle bundle, lgq lgqVar, goa goaVar) {
        boolean z;
        gjj a;
        lex lexVar;
        ldv ldvVar;
        String str;
        String str2;
        int i;
        if (goaVar == null) {
            return i();
        }
        if (bundle.getInt("com.google.android.libraries.notifications.internal.scheduled.impl.INTENT_EXTRA_INCLUDE_TARGET") == 1) {
            z = true;
        } else {
            z = false;
        }
        List b = this.e.b(goaVar, 6);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            try {
                lexVar = (lex) ((ljh) lex.d.k().e(((gkq) it.next()).b)).q();
                ldvVar = lexVar.b;
                if (ldvVar == null) {
                    ldvVar = ldv.d;
                }
                str = ldvVar.b;
            } catch (ljy e) {
                ((jol) ((jol) ((jol) c.f()).i(e)).j("com/google/android/libraries/notifications/internal/scheduled/impl/SetUserPreferenceHandler", "getChimeRpcResponse", 'S', "SetUserPreferenceHandler.java")).r("Failed to parse PreferenceEntry from ChimeTaskData");
            }
            if (str != null) {
                if (!ldvVar.c.isEmpty()) {
                    str2 = ldvVar.c;
                } else {
                    str2 = null;
                }
                ggd ggdVar = new ggd(str, str2);
                int w = a.w(lexVar.c);
                if (w == 0) {
                    w = 1;
                }
                int i2 = w - 1;
                if (i2 != 1) {
                    i = 2;
                    if (i2 != 2) {
                        i = 1;
                    }
                } else {
                    i = 3;
                }
                ggc ggcVar = new ggc(ggdVar, i);
                linkedHashMap.put(ggcVar.a, ggcVar);
            } else {
                throw new NullPointerException("Null key");
                break;
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.values());
        if (!arrayList.isEmpty()) {
            a = this.d.g(goaVar, new gge(arrayList), z, lgqVar);
        } else {
            gji c2 = gjj.c();
            c2.e = new IllegalArgumentException("No preferences to set.");
            c2.b(false);
            a = c2.a();
        }
        if (!a.b() || !a.d) {
            this.e.d(goaVar, b);
        }
        return a;
    }

    @Override // defpackage.gkm
    protected final String h() {
        return "SetUserPrereferenceCallback";
    }
}
