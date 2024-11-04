package defpackage;

import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nla extends mln implements RandomAccess {
    public static final moz c = new moz();
    public final nks[] a;
    public final int[] b;

    public nla(nks[] nksVarArr, int[] iArr) {
        this.a = nksVarArr;
        this.b = iArr;
    }

    @Override // defpackage.mlj
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.mlj, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof nks)) {
            return false;
        }
        return super.contains((nks) obj);
    }

    @Override // defpackage.mln, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.a[i];
    }

    @Override // defpackage.mln, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof nks)) {
            return -1;
        }
        return super.indexOf((nks) obj);
    }

    @Override // defpackage.mln, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof nks)) {
            return -1;
        }
        return super.lastIndexOf((nks) obj);
    }
}
