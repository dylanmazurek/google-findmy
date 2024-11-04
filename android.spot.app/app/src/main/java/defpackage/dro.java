package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dro implements Handler.Callback {
    private static final bqc e = new bqc();
    public final dri b;
    private volatile dhd d;
    public final rx a = new rx();
    public final ddh c = new ddh((byte[]) null, (byte[]) null);

    public dro() {
        dri drfVar;
        if (dpo.b && dpo.a) {
            drfVar = new drh();
        } else {
            drfVar = new drf();
        }
        this.b = drfVar;
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void d(Collection collection, Map map) {
        View view;
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ag agVar = (ag) it.next();
                if (agVar != null && (view = agVar.P) != null) {
                    map.put(view, agVar);
                    d(agVar.G().j(), map);
                }
            }
        }
    }

    public final dhd b(Context context) {
        if (context != null) {
            if (dtq.j() && !(context instanceof Application)) {
                if (context instanceof aj) {
                    return c((aj) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return b(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.d == null) {
                synchronized (this) {
                    if (this.d == null) {
                        this.d = new dhd(dgo.b(context.getApplicationContext()), new drb(), new drm(), context.getApplicationContext());
                    }
                }
            }
            return this.d;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public final dhd c(aj ajVar) {
        if (!dtq.i()) {
            if (!ajVar.isDestroyed()) {
                this.b.a(ajVar);
                Activity a = a(ajVar);
                boolean z = true;
                if (a != null && a.isFinishing()) {
                    z = false;
                }
                dgo b = dgo.b(ajVar.getApplicationContext());
                ddh ddhVar = this.c;
                cex cexVar = ajVar.f;
                ajVar.a();
                return ddhVar.e(ajVar, b, cexVar, z);
            }
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        return b(ajVar.getApplicationContext());
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public final boolean handleMessage(Message message) {
        return false;
    }
}
