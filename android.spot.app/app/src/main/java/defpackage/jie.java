package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jie extends jhu implements Set {
    @Override // defpackage.jhu
    protected /* bridge */ /* synthetic */ Collection a() {
        throw null;
    }

    protected abstract Set b();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj != this && !b().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return b().hashCode();
    }
}
