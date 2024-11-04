package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hww {
    public final boolean a;
    public final Object b;
    public final Object c;
    public final Object d;

    public hww(boolean z, Set set, hxr hxrVar, hxr hxrVar2) {
        this.a = z;
        this.b = set;
        this.c = hxrVar;
        this.d = hxrVar2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [hxr, java.lang.Object] */
    public final Object a(String str, String str2) {
        try {
            return this.c.a(str2);
        } catch (IOException | IllegalArgumentException e) {
            Log.e("PhenotypeCombinedFlags", "Invalid Phenotype flag value for flag ".concat(str), e);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final hxc b(final hvq hvqVar, final String str) {
        hnu hnuVar = hxc.j;
        a.q(hvqVar.f, new hkn(18));
        final boolean z = this.a;
        final ?? r3 = this.b;
        jfe jfeVar = new jfe() { // from class: hxb
            @Override // defpackage.jfe
            public final Object a() {
                return new hxc(hvq.this, str, z, r3);
            }
        };
        jes jesVar = new jes(str, "");
        Object obj = (hxc) hnuVar.a.get(jesVar);
        if (obj == null) {
            obj = jfeVar.a();
            hxc hxcVar = (hxc) hnuVar.a.putIfAbsent(jesVar, obj);
            if (hxcVar == null) {
                Context context = hvqVar.c;
                hxm.c.putIfAbsent(jesVar, new njz(obj));
                if (!hxm.b) {
                    synchronized (hxm.a) {
                        if (!hxm.b && !Objects.equals(context.getPackageName(), "com.google.android.gms")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                context.registerReceiver(new hxm(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                            } else {
                                context.registerReceiver(new hxm(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                            }
                            hxm.b = true;
                        }
                    }
                }
                hxg.a.putIfAbsent(jesVar, new hnn(obj, 18));
            } else {
                obj = hxcVar;
            }
        }
        hxc hxcVar2 = (hxc) obj;
        boolean z2 = hxcVar2.e;
        hwx.O(true, "Package %s cannot be registered both with and without stickyAccountSupport", str);
        return hxcVar2;
    }

    public hww(byte[] bArr, boolean z, List list) {
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.emptyMap();
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dfl dflVar = (dfl) it.next();
                treeMap.put(dflVar.a, dflVar.b);
            }
        }
        this.b = bArr;
        this.c = treeMap;
        if (list == null) {
            this.d = null;
        } else {
            this.d = DesugarCollections.unmodifiableList(list);
        }
        this.a = z;
    }
}
