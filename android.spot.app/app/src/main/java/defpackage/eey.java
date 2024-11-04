package defpackage;

import android.accounts.Account;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eey {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public eey(Context context) {
        this.b = context;
        this.a = "image_manager_disk_cache";
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [evy, java.lang.Object] */
    public final void a(Context context) {
        try {
            Account b = this.a.b();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("google.maps.timeline", "", null));
            intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
            intent.setFlags(268435456);
            if (b != null) {
                intent.putExtra("account_name", b.name);
            }
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            ((jni) ((jni) ((jni) efa.b.f()).i(e)).j("com/google/android/apps/adm/integrations/android/AndroidDeviceController$1", "onMapsTimelineClicked", (char) 180, "AndroidDeviceController.java")).r("No activity can handle Maps Timeline intent.");
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [mwl, java.lang.Object] */
    public final void b(Object obj) {
        Object obj2;
        if (((cts) this.b).e(obj)) {
            obj2 = new cth(((cts) this.b).d());
        } else {
            obj2 = ctg.a;
        }
        this.a.j(obj2);
    }

    public eey(cts ctsVar, mwi mwiVar) {
        this.b = ctsVar;
        this.a = mwiVar;
    }

    public eey(dyr dyrVar, lqz lqzVar) {
        this.b = lqzVar;
        this.a = dyrVar;
    }

    public /* synthetic */ eey(efa efaVar, eez eezVar) {
        this.b = efaVar;
        this.a = eezVar;
    }

    public eey(efa efaVar, Object obj) {
        this.a = obj;
        this.b = efaVar;
    }
}
