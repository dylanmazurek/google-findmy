package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kgh {
    public final Class a;
    public kgi d;
    public Map b = new HashMap();
    public final List c = new ArrayList();
    public kfr e = kfr.a;

    public kgh(Class cls) {
        this.a = cls;
    }

    public final void a(Object obj, kjj kjjVar, boolean z) {
        byte[] c;
        int i;
        if (this.b != null) {
            int I = a.I(kjjVar.c);
            if (I != 0 && I == 3) {
                kjr b = kjr.b(kjjVar.e);
                if (b == null) {
                    b = kjr.UNRECOGNIZED;
                }
                int ordinal = b.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                throw new GeneralSecurityException("unknown output prefix type");
                            }
                        } else {
                            c = jzx.a;
                        }
                    }
                    c = kgb.a(kjjVar.d).c();
                } else {
                    c = kgb.b(kjjVar.d).c();
                }
                knb b2 = knb.b(c);
                int I2 = a.I(kjjVar.c);
                if (I2 == 0) {
                    i = 1;
                } else {
                    i = I2;
                }
                kjr b3 = kjr.b(kjjVar.e);
                if (b3 == null) {
                    b3 = kjr.UNRECOGNIZED;
                }
                kjr kjrVar = b3;
                int i2 = kjjVar.d;
                kjh kjhVar = kjjVar.b;
                if (kjhVar == null) {
                    kjhVar = kjh.d;
                }
                kgi kgiVar = new kgi(obj, b2, i, kjrVar, i2, kjhVar.a);
                Map map = this.b;
                List list = this.c;
                ArrayList arrayList = new ArrayList();
                arrayList.add(kgiVar);
                List list2 = (List) map.put(kgiVar.b, DesugarCollections.unmodifiableList(arrayList));
                if (list2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(list2);
                    arrayList2.add(kgiVar);
                    map.put(kgiVar.b, DesugarCollections.unmodifiableList(arrayList2));
                }
                list.add(kgiVar);
                if (z) {
                    if (this.d == null) {
                        this.d = kgiVar;
                        return;
                    }
                    throw new IllegalStateException("you cannot set two primary primitives");
                }
                return;
            }
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        throw new IllegalStateException("addEntry cannot be called after build");
    }
}
