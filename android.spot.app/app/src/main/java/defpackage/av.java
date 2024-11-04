package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class av implements pd {
    final /* synthetic */ be a;
    private final /* synthetic */ int b;

    public av(be beVar, int i) {
        this.b = i;
        this.a = beVar;
    }

    @Override // defpackage.pd
    public final /* synthetic */ void a(Object obj) {
        int i;
        int i2 = this.b;
        if (i2 != 0) {
            if (i2 != 1) {
                pc pcVar = (pc) obj;
                ay ayVar = (ay) this.a.r.pollFirst();
                if (ayVar == null) {
                    toString();
                    Log.w("FragmentManager", "No IntentSenders were started for ".concat(toString()));
                    return;
                }
                bl blVar = this.a.a;
                String str = ayVar.a;
                ag c = blVar.c(str);
                if (c == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment ".concat(String.valueOf(str)));
                    return;
                } else {
                    c.Y(ayVar.b, pcVar.a, pcVar.b);
                    return;
                }
            }
            Map map = (Map) obj;
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (true != ((Boolean) arrayList.get(i3)).booleanValue()) {
                    i = -1;
                } else {
                    i = 0;
                }
                iArr[i3] = i;
            }
            ay ayVar2 = (ay) this.a.r.pollFirst();
            if (ayVar2 == null) {
                toString();
                Log.w("FragmentManager", "No permissions were requested for ".concat(toString()));
                return;
            }
            bl blVar2 = this.a.a;
            String str2 = ayVar2.a;
            if (blVar2.c(str2) == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment ".concat(String.valueOf(str2)));
                return;
            }
            return;
        }
        pc pcVar2 = (pc) obj;
        ay ayVar3 = (ay) this.a.r.pollLast();
        if (ayVar3 == null) {
            toString();
            Log.w("FragmentManager", "No Activities were started for result for ".concat(toString()));
            return;
        }
        bl blVar3 = this.a.a;
        String str3 = ayVar3.a;
        ag c2 = blVar3.c(str3);
        if (c2 == null) {
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment ".concat(String.valueOf(str3)));
        } else {
            c2.Y(ayVar3.b, pcVar2.a, pcVar2.b);
        }
    }
}
