package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggl implements gov {
    private static final joo a = joo.m("GnpSdk");
    private final ghf b;
    private final gok c;

    public ggl(ghf ghfVar, gok gokVar) {
        this.b = ghfVar;
        this.c = gokVar;
    }

    @Override // defpackage.gov
    public final /* synthetic */ int a(Intent intent) {
        return 10;
    }

    @Override // defpackage.gov
    public final void b(Intent intent, gnd gndVar, long j) {
        String str;
        String str2;
        char c;
        ((jol) a.k().j("com/google/android/libraries/notifications/entrypoints/blockstatechanged/BlockStateChangedIntentHandler", "runInBackground", 55, "BlockStateChangedIntentHandler.java")).u("BlockStateChanged due to Intent Action: [%s]", intent.getAction());
        Bundle extras = intent.getExtras();
        ghg ghgVar = null;
        glr glrVar = null;
        if (Build.VERSION.SDK_INT >= 28 && extras != null) {
            str2 = extras.getString("android.app.extra.NOTIFICATION_CHANNEL_ID");
            str = extras.getString("android.app.extra.NOTIFICATION_CHANNEL_GROUP_ID");
        } else {
            str = null;
            str2 = null;
        }
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode != 452039370) {
            if (hashCode != 806551504) {
                if (hashCode == 1171977904 && action.equals("android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (action.equals("android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED")) {
                    c = 2;
                }
                c = 65535;
            }
        } else {
            if (action.equals("android.app.action.APP_BLOCK_STATE_CHANGED")) {
                c = 0;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c == 2) {
                    ghg b = this.b.b(lde.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED);
                    if (str != null) {
                        ghn ghnVar = (ghn) b;
                        Iterator it = ghnVar.j.b().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            glr glrVar2 = (glr) it.next();
                            if (glrVar2.a.equals(str)) {
                                glrVar = glrVar2;
                                break;
                            }
                        }
                        ghnVar.v = glrVar;
                    }
                    ghgVar = b;
                }
            } else {
                ghgVar = this.b.b(lde.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED);
                if (str2 != null) {
                    ghgVar.b(str2);
                }
            }
        } else {
            ghgVar = this.b.b(lde.APP_BLOCK_STATE_CHANGED);
        }
        if (ghgVar != null) {
            ghgVar.a();
        } else {
            ((jol) ((jol) a.f()).j("com/google/android/libraries/notifications/entrypoints/blockstatechanged/BlockStateChangedIntentHandler", "runInBackground", 92, "BlockStateChangedIntentHandler.java")).r("ChimeLogEvent uninitialized, perhaps due to unvalidated event.");
        }
        try {
            this.c.g(lgp.CHANNEL_BLOCK_STATE_CHANGED).get();
        } catch (Exception e) {
            ((jol) ((jol) ((jol) a.f()).i(e)).j("com/google/android/libraries/notifications/entrypoints/blockstatechanged/BlockStateChangedIntentHandler", "runInBackground", 'e', "BlockStateChangedIntentHandler.java")).r("Failed scheduling registration");
        }
    }

    @Override // defpackage.gov
    public final boolean c(Intent intent) {
        char c;
        if (intent.getAction() == null) {
            return false;
        }
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode != 452039370) {
            if (hashCode != 806551504) {
                if (hashCode == 1171977904 && action.equals("android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (action.equals("android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED")) {
                    c = 2;
                }
                c = 65535;
            }
        } else {
            if (action.equals("android.app.action.APP_BLOCK_STATE_CHANGED")) {
                c = 0;
            }
            c = 65535;
        }
        if (c != 0 && c != 1 && c != 2) {
            return false;
        }
        return true;
    }
}
