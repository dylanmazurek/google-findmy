package defpackage;

import android.content.Context;
import android.os.Bundle;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emm {
    public static final jjr a = jjr.o("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
    public static final jjr b = jjr.o("android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT");
    public final emx c;
    private final exx d;

    public emm() {
        throw null;
    }

    public static boolean a(Context context) {
        jjr jjrVar;
        if (a.f()) {
            jjrVar = b;
        } else {
            jjrVar = a;
        }
        Iterator it = jjrVar.iterator();
        while (it.hasNext()) {
            if (fma.bz(context, (String) it.next()) != 0) {
                return false;
            }
        }
        return true;
    }

    public final void b(final exw exwVar) {
        exw exwVar2 = new exw() { // from class: emn
            @Override // defpackage.exw
            public final void a(boolean z) {
                emm.this.c.c.i(null);
                exwVar.a(z);
            }
        };
        po poVar = new po();
        exx exxVar = this.d;
        int i = 13;
        exxVar.c = exxVar.b.L(poVar, new dyd(exxVar, i));
        exxVar.d = exwVar2;
        exxVar.b.G().Q("PERMISSION_RESULT_FRAGMENT_RESULT", exxVar.b, new ehe(exxVar, i));
    }

    public final void c(jer jerVar, jer jerVar2) {
        jjr jjrVar;
        if (a.f()) {
            jjrVar = b;
        } else {
            jjrVar = a;
        }
        exx exxVar = this.d;
        if (true != a.f()) {
            jerVar = jerVar2;
        }
        if (exxVar.c == null) {
            ((jni) ((jni) exx.a.f()).j("com/google/android/apps/adm/ui/permissions/PermissionPromptLauncherImpl", "requestPermissions", 67, "PermissionPromptLauncherImpl.java")).r("requestPermissions failed: registerForPermissionResult() must be called before requestPermissions() is called.");
            return;
        }
        Context x = exxVar.b.x();
        x.getClass();
        Set bA = fma.bA(x, jjrVar);
        if (bA.isEmpty()) {
            exw exwVar = exxVar.d;
            exwVar.getClass();
            exwVar.a(true);
            return;
        }
        String[] strArr = (String[]) bA.toArray(new String[0]);
        Stream stream = Collection.EL.stream(bA);
        ag agVar = exxVar.b;
        agVar.getClass();
        if (!stream.anyMatch(new ehc(agVar, 8))) {
            exxVar.a(strArr);
            return;
        }
        if (jerVar.g()) {
            if (exxVar.b.G().f("PERMISSION_PROMPT_FRAGMENT_TAG") == null) {
                Object c = jerVar.c();
                exy exyVar = new exy();
                Bundle bundle = new Bundle();
                exv exvVar = (exv) c;
                bundle.putString("MESSAGE_STRING_KEY", exvVar.b);
                bundle.putInt("TITLE_STRING_KEY", exvVar.a);
                if (exvVar.c.g()) {
                    bundle.putInt("ICON_STRING_KEY", ((Integer) exvVar.c.c()).intValue());
                }
                bundle.putStringArray("PERMISSIONS_ARRAY_KEY", strArr);
                exyVar.ak(bundle);
                exyVar.cs(exxVar.b.G(), "PERMISSION_PROMPT_FRAGMENT_TAG");
                return;
            }
            return;
        }
        exxVar.e.o();
    }

    public emm(exx exxVar, emx emxVar) {
        this.d = exxVar;
        this.c = emxVar;
    }
}
