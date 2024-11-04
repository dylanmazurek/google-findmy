package defpackage;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class koa implements knv, kpo {
    private static final kqz c = new kok(1);
    private final List f;
    private final kof h;
    private final knx i;
    public final Map a = new HashMap();
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    private Set g = new HashSet();
    public final AtomicReference b = new AtomicReference();

    public koa(Executor executor, Iterable iterable, Collection collection, knx knxVar) {
        kof kofVar = new kof(executor);
        this.h = kofVar;
        this.i = knxVar;
        ArrayList<knu> arrayList = new ArrayList();
        int i = 0;
        arrayList.add(knu.e(kofVar, kof.class, kqf.class, kqe.class));
        arrayList.add(knu.e(this, kpo.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            knu knuVar = (knu) it.next();
            if (knuVar != null) {
                arrayList.add(knuVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next());
        }
        this.f = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((kqz) it3.next()).a();
                    if (componentRegistrar != null) {
                        ArrayList arrayList4 = new ArrayList();
                        for (knu knuVar2 : componentRegistrar.getComponents()) {
                            String str = knuVar2.a;
                            if (str != null) {
                                knuVar2 = new knu(str, knuVar2.b, knuVar2.c, knuVar2.d, knuVar2.e, new ktj(str, knuVar2, 0), knuVar2.g);
                            }
                            arrayList4.add(knuVar2);
                        }
                        arrayList.addAll(arrayList4);
                        it3.remove();
                    }
                } catch (kog e) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Object[] array = ((knu) it4.next()).b.toArray();
                int length = array.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        Object obj = array[i2];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.g.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.g.add(obj.toString());
                        }
                        i2++;
                    }
                }
            }
            if (this.a.isEmpty()) {
                kne.f(arrayList);
            } else {
                ArrayList arrayList5 = new ArrayList(this.a.keySet());
                arrayList5.addAll(arrayList);
                kne.f(arrayList5);
            }
            for (knu knuVar3 : arrayList) {
                this.a.put(knuVar3, new koh(new kny(this, knuVar3, i)));
            }
            ArrayList arrayList6 = new ArrayList();
            for (knu knuVar4 : arrayList) {
                if (knuVar4.f()) {
                    kqz kqzVar = (kqz) this.a.get(knuVar4);
                    for (kon konVar : knuVar4.b) {
                        if (!this.d.containsKey(konVar)) {
                            this.d.put(konVar, kqzVar);
                        } else {
                            arrayList6.add(new hka((kol) ((kqz) this.d.get(konVar)), kqzVar, 20));
                        }
                    }
                }
            }
            arrayList3.addAll(arrayList6);
            ArrayList arrayList7 = new ArrayList();
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : this.a.entrySet()) {
                knu knuVar5 = (knu) entry.getKey();
                if (!knuVar5.f()) {
                    kqz kqzVar2 = (kqz) entry.getValue();
                    for (kon konVar2 : knuVar5.b) {
                        if (!hashMap.containsKey(konVar2)) {
                            hashMap.put(konVar2, new HashSet());
                        }
                        ((Set) hashMap.get(konVar2)).add(kqzVar2);
                    }
                }
            }
            for (Map.Entry entry2 : hashMap.entrySet()) {
                if (!this.e.containsKey(entry2.getKey())) {
                    this.e.put((kon) entry2.getKey(), koi.b((Collection) entry2.getValue()));
                } else {
                    koi koiVar = (koi) this.e.get(entry2.getKey());
                    Iterator it5 = ((Set) entry2.getValue()).iterator();
                    while (it5.hasNext()) {
                        arrayList7.add(new koq(koiVar, (kqz) it5.next(), 1));
                    }
                }
            }
            arrayList3.addAll(arrayList7);
            for (knu knuVar6 : this.a.keySet()) {
                for (koc kocVar : knuVar6.c) {
                    if (kocVar.b() && !this.e.containsKey(kocVar.a)) {
                        this.e.put(kocVar.a, koi.b(Collections.emptySet()));
                    } else if (this.d.containsKey(kocVar.a)) {
                        continue;
                    } else if (kocVar.b != 1) {
                        if (!kocVar.b()) {
                            this.d.put(kocVar.a, new kol(kol.a));
                        }
                    } else {
                        throw new koj(String.format("Unsatisfied dependency for component %s: %s", knuVar6, kocVar.a));
                    }
                }
            }
        }
        int size = arrayList3.size();
        while (i < size) {
            ((Runnable) arrayList3.get(i)).run();
            i++;
        }
        Boolean bool = (Boolean) this.b.get();
        if (bool != null) {
            Map map = this.a;
            bool.booleanValue();
            f(map);
        }
    }

    @Override // defpackage.knv
    public final synchronized kqz a(kon konVar) {
        return (kqz) this.d.get(konVar);
    }

    @Override // defpackage.knv
    public final /* synthetic */ kqz b(Class cls) {
        return kne.j(this, cls);
    }

    @Override // defpackage.knv
    public final synchronized kqz c(kon konVar) {
        koi koiVar = (koi) this.e.get(konVar);
        if (koiVar != null) {
            return koiVar;
        }
        return c;
    }

    @Override // defpackage.knv
    public final /* synthetic */ Object d(kon konVar) {
        throw null;
    }

    @Override // defpackage.knv
    public final /* synthetic */ Object e(Class cls) {
        return kne.l(this, cls);
    }

    public final void f(Map map) {
        Queue<kqd> queue;
        for (Map.Entry entry : map.entrySet()) {
            knu knuVar = (knu) entry.getKey();
            kqz kqzVar = (kqz) entry.getValue();
            if (knuVar.d == 1) {
                kqzVar.a();
            }
        }
        kof kofVar = this.h;
        synchronized (kofVar) {
            queue = kofVar.a;
            if (queue != null) {
                kofVar.a = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (kqd kqdVar : queue) {
                kne.y(kqdVar);
                synchronized (kofVar) {
                    Queue queue2 = kofVar.a;
                    if (queue2 != null) {
                        queue2.add(kqdVar);
                    } else {
                        for (Map.Entry entry2 : kofVar.a()) {
                            ((Executor) entry2.getValue()).execute(new jxe(entry2, 4));
                        }
                    }
                }
            }
        }
    }
}
