package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cr implements pb {
    final /* synthetic */ oc a;
    private final /* synthetic */ int b;

    public cr(cs csVar, int i) {
        this.b = i;
        this.a = csVar;
    }

    @Override // defpackage.pb
    public final void a() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    oc ocVar = this.a;
                    dvc dvcVar = (dvc) ocVar;
                    if (!dvcVar.p) {
                        dvcVar.p = true;
                        return;
                    }
                    return;
                }
                oc ocVar2 = this.a;
                Bundle a = ocVar2.R().a("android:support:activity-result");
                if (a != null) {
                    pk pkVar = ocVar2.h;
                    ArrayList<Integer> integerArrayList = a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            pkVar.c.addAll(stringArrayList2);
                        }
                        Bundle bundle = a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        if (bundle != null) {
                            pkVar.f.putAll(bundle);
                        }
                        int size = stringArrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            String str = stringArrayList.get(i2);
                            if (pkVar.b.containsKey(str)) {
                                Integer num = (Integer) pkVar.b.remove(str);
                                if (!pkVar.f.containsKey(str)) {
                                    Map map = pkVar.a;
                                    mpp.h(map);
                                    map.remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i2);
                            num2.getClass();
                            int intValue = num2.intValue();
                            String str2 = stringArrayList.get(i2);
                            str2.getClass();
                            pkVar.c(intValue, str2);
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            Object obj = ((aj) this.a).e.a;
            an anVar = (an) obj;
            anVar.e.m(anVar, (al) obj, null);
            return;
        }
        cw h = ((cs) this.a).h();
        h.e();
        this.a.R().a("androidx:appcompat");
        h.o();
    }

    public /* synthetic */ cr(oc ocVar, int i) {
        this.b = i;
        this.a = ocVar;
    }
}
