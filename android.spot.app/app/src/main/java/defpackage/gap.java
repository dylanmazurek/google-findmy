package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gap implements lyw {
    private static final fzo b = new fzo();
    private final gau a;

    public gap(gau gauVar) {
        this.a = gauVar;
    }

    @Override // defpackage.lyw
    public final lyv a(mbg mbgVar, lys lysVar, lyt lytVar) {
        ArrayList arrayList;
        fzo fzoVar = b;
        Collection collection = (Collection) lysVar.e(mco.c);
        if (collection == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(collection);
        }
        gau gauVar = this.a;
        arrayList.add(fzoVar);
        return gauVar.a(mbgVar, lysVar.d(mco.c, DesugarCollections.unmodifiableList(arrayList)), lytVar);
    }
}
