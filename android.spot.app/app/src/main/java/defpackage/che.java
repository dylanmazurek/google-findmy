package defpackage;

import android.os.SystemClock;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class che extends chi implements Runnable {
    public boolean a;
    final /* synthetic */ chf b;

    public che(chf chfVar) {
        this.b = chfVar;
    }

    @Override // defpackage.chi
    public final Object a() {
        boolean z;
        try {
            chf chfVar = this.b;
            TreeSet treeSet = new TreeSet();
            String[] split = hwx.e(chfVar.e.getApplicationContext(), "third_party_license_metadata", 0L, -1).split("\n");
            ArrayList arrayList = new ArrayList(split.length);
            for (String str : split) {
                int indexOf = str.indexOf(32);
                String[] split2 = str.substring(0, indexOf).split(":");
                if (split2.length == 2 && indexOf > 0) {
                    z = true;
                } else {
                    z = false;
                }
                hwx.V(z, "Invalid license meta-data line:\n".concat(String.valueOf(str)));
                arrayList.add(new hzx(str.substring(indexOf + 1), Long.parseLong(split2[0]), Integer.parseInt(split2[1])));
            }
            Collections.sort(arrayList);
            treeSet.addAll(arrayList);
            return DesugarCollections.unmodifiableList(new ArrayList(treeSet));
        } catch (btc e) {
            if (f()) {
                return null;
            }
            throw e;
        }
    }

    @Override // defpackage.chi
    public final void b(Object obj) {
        chf chfVar = this.b;
        if (chfVar.a == this) {
            if (chfVar.g) {
                return;
            }
            SystemClock.uptimeMillis();
            chfVar.a = null;
            chfVar.b((List) obj);
            return;
        }
        chfVar.c(this);
    }

    @Override // defpackage.chi
    public final void c() {
        this.b.c(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = false;
        this.b.a();
    }
}
