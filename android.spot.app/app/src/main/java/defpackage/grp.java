package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grp {
    private static knh a;

    public static synchronized knh a(Context context, ddg ddgVar, gnv gnvVar) {
        knh knhVar;
        String str;
        knh knhVar2;
        synchronized (grp.class) {
            if (a == null) {
                fma.aQ("AIzaSyC8UYZpvA2eknNex0Pjid0_eTLJoDu6los", "ApiKey must be set.");
                fma.aQ("1:747654520220:android:0000000000000000", "ApplicationId must be set.");
                knl knlVar = new knl("1:747654520220:android:0000000000000000", "AIzaSyC8UYZpvA2eknNex0Pjid0_eTLJoDu6los", null, null, gnvVar.b, null, "chime-sdk");
                if (((jer) ddgVar.a).g()) {
                    ((gxk) ((jer) ddgVar.a).c()).a();
                }
                try {
                    knhVar2 = knh.c(context, knlVar, "CHIME_ANDROID_SDK");
                } catch (IllegalStateException unused) {
                    synchronized (knh.a) {
                        knh knhVar3 = (knh) knh.b.get("CHIME_ANDROID_SDK");
                        if (knhVar3 != null) {
                            ((kqh) knhVar3.f.a()).c();
                            knhVar2 = knhVar3;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            synchronized (knh.a) {
                                Iterator it = knh.b.values().iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((knh) it.next()).f());
                                }
                                Collections.sort(arrayList);
                                if (arrayList.isEmpty()) {
                                    str = "";
                                } else {
                                    str = "Available app names: " + TextUtils.join(", ", arrayList);
                                }
                                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", "CHIME_ANDROID_SDK", str));
                            }
                        }
                    }
                }
                a = knhVar2;
            }
            knhVar = a;
        }
        return knhVar;
    }
}
