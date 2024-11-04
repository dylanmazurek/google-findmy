package androidx.work;

import defpackage.box;
import defpackage.cpn;
import defpackage.cpv;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OverwritingInputMerger extends cpv {
    @Override // defpackage.cpv
    public final cpn a(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashMap2.putAll(((cpn) it.next()).c());
        }
        box.k(linkedHashMap2, linkedHashMap);
        return box.i(linkedHashMap);
    }
}
