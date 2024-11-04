package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvg extends dvd {
    private static final jnk ag = jnk.l("com/google/android/apps/adm/activities/MainActivityDelegateFragment");
    public dyq a;
    public emx af;
    public ewc b;
    public Set c;
    public duz d;
    public dyw e;

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.main_activity_delegate_fragment, viewGroup, false);
    }

    @Override // defpackage.ag
    public final void ad() {
        dyq dyqVar = this.a;
        if (dyqVar.a) {
            dyqVar.c();
        }
        super.ad();
    }

    @Override // defpackage.ag
    public final void af() {
        dyq dyqVar = this.a;
        if (dyqVar.a) {
            ((jni) ((jni) ag.g()).j("com/google/android/apps/adm/activities/MainActivityDelegateFragment", "onResume", 126, "MainActivityDelegateFragment.java")).r("MainController unexpectedly found init'ed in onResume");
        } else {
            dyqVar.b();
        }
        super.af();
    }

    @Override // defpackage.ag
    public final void ag(View view, Bundle bundle) {
        this.d.a.g(O(), new qk(this, 9));
        bwb.n(K(), new dvf(this, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Type inference failed for: r3v11, types: [lqz, java.lang.Object] */
    @Override // defpackage.ag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvg.g(android.os.Bundle):void");
    }

    @Override // defpackage.ag
    public final void j(Bundle bundle) {
        String str;
        jis jisVar;
        ewc ewcVar = this.b;
        ewcVar.b.j(bundle);
        ewf ewfVar = ewcVar.n;
        Bundle bundle2 = new Bundle();
        Object obj = ewfVar.b;
        if (obj != null) {
            bundle2.putString("current_device_identifier", eyf.j((lqc) obj));
        }
        bundle.putBundle("current_device_state", bundle2);
        jis jisVar2 = ewcVar.c;
        if (jisVar2 != null) {
            kzy.n(bundle, "devices", jisVar2);
        }
        int i = ewcVar.m;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "null";
                } else {
                    str = "REGISTRATION_FAILED";
                }
            } else {
                str = "REGISTERED";
            }
        } else {
            str = "REGISTERING";
        }
        if (i != 0) {
            bundle.putString("gcm_state", str);
            bundle.putString("gcm_registration_id", ewcVar.d);
            if (!ewcVar.g.isEmpty() && (jisVar = ewcVar.c) != null && !jisVar.isEmpty()) {
                jis jisVar3 = ewcVar.c;
                int size = jisVar3.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    lqc lqcVar = (lqc) jisVar3.get(i2);
                    if (ewcVar.g.containsKey(lqcVar)) {
                        kzy.m(bundle, String.format("device_password_requirements_%d", Integer.valueOf(i3)), (lol) ewcVar.g.get(lqcVar));
                    }
                    i2++;
                    i3++;
                }
            }
            bundle.putBoolean("has_zoomed_out", ewcVar.e);
            bundle.putBoolean("devices_error_shown", ewcVar.f);
            bundle.putBoolean("devices_need_refresh", ewcVar.h);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(ewcVar.i.size());
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(ewcVar.i.size());
            for (Map.Entry entry : ewcVar.i.entrySet()) {
                arrayList.add((Parcelable) entry.getKey());
                arrayList2.add((Parcelable) entry.getValue());
            }
            bundle.putParcelableArrayList("device_state_map_keys", arrayList);
            bundle.putParcelableArrayList("device_state_map_values", arrayList2);
            return;
        }
        throw null;
    }
}
