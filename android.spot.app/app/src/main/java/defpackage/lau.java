package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lau extends lap {
    public final laq a;
    public final sn b = new sn(5);
    private final ReadWriteLock d = new ReentrantReadWriteLock();
    public final Executor c = Executors.newCachedThreadPool();

    public lau(laq laqVar) {
        this.a = laqVar;
    }

    public final Set c(int i) {
        Integer num;
        sn snVar;
        HashSet hashSet;
        this.d.readLock().lock();
        sn snVar2 = this.b;
        Integer valueOf = Integer.valueOf(i);
        Set set = (Set) snVar2.b(valueOf);
        this.d.readLock().unlock();
        if (set == null) {
            this.d.writeLock().lock();
            set = (Set) this.b.b(valueOf);
            if (set == null) {
                laq laqVar = this.a;
                sn snVar3 = this.b;
                double d = 2.0d;
                double pow = 100.0d / Math.pow(2.0d, i);
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                double d2 = pow / 256.0d;
                synchronized (((las) laqVar).c) {
                    Iterator it = ((las) laqVar).b.iterator();
                    while (it.hasNext()) {
                        lar larVar = (lar) it.next();
                        if (!hashSet2.contains(larVar)) {
                            lbm lbmVar = larVar.a;
                            double d3 = d2 / d;
                            double d4 = d2;
                            double d5 = lbmVar.a;
                            double d6 = d5 - d3;
                            double d7 = d5 + d3;
                            double d8 = lbmVar.b;
                            lbl lblVar = new lbl(d6, d7, d8 - d3, d8 + d3);
                            lbp lbpVar = ((las) laqVar).c;
                            ArrayList arrayList = new ArrayList();
                            lbpVar.a(lblVar, arrayList);
                            if (arrayList.size() == 1) {
                                hashSet3.add(larVar);
                                hashSet2.add(larVar);
                                hashMap.put(larVar, Double.valueOf(0.0d));
                            } else {
                                law lawVar = new law(larVar.b.n());
                                hashSet3.add(lawVar);
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    lar larVar2 = (lar) it2.next();
                                    Double d9 = (Double) hashMap.get(larVar2);
                                    laq laqVar2 = laqVar;
                                    lbm lbmVar2 = larVar2.a;
                                    Iterator it3 = it2;
                                    lbm lbmVar3 = larVar.a;
                                    Iterator it4 = it;
                                    lar larVar3 = larVar;
                                    Integer num2 = valueOf;
                                    double d10 = lbmVar2.a - lbmVar3.a;
                                    sn snVar4 = snVar3;
                                    HashSet hashSet4 = hashSet3;
                                    double d11 = lbmVar2.b - lbmVar3.b;
                                    double d12 = (d10 * d10) + (d11 * d11);
                                    if (d9 != null) {
                                        if (d9.doubleValue() >= d12) {
                                            ((law) hashMap2.get(larVar2)).a.remove(larVar2.b);
                                        } else {
                                            it2 = it3;
                                            snVar3 = snVar4;
                                            laqVar = laqVar2;
                                            it = it4;
                                            larVar = larVar3;
                                            valueOf = num2;
                                            hashSet3 = hashSet4;
                                        }
                                    }
                                    hashMap.put(larVar2, Double.valueOf(d12));
                                    lawVar.a.add(larVar2.b);
                                    hashMap2.put(larVar2, lawVar);
                                    it2 = it3;
                                    snVar3 = snVar4;
                                    laqVar = laqVar2;
                                    it = it4;
                                    larVar = larVar3;
                                    valueOf = num2;
                                    hashSet3 = hashSet4;
                                }
                                hashSet2.addAll(arrayList);
                                snVar3 = snVar3;
                                laqVar = laqVar;
                                it = it;
                                valueOf = valueOf;
                                hashSet3 = hashSet3;
                            }
                            d2 = d4;
                            d = 2.0d;
                        }
                    }
                    num = valueOf;
                    snVar = snVar3;
                    hashSet = hashSet3;
                }
                snVar.c(num, hashSet);
                set = hashSet;
            }
            this.d.writeLock().unlock();
        }
        return set;
    }

    public final void d() {
        this.b.d(-1);
    }
}
