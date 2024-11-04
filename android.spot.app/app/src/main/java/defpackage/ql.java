package defpackage;

import android.app.KeyguardManager;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ql {
    public static Intent a(KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
        return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
    }

    public static final va b(va vaVar) {
        va c = vaVar.c();
        int b = c.b();
        for (int i = 0; i < b; i++) {
            c.e(i, vaVar.a(i));
        }
        return c;
    }

    public static final boolean c(ayr ayrVar) {
        ayr ayrVar2;
        if (ayrVar.e == null) {
            return false;
        }
        ayr o = ayrVar.o();
        if (o != null) {
            ayrVar2 = o.e;
        } else {
            ayrVar2 = null;
        }
        if (ayrVar2 != null && !ayrVar.o.b) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ String d(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return "null";
                        }
                        return "Idle";
                    }
                    return "LookaheadLayingOut";
                }
                return "LayingOut";
            }
            return "LookaheadMeasuring";
        }
        return "Measuring";
    }
}
