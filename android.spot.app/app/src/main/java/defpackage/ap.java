package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ap implements cjx {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ap(cs csVar, int i) {
        this.b = i;
        this.a = csVar;
    }

    @Override // defpackage.cjx
    public final Bundle a() {
        ArrayList<? extends Parcelable> arrayList;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        int i2 = bck.a;
                        ame ameVar = (ame) this.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(ameVar.a);
                        for (Map.Entry entry : ameVar.b.entrySet()) {
                            String str = (String) entry.getKey();
                            List list = (List) entry.getValue();
                            if (list.size() == 1) {
                                Object a = ((mnw) list.get(0)).a();
                                if (a == null) {
                                    continue;
                                } else if (ameVar.c(a)) {
                                    linkedHashMap.put(str, new ArrayList(new mlu(new Object[]{a}, true)));
                                } else {
                                    throw new IllegalStateException(aly.a(a));
                                }
                            } else {
                                int size = list.size();
                                ArrayList arrayList2 = new ArrayList(size);
                                for (int i3 = 0; i3 < size; i3++) {
                                    Object a2 = ((mnw) list.get(i3)).a();
                                    if (a2 != null && !ameVar.c(a2)) {
                                        throw new IllegalStateException(aly.a(a2));
                                    }
                                    arrayList2.add(a2);
                                }
                                linkedHashMap.put(str, arrayList2);
                            }
                        }
                        Bundle bundle = new Bundle();
                        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                            String str2 = (String) entry2.getKey();
                            List list2 = (List) entry2.getValue();
                            if (list2 instanceof ArrayList) {
                                arrayList = (ArrayList) list2;
                            } else {
                                arrayList = new ArrayList<>(list2);
                            }
                            bundle.putParcelableArrayList(str2, arrayList);
                        }
                        return bundle;
                    }
                    Bundle bundle2 = new Bundle();
                    pk pkVar = ((oc) this.a).h;
                    bundle2.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(pkVar.b.values()));
                    bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(pkVar.b.keySet()));
                    bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(pkVar.c));
                    bundle2.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(pkVar.f));
                    return bundle2;
                }
                Bundle bundle3 = new Bundle();
                ((cs) this.a).h();
                return bundle3;
            }
            aj ajVar = (aj) this.a;
            ajVar.e();
            ajVar.d.b(cev.ON_STOP);
            return new Bundle();
        }
        return ((be) this.a).b();
    }

    public /* synthetic */ ap(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
