package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lsp implements lsh {
    public static final lsh a = lsi.b(Collections.emptySet());
    private final List b;
    private final List c;

    public lsp(List list, List list2) {
        this.b = list;
        this.c = list2;
    }

    @Override // defpackage.mko, defpackage.mkn
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Set a() {
        List list = this.c;
        int size = this.b.size();
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = this.c.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((lsm) this.c.get(i)).a();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(iqg.A(size));
        int size3 = this.b.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object a2 = ((lsm) this.b.get(i2)).a();
            a2.getClass();
            hashSet.add(a2);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                obj.getClass();
                hashSet.add(obj);
            }
        }
        return DesugarCollections.unmodifiableSet(hashSet);
    }
}
