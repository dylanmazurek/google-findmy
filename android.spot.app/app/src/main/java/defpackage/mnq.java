package defpackage;

import j$.util.List;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mnq extends mln implements Serializable, List, java.util.List, mpq {
    private final Enum[] a;

    public mnq(Enum[] enumArr) {
        this.a = enumArr;
    }

    private final Object writeReplace() {
        return new mnr(this.a);
    }

    @Override // defpackage.mlj
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.mlj, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        r4.getClass();
        if (mkm.k(this.a, r4.ordinal()) != r4) {
            return false;
        }
        return true;
    }

    @Override // defpackage.mln, java.util.List
    public final /* synthetic */ Object get(int i) {
        a.t(i, this.a.length);
        return this.a[i];
    }

    @Override // defpackage.mln, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        r4.getClass();
        Enum[] enumArr = this.a;
        int ordinal = r4.ordinal();
        if (mkm.k(enumArr, ordinal) != r4) {
            return -1;
        }
        return ordinal;
    }

    @Override // defpackage.mln, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r2 = (Enum) obj;
        r2.getClass();
        return indexOf(r2);
    }
}
