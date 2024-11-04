package defpackage;

import java.util.AbstractSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mls extends AbstractSet implements Set, mpt {
    public abstract int c();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return c();
    }
}
