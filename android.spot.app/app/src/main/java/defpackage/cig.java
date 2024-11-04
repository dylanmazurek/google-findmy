package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cig {
    public Executor b;
    public Executor c;
    public ckf d;
    public boolean e;
    public boolean g;
    private final mql i;
    private final Context j;
    private final String k;
    private Set n;
    public final List a = new ArrayList();
    private final List l = new ArrayList();
    private final List m = new ArrayList();
    public boolean f = true;
    private final ddh o = new ddh((short[]) null);
    public final Set h = new LinkedHashSet();

    public cig(Context context, Class cls, String str) {
        this.i = moz.c(cls);
        this.j = context;
        this.k = str;
    }

    /* JADX WARN: Type inference failed for: r5v20, types: [java.util.Map, java.lang.Object] */
    public final cih a() {
        ActivityManager activityManager;
        cij cijVar;
        lbr lbrVar;
        Executor executor = this.b;
        if (executor == null && this.c == null) {
            Executor executor2 = pu.a;
            this.c = executor2;
            this.b = executor2;
        } else if (executor != null && this.c == null) {
            this.c = executor;
        } else if (executor == null) {
            this.b = this.c;
        }
        Set set = this.n;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (this.h.contains(Integer.valueOf(intValue))) {
                    throw new IllegalArgumentException(a.ae(intValue, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: "));
                }
            }
        }
        ckf ckfVar = this.d;
        if (ckfVar == null) {
            ckfVar = new ckq();
        }
        ckf ckfVar2 = ckfVar;
        Context context = this.j;
        String str = this.k;
        ddh ddhVar = this.o;
        List list = this.a;
        boolean z = this.e;
        Object systemService = context.getSystemService("activity");
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        int i = 2;
        if (activityManager != null && !activityManager.isLowRamDevice()) {
            i = 3;
        }
        Executor executor3 = this.b;
        if (executor3 != null) {
            Executor executor4 = this.c;
            if (executor4 != null) {
                chj chjVar = new chj(context, str, ckfVar2, ddhVar, list, z, i, executor3, executor4, this.f, this.g, this.h, this.l, this.m);
                cih cihVar = (cih) bwx.i(moz.a(this.i));
                try {
                    cijVar = cihVar.c();
                } catch (mkv unused) {
                    cijVar = null;
                }
                if (cijVar == null) {
                    lbrVar = new lbr(chjVar, new bco(cihVar, 11));
                } else {
                    lbrVar = new lbr(chjVar, (cii) cijVar);
                }
                cihVar.h = lbrVar;
                cihVar.e = cihVar.a();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Set i2 = cihVar.i();
                ArrayList arrayList = new ArrayList(mkm.ap(i2));
                Iterator it2 = i2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(moz.c((Class) it2.next()));
                }
                Set aj = mkm.aj(arrayList);
                boolean[] zArr = new boolean[aj.size()];
                Iterator it3 = aj.iterator();
                while (true) {
                    int i3 = -1;
                    if (it3.hasNext()) {
                        mql mqlVar = (mql) it3.next();
                        int size = chjVar.l.size() - 1;
                        if (size >= 0) {
                            while (true) {
                                int i4 = size - 1;
                                Class<?> cls = chjVar.l.get(size).getClass();
                                int i5 = mpo.a;
                                if (bwx.h(mqlVar, new mox(cls))) {
                                    zArr[size] = true;
                                    i3 = size;
                                    break;
                                }
                                if (i4 < 0) {
                                    break;
                                }
                                size = i4;
                            }
                        }
                        if (i3 >= 0) {
                            linkedHashMap.put(mqlVar, chjVar.l.get(i3));
                        } else {
                            throw new IllegalArgumentException("A required auto migration spec (" + mqlVar.b() + ") is missing in the database configuration.");
                        }
                    } else {
                        int size2 = chjVar.l.size() - 1;
                        if (size2 >= 0) {
                            while (true) {
                                int i6 = size2 - 1;
                                if (zArr[size2]) {
                                    if (i6 < 0) {
                                        break;
                                    }
                                    size2 = i6;
                                } else {
                                    throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(mkm.H(linkedHashMap.size()));
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            linkedHashMap2.put(moz.a((mql) entry.getKey()), entry.getValue());
                        }
                        for (cjj cjjVar : cihVar.t()) {
                            ddh ddhVar2 = chjVar.n;
                            int i7 = cjjVar.a;
                            int i8 = cjjVar.b;
                            Integer valueOf = Integer.valueOf(i7);
                            ?? r5 = ddhVar2.a;
                            if (r5.containsKey(valueOf)) {
                                Map map = (Map) r5.get(valueOf);
                                if (map == null) {
                                    map = mly.a;
                                }
                                if (!map.containsKey(Integer.valueOf(i8))) {
                                }
                            }
                            chjVar.n.m(cjjVar);
                        }
                        Set<Map.Entry> entrySet = cihVar.h().entrySet();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(moz.ac(mkm.H(mkm.ap(entrySet)), 16));
                        for (Map.Entry entry2 : entrySet) {
                            Class cls2 = (Class) entry2.getKey();
                            List list2 = (List) entry2.getValue();
                            mql c = moz.c(cls2);
                            ArrayList arrayList2 = new ArrayList(mkm.ap(list2));
                            Iterator it4 = list2.iterator();
                            while (it4.hasNext()) {
                                arrayList2.add(moz.c((Class) it4.next()));
                            }
                            mkw mkwVar = new mkw(c, arrayList2);
                            linkedHashMap3.put(mkwVar.a, mkwVar.b);
                        }
                        boolean[] zArr2 = new boolean[linkedHashMap3.size()];
                        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                            mql mqlVar2 = (mql) entry3.getKey();
                            for (mql mqlVar3 : (List) entry3.getValue()) {
                                int size3 = chjVar.k.size() - 1;
                                if (size3 >= 0) {
                                    while (true) {
                                        int i9 = size3 - 1;
                                        Class<?> cls3 = chjVar.k.get(size3).getClass();
                                        int i10 = mpo.a;
                                        if (bwx.h(mqlVar3, new mox(cls3))) {
                                            zArr2[size3] = true;
                                            break;
                                        }
                                        if (i9 < 0) {
                                            break;
                                        }
                                        size3 = i9;
                                    }
                                }
                                size3 = -1;
                                if (size3 >= 0) {
                                    Object obj = chjVar.k.get(size3);
                                    mqlVar3.getClass();
                                    obj.getClass();
                                    cihVar.g.put(mqlVar3, obj);
                                } else {
                                    throw new IllegalArgumentException("A required type converter (" + mqlVar3 + ") for " + mqlVar2.b() + " is missing in the database configuration.");
                                }
                            }
                        }
                        int size4 = chjVar.k.size() - 1;
                        if (size4 >= 0) {
                            while (true) {
                                int i11 = size4 - 1;
                                if (zArr2[size4]) {
                                    if (i11 < 0) {
                                        break;
                                    }
                                    size4 = i11;
                                } else {
                                    throw new IllegalArgumentException("Unexpected type converter " + chjVar.k.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                }
                            }
                        }
                        lbr lbrVar2 = cihVar.h;
                        if (lbrVar2 == null) {
                            mpd.b("connectionManager");
                            lbrVar2 = null;
                        }
                        if (((cjl) cihVar.g(cjl.class, lbrVar2.e())) == null) {
                            lbr lbrVar3 = cihVar.h;
                            if (lbrVar3 == null) {
                                mpd.b("connectionManager");
                                lbrVar3 = null;
                            }
                            if (((cjk) cihVar.g(cjk.class, lbrVar3.e())) == null) {
                                cihVar.c = chjVar.f;
                                cihVar.d = new cxd(chjVar.g, 1, null);
                                Executor executor5 = cihVar.c;
                                if (executor5 == null) {
                                    mpd.b("internalQueryExecutor");
                                    executor5 = null;
                                }
                                cihVar.b = msz.m(mkm.aH(executor5).plus(new mva(null)));
                                msw mswVar = cihVar.b;
                                if (mswVar == null) {
                                    mpd.b("coroutineScope");
                                    mswVar = null;
                                }
                                Executor executor6 = cihVar.d;
                                if (executor6 == null) {
                                    mpd.b("internalTransactionExecutor");
                                    executor6 = null;
                                }
                                ((naj) mswVar).a.plus(mkm.aH(executor6));
                                cihVar.f = chjVar.e;
                                return cihVar;
                            }
                            throw null;
                        }
                        throw null;
                    }
                }
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public final void b(cjj... cjjVarArr) {
        if (this.n == null) {
            this.n = new HashSet();
        }
        cjj cjjVar = cjjVarArr[0];
        Set set = this.n;
        set.getClass();
        set.add(Integer.valueOf(cjjVar.a));
        Set set2 = this.n;
        set2.getClass();
        set2.add(Integer.valueOf(cjjVar.b));
        ddh ddhVar = this.o;
        cjj[] cjjVarArr2 = (cjj[]) Arrays.copyOf(cjjVarArr, 1);
        cjjVarArr2.getClass();
        for (cjj cjjVar2 : cjjVarArr2) {
            ddhVar.m(cjjVar2);
        }
    }

    @mkp
    public final void c() {
        this.f = true;
        this.g = true;
    }
}
