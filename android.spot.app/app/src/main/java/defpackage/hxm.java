package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxm extends BroadcastReceiver {
    public static volatile boolean b;
    public static final Object a = new Object();
    public static final ConcurrentMap c = new ConcurrentHashMap();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        njz njzVar;
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra != null) {
            if (!stringExtra.contains("../") && !stringExtra.contains("/..")) {
                ArrayList arrayList = new ArrayList(c.keySet());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    jes jesVar = (jes) arrayList.get(i);
                    if (((String) jesVar.a).equals(stringExtra) && (njzVar = (njz) c.get(jesVar)) != null) {
                        hnu hnuVar = hxc.j;
                        ((hxc) njzVar.a).c();
                    }
                }
                return;
            }
            Log.w("PhUpdateBroadcastRecv", a.ag(stringExtra, "Got an invalid config package for P/H that includes '..': ", ". Exiting."));
        }
    }
}
