package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mix {
    final boolean a;
    final List b;
    final Collection c;
    final Collection d;
    public final int e;
    final mja f;
    final boolean g;
    final boolean h;

    public mix(List list, Collection collection, Collection collection2, mja mjaVar, boolean z, boolean z2, boolean z3, int i) {
        boolean z4;
        boolean z5;
        boolean z6;
        this.b = list;
        collection.getClass();
        this.c = collection;
        this.f = mjaVar;
        this.d = collection2;
        this.g = z;
        this.a = z2;
        this.h = z3;
        this.e = i;
        if (z2 && list != null) {
            z4 = false;
        } else {
            z4 = true;
        }
        hwx.V(z4, "passThrough should imply buffer is null");
        if (z2 && mjaVar == null) {
            z5 = false;
        } else {
            z5 = true;
        }
        hwx.V(z5, "passThrough should imply winningSubstream != null");
        if (z2 && ((collection.size() != 1 || !collection.contains(mjaVar)) && (collection.size() != 0 || !mjaVar.b))) {
            z6 = false;
        } else {
            z6 = true;
        }
        hwx.V(z6, "passThrough should imply winningSubstream is drained");
        hwx.V((z && mjaVar == null) ? false : true, "cancelled should imply committed");
    }

    public final mix a(mja mjaVar) {
        boolean z;
        Collection unmodifiableCollection;
        hwx.V(!this.h, "hedging frozen");
        if (this.f == null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "already committed");
        Collection collection = this.d;
        if (collection == null) {
            unmodifiableCollection = Collections.singleton(mjaVar);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(mjaVar);
            unmodifiableCollection = DesugarCollections.unmodifiableCollection(arrayList);
        }
        return new mix(this.b, this.c, unmodifiableCollection, this.f, this.g, this.a, this.h, this.e + 1);
    }

    public final mix b() {
        if (this.h) {
            return this;
        }
        return new mix(this.b, this.c, this.d, this.f, this.g, this.a, true, this.e);
    }

    public final mix c(mja mjaVar) {
        Collection unmodifiableCollection;
        boolean z;
        boolean z2 = true;
        hwx.V(!this.a, "Already passThrough");
        if (mjaVar.b) {
            unmodifiableCollection = this.c;
        } else if (this.c.isEmpty()) {
            unmodifiableCollection = Collections.singletonList(mjaVar);
        } else {
            ArrayList arrayList = new ArrayList(this.c);
            arrayList.add(mjaVar);
            unmodifiableCollection = DesugarCollections.unmodifiableCollection(arrayList);
        }
        Collection collection = unmodifiableCollection;
        mja mjaVar2 = this.f;
        if (mjaVar2 != null) {
            z = true;
        } else {
            z = false;
        }
        List list = this.b;
        if (z) {
            if (mjaVar2 != mjaVar) {
                z2 = false;
            }
            hwx.V(z2, "Another RPC attempt has already committed");
            list = null;
        }
        return new mix(list, collection, this.d, this.f, this.g, z, this.h, this.e);
    }
}
